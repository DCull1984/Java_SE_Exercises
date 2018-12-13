package com.SpringGarage.Cull_David.GarageController;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringGarage.Cull_David.GarageExceptions.ResourceNotFoundException;
import com.SpringGarage.Cull_David.GarageModel.GarageDataModel;
import com.SpringGarage.Cull_David.GarageRepository.GarageRepository;

@RestController
@RequestMapping("/api")
public class GarageController 
{
		@Autowired
		GarageRepository garageStore;
		
		//Method to create a vehicle
		@PostMapping("/vehicle")
		public GarageDataModel createVehicle(@Valid @RequestBody GarageDataModel mVehicle)
		{
			return garageStore.save(mVehicle);
		}
		
		//Method to get a vehicle
		@GetMapping("/vehicle/{id}")
		public GarageDataModel getVehiclebyID(@PathVariable(value = "id")Long mVehicleID)
		{
			return garageStore.findById(mVehicleID).orElseThrow(()-> 
			new ResourceNotFoundException("GarageDataModel", "Type", mVehicleID));
		}

		@GetMapping("/search/{type}")
		public List<GarageDataModel> getVehicleByType(@PathVariable(value = "type")String pType)
		{
			return garageStore.findByType(pType);
		}
	
		//Method to get all vehicles
		@GetMapping("/vehicle")
		public List<GarageDataModel>getAllVehicle()
		{
			return garageStore.findAll();
		}
		
		//Method to update a vehicle
		@PutMapping("/vehicle/{id}")
		public GarageDataModel updateGarage(@PathVariable(value = "id") Long mVehicleID,
				@Valid @RequestBody GarageDataModel vehicleDetails)
		{
			GarageDataModel garage = garageStore.findById(mVehicleID).orElseThrow(()-> 
			new ResourceNotFoundException("Vehicle", "id", mVehicleID));
			
			garage.setType(vehicleDetails.getType());
			garage.setMake(vehicleDetails.getMake());
			garage.setModel(vehicleDetails.getModel());
			garage.setColour(vehicleDetails.getColour());
			garage.setEngineCapacity(vehicleDetails.getEngineCapacity());
			
			GarageDataModel updateData = garageStore.save(garage);
			
			return updateData;
		}
		
		//Method to remove a vehicle
		@DeleteMapping("/vehicle/{id}")
		public ResponseEntity<?> deleteVehicle(@PathVariable(value = "id") Long mVehicleID)
		{
			GarageDataModel garage = garageStore.findById(mVehicleID).orElseThrow(()->
			new ResourceNotFoundException("Vehicle", "id", mVehicleID));
			
			garageStore.delete(garage);
			
			return ResponseEntity.ok().build();
		}
		
		/*@DeleteMapping("/vehicle/{make}")
		public ResponseEntity<?> deleteByType(@PathVariable (value = "type")String pMake)
		{
			List<GarageDataModel> deleteByMake = garageStore.findByMake(pMake);
			
			garageStore.deleteAll(deleteByMake);
			
			return ResponseEntity.ok().build();
		}*/
}
