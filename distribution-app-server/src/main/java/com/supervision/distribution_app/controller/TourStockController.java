/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supervision.distribution_app.controller;

import com.supervision.distribution_app.model.StkLegerTour;
import com.supervision.distribution_app.service.TourStockService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author kalum
 */
@CrossOrigin
@RestController
@RequestMapping("/api/v1/distribution-app/stock-tour")
public class TourStockController {
    
    @Autowired
    private TourStockService tourStockService;
    
    @RequestMapping(value = "/by-vehicle-no-and-date/{vehicle}/{date}" , method = RequestMethod.GET)
    public List<StkLegerTour> getAlltourStockByVehicleAndDate(@PathVariable ("vehicle") String vehicle, @PathVariable ("date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date){
       return tourStockService.getAlltourStockByTNoAndStklDate(vehicle,date);
    }
    
}
