/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supervision.distribution_app.repository;

import com.supervision.distribution_app.model.StkLegerTour;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author kalum
 */
public interface TourStockRepository extends JpaRepository<StkLegerTour, Integer> {

    public List<StkLegerTour> getAlltourStockByTNoAndStklDate(String vehicle, Date date);
    
}
