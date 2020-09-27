package com.gurutu.gurututechemicalculationentity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GurutuTechEmiCaclulationEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int emiNumber;
	private double emiAmount;
	private double principleEmi;
	private double interestEmi;
	private double totaleEmi;
	private String emiDate;
	private double principleAmountRemainingFromTheLoan;
	public int getEmiNumber() {
		return emiNumber;
	}
	public void setEmiNumber(int emiNumber) {
		this.emiNumber = emiNumber;
	}
	public double getEmiAmount() {
		return emiAmount;
	}
	public void setEmiAmount(double emiAmount) {
		this.emiAmount = emiAmount;
	}
	public double getPrincipleEmi() {
		return principleEmi;
	}
	public void setPrincipleEmi(double principleEmi) {
		this.principleEmi = principleEmi;
	}
	public double getInterestEmi() {
		return interestEmi;
	}
	public void setInterestEmi(double interestEmi) {
		this.interestEmi = interestEmi;
	}
	public double getTotaleEmi() {
		return totaleEmi;
	}
	public void setTotaleEmi(double totaleEmi) {
		this.totaleEmi = totaleEmi;
	}
	
	public double getPrincipleAmountRemainingFromTheLoan() {
		return principleAmountRemainingFromTheLoan;
	}
	public void setPrincipleAmountRemainingFromTheLoan(double principleAmountRemainingFromTheLoan) {
		this.principleAmountRemainingFromTheLoan = principleAmountRemainingFromTheLoan;
	}
	/*
	 * public boolean isEmpty() { // TODO Auto-generated method stub return false; }
	 */
	public String getEmiDate() {
		return emiDate;
	}
	public void setEmiDate(String emiDate) {
		this.emiDate = emiDate;
	}
	
	

}
