package com.SpringGarage.Cull_David.GarageRepository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringGarage.Cull_David.GarageModel.GarageDataModel;

@Repository
public interface GarageRepository extends JpaRepository<GarageDataModel, Long>
{
	List<GarageDataModel> findByType(String pType);

	

}
