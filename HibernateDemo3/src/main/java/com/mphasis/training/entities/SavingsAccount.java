package com.mphasis.training.entities;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
//@DiscriminatorValue(value="SA")
@PrimaryKeyJoinColumn(name="accnum")
public class SavingsAccount extends Account{
	
	private long adraNum;

	public long getAdraNum() {
		return adraNum;
	}

	public void setAdraNum(long adraNum) {
		this.adraNum = adraNum;
	}
	

}
