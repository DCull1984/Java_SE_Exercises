package com.SpringTest.Cull_David.SpringTestRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringTest.Cull_David.SpringTestModel.SpringTestDataModel;

@Repository
public interface SpringTestRepository extends JpaRepository<SpringTestDataModel, Long>
{

}
