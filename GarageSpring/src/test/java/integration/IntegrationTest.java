package integration;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.SpringGarage.Cull_David.GarageSpringApplication;
import com.SpringGarage.Cull_David.GarageModel.GarageDataModel;
import com.SpringGarage.Cull_David.GarageRepository.GarageRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {GarageSpringApplication.class})
@AutoConfigureMockMvc
public class IntegrationTest 
{
	@Autowired
	private MockMvc mvc;
	
	@Autowired
	private GarageRepository testRepo;
	
	//This WILL wipe the DataBase
	@Before
	public void clearDB()
	{
		testRepo.deleteAll();
	}
	
	@Test
	public void findAndRetrieveVehicleFromDB()
	throws Exception
	{
		testRepo.save(new GarageDataModel("Car", "Ford", "Escort", "White", 1400));
		mvc.perform(get("/api/vehicle")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content()
				.contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$[0].make", is("Ford")));
	}
	
	@Test
	public void addVehicleToDB() throws Exception
	{
		mvc.perform(MockMvcRequestBuilders.post("/api/vehicle")
				.contentType(MediaType.APPLICATION_JSON)
				.content("{\"type\" : \"Car\", \"make\" : \"Ford\","
						+ " \"model\" : \"Fiesta\", \"colour\" : \"White\","
						+ " \"engineCapacity\" : 1400}"))
				.andExpect(status()
				.isOk())
				.andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$.type", is("Car")));
	}
}
