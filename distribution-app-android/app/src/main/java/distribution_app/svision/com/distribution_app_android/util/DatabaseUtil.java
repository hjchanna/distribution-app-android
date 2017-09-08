package distribution_app.svision.com.distribution_app_android.util;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import distribution_app.svision.com.distribution_app_android.R;

/**
 * Created by ChannaJ on 9/8/2017.
 */
public class DatabaseUtil extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "distribution-db";
    private static final Integer DATABASE_VERSION = 1;

    private final Context context;

    public DatabaseUtil(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.d("DatabaseUtil", "Start onCreate");

        InputStream inputStream = this.context.getResources().openRawResource(R.raw.database);
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String line;

        StringBuilder builder = new StringBuilder();
        try {
            while ((line = reader.readLine()) != null) {
                builder.append(line);
                builder.append(System.getProperty("line.separator"));
            }
            String rawQueries = builder.toString();

            String[] queries = rawQueries.split(";");
            for (String query : queries) {
                db.execSQL(query);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onCreate(db);
    }
}
