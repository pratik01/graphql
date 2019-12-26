package com.techshard.graphql.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techshard.graphql.dao.entity.Vehicle;
import com.techshard.graphql.service.VehicleService;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {

	@Autowired
	private VehicleService vehicleService;
	
	@GetMapping
	public List<Vehicle> findAll(){
		return vehicleService.getAllVehicles(10);
	}
}
