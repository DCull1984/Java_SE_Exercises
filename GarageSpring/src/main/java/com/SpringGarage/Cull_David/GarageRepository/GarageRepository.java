package com.SpringGarage.Cull_David.GarageRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringGarage.Cull_David.GarageModel.GarageDataModel;

@Repository
public interface GarageRepository extends JpaRepository<GarageDataModel, Long>
{
	//GarageDataModel searchByType(String iType);
	//GarageDataModel searchByMake(String iMake);
	//GarageDataModel SearchByModel(String iModel);

	
}
