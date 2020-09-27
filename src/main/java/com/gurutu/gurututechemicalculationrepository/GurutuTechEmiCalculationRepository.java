package com.gurutu.gurututechemicalculationrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gurutu.gurututechemicalculationentity.GurutuTechEmiCaclulationEntity;

@Repository
public interface GurutuTechEmiCalculationRepository extends JpaRepository<GurutuTechEmiCaclulationEntity, Integer> {

}
