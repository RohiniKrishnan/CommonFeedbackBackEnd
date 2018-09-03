package com.cg.plp.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity

public class CommonFeedback {

	@Id
	@Column(name="product_id")
	private int pid;
	@Column(name="customer_feedback",length=50)
	private String feedback;
	@Column(name="merchant_response",length=50)
	private String response;
	
	public CommonFeedback() {
		
	}

	public CommonFeedback(int pid, String feedback, String response) {
		super();
		this.pid = pid;
		this.feedback = feedback;
		this.response = response;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	@Override
	public String toString() {
		return "Feedback [pid=" + pid + ", feedback=" + feedback + ", response=" + response + "]";
	}
	
	
}
