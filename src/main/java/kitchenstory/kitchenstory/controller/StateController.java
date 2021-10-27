package kitchenstory.kitchenstory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kitchenstory.kitchenstory.entity.State;
import kitchenstory.kitchenstory.repository.StateRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class StateController {
	
	@Autowired
	private StateRepository stateRepository;
	
	
//	http://localhost:8080/api/states/search?countryId=1
	@GetMapping("/states/search")
	public List<State> getStates(@RequestParam("countryId") int countryId){
		return this.stateRepository.findByCountryId(countryId);
	}

}
