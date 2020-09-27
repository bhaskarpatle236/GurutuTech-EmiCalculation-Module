package com.gurutu.gurututechemicalculationcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.gurutu.gurututechemicalculationentity.GurutuTechEmiCaclulationEntity;
import com.gurutu.gurututechemicalculationservice.GurutuTechEmiCalculationService;

@RestController
@RequestMapping("/emiCalculation")
public class GurutuTechEmiCalculationController {
	
	@Autowired
	GurutuTechEmiCalculationService gts;
	
	@Autowired
	RestTemplate rs;
	
	@PostMapping("/addEmidetails")
	private ResponseEntity<String> addEmiDetails(@RequestBody List<GurutuTechEmiCaclulationEntity> emiCaclulationEntity )
	{
		if(!emiCaclulationEntity.isEmpty())
		{
			gts.addEmiDetails(emiCaclulationEntity);
			return new ResponseEntity<String>("All emiCalaulation added succesfully", HttpStatus.CREATED);
			
		}
		return new ResponseEntity<String>("No eicalculation to add", HttpStatus.BAD_REQUEST);
		
	}
	
	@GetMapping("/getAllLoanFromLoan")
	private ResponseEntity<List<GurutuTechEmiCaclulationEntity>> getAllLoan()
	{
		List<GurutuTechEmiCaclulationEntity> caclulationEntities=rs.getForObject("http://localhost:8088/loanModule/getAllLoan", List.class);
		return new ResponseEntity<List<GurutuTechEmiCaclulationEntity>>( caclulationEntities,HttpStatus.CREATED);
		


		
	}

}
