package com.techshard.graphql.mutation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.techshard.graphql.dao.entity.Vehicle;
import com.techshard.graphql.service.VehicleService;

@Component
public class VehicleMutation implements GraphQLMutationResolver {

	@Autowired
	private VehicleService vehicleService;

	public Vehicle createVehicle(Vehicle entity) {
		return this.vehicleService.createVehicle(entity);
	}
}
