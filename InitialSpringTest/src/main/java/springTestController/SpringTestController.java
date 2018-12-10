package springTestController;

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

import springTestRepository.SpringTestRepository;
import springTest.Model.SpringTestDataModel;
import springTestExceptions.ResourceNotFoundException;

@RestController
@RequestMapping("/api")
public class SpringTestController 
{
	@Autowired
	SpringTestRepository springRepo;
	
	//Method to create a person
	@PostMapping("/MySpringDataModel")
	public SpringTestDataModel createPerson(@Valid @RequestBody SpringTestDataModel SpringModel)
	{
		return springRepo.save(SpringModel);
	}
	
	//Method to get a person
	@GetMapping("person/{id}")
	public SpringTestDataModel getPersonbyID(@PathVariable(value = "id")Long personID)
	{
		return springRepo.findById(personID).orElseThrow(()-> 
		new ResourceNotFoundException("SpringTestDataModel", "id", personID));
	}
	
	//Method to get all people
	@GetMapping("/person")
	public List<SpringTestDataModel>getAllPeople()
	{
		return springRepo.findAll();
	}
	
	//Method to update a person
	@PutMapping("/person/{id}")
	public SpringTestDataModel updatePerson(@PathVariable(value = "id") Long personID,
			@Valid @RequestBody SpringTestDataModel personDetails)
	{
		SpringTestDataModel SpringModel = springRepo.findById(personID).orElseThrow(()-> 
		new ResourceNotFoundException("Person", "id", personID));
		
		SpringModel.setName(personDetails.getName());
		SpringModel.setAddress(personDetails.getAddress());
		SpringModel.setAge(personDetails.getAge());
		
		SpringTestDataModel updateData = springRepo.save(SpringModel);
		
		return updateData;
	}
	
	//Method to remove a person
	@DeleteMapping("/person/{id}")
	public ResponseEntity<?> deletePerson(@PathVariable(value = "id") Long personID)
	{
		SpringTestDataModel SpringModel = springRepo.findById(personID).orElseThrow(()->
		new ResourceNotFoundException("Person", "id", personID));
		
		springRepo.delete(SpringModel);
		
		return ResponseEntity.ok().build();
	}
	
}
