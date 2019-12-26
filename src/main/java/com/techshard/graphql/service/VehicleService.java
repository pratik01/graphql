package com.techshard.graphql.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.techshard.graphql.dao.entity.Vehicle;
import com.techshard.graphql.dao.repository.VehicleRepository;

@Service
public class VehicleService {

	private final VehicleRepository vehicleRepository;

	public VehicleService(final VehicleRepository vehicleRepository) {
		this.vehicleRepository = vehicleRepository;
	}

	@Transactional
	public Vehicle createVehicle(Vehicle entity) {
		return this.vehicleRepository.save(entity);
	}

	@Transactional
	public List<Vehicle> getAllVehicles(final int count) {
		return this.vehicleRepository.findAll().stream().limit(count).collect(Collectors.toList());
	}

	@Transactional(readOnly = true)
	public Optional<Vehicle> getVehicle(final int id) {
		return this.vehicleRepository.findById(id);
	}
}
