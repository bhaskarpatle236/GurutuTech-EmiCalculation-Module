package com.gurutu.gurututechemicalculationserviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gurutu.gurututechemicalculationentity.GurutuTechEmiCaclulationEntity;
import com.gurutu.gurututechemicalculationrepository.GurutuTechEmiCalculationRepository;
import com.gurutu.gurututechemicalculationservice.GurutuTechEmiCalculationService;

@Service
public class GurutuTechEmiCalculationServiceImpl implements GurutuTechEmiCalculationService{

	@Autowired
	GurutuTechEmiCalculationRepository gtr;
	
	@Override
	public int addEmiDetails(List<GurutuTechEmiCaclulationEntity> caclulationEntities) {
		gtr.saveAll(caclulationEntities);
		return 1;
	}
	
	

}
