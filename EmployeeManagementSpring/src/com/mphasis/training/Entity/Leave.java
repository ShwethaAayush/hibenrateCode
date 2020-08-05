package com.mphasis.training.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Leave {
    
	 @Id
	 @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="leave_seq")
	 @SequenceGenerator(sequenceName="Leave_Seq",allocationSize=1,name="leave_seq")
	 private int id;
	 private String LeaveStatus;
	 private String LeaveAppliedDate;
	 private String FromDate;
	 private String ToDate;
	 
	 @ManyToOne
	 @JoinColumn(name="employee")
	 private Employee lemployee;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLeaveStatus() {
		return LeaveStatus;
	}

	public void setLeaveStatus(String leaveStatus) {
		LeaveStatus = leaveStatus;
	}

	public String getLeaveAppliedDate() {
		return LeaveAppliedDate;
	}

	public void setLeaveAppliedDate(String leaveAppliedDate) {
		LeaveAppliedDate = leaveAppliedDate;
	}

	public String getFromDate() {
		return FromDate;
	}

	public void setFromDate(String fromDate) {
		FromDate = fromDate;
	}

	public String getToDate() {
		return ToDate;
	}

	public void setToDate(String toDate) {
		ToDate = toDate;
	}

	public Employee getLemployee() {
		return lemployee;
	}

	public void setLemployee(Employee lemployee) {
		this.lemployee = lemployee;
	}

	@Override
	public String toString() {
		return "Leave [id=" + id + ", LeaveStatus=" + LeaveStatus + ", LeaveAppliedDate=" + LeaveAppliedDate
				+ ", FromDate=" + FromDate + ", ToDate=" + ToDate + ", lemployee=" + lemployee + "]";
	}

	public Leave(int id, String leaveStatus, String leaveAppliedDate, String fromDate, String toDate,
			Employee lemployee) {
		super();
		this.id = id;
		LeaveStatus = leaveStatus;
		LeaveAppliedDate = leaveAppliedDate;
		FromDate = fromDate;
		ToDate = toDate;
		this.lemployee = lemployee;
	}

	public Leave() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	 
		
}
