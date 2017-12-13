/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supervision.distribution_app.service;

import com.supervision.distribution_app.model.StkLegerTour;
import com.supervision.distribution_app.repository.TourStockRepository;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author kalum
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS ,readOnly = true)
public class TourStockService {

    @Autowired
    private TourStockRepository tourStockRepository;

    public List<StkLegerTour> getAlltourStockByTNoAndStklDate(String vehicle, Date date) {
        return tourStockRepository.getAlltourStockByTNoAndStklDate(vehicle,date);
    }
    
}
