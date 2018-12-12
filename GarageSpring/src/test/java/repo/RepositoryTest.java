package repo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.SpringGarage.Cull_David.GarageSpringApplication;
import com.SpringGarage.Cull_David.GarageExceptions.ResourceNotFoundException;
import com.SpringGarage.Cull_David.GarageModel.GarageDataModel;
import com.SpringGarage.Cull_David.GarageRepository.GarageRepository;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {GarageSpringApplication.class})
@DataJpaTest
public class RepositoryTest 
{
	@Autowired
	private TestEntityManager entityManager;
	
	@Autowired
	private GarageRepository repositoryTest;
	
	@Test
	public void retrieveByIdTest()
	{
		GarageDataModel modelTest = new GarageDataModel("Car", "Ford", "Escort", "White", 1400);
		entityManager.persist(modelTest);
		entityManager.flush();
		assertTrue(repositoryTest.findById(modelTest.getId()).isPresent());
	}
	
	@Test
	public void garageModelTest()
	{	
		//GarageDataModel storeTest = new GarageDataModel();
		GarageDataModel garageTest = new GarageDataModel();
		
		garageTest.setType("Car");				garageTest.getType();
		garageTest.setMake("Ford");				garageTest.getMake();
		garageTest.setModel("Fiesta");			garageTest.getModel();
		garageTest.setColour("Diamond White");	garageTest.getColour();
		garageTest.setEngineCapacity(1400);		garageTest.getEngineCapacity();
		
		garageTest.getCreationDate();			garageTest.getLastModified();
		
		GarageDataModel testUpdate = repositoryTest.save(garageTest);
		
		entityManager.persist(testUpdate);
		entityManager.flush();
		assertTrue(repositoryTest.findById(testUpdate.getId()).isPresent());
	}
	
	/*@Test
	public void exceptionTest()
	{
		ResourceNotFoundException excepTest = new ResourceNotFoundException("OK 1", "OK 2", 3);
		entityManager.persist(excepTest);
		entityManager.flush();
		assertTrue(repositoryTest.)
	}*/
}
