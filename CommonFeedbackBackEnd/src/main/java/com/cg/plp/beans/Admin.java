package com.cg.plp.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {
	@Column(name="admin_id",length=10)
	private String adminId;
	@Column(name="admin_name",length=10)
	private String adminName;
	@Column(name="admin_password",length=10)
	private String adminPassword;
	@Id
	@Column(name="product_id")
	private int pid;
	@Column(name="customer_feedback",length=50)
	private String feedback;
	@Column(name="merchant_email",length=20)
	private String merchantEmail;
	@Column(name="merchant_response",length=50)	
	private String merchant_response;
	
	public Admin() {
		
	}
	
	public Admin(String adminId, String adminName, String adminPassword, int pid, String feedback, String merchantEmail,
			String merchant_response) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminPassword = adminPassword;
		this.pid = pid;
		this.feedback = feedback;
		this.merchantEmail = merchantEmail;
		this.merchant_response = merchant_response;
	}

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	

	public String getMerchant_response() {
		return merchant_response;
	}

	public void setMerchant_response(String merchant_response) {
		this.merchant_response = merchant_response;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public String getMerchantEmail() {
		return merchantEmail;
	}

	public void setMerchantEmail(String merchantEmail) {
		this.merchantEmail = merchantEmail;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", adminPassword=" + adminPassword + ", pid="
				+ pid + ", feedback=" + feedback + ", merchantEmail=" + merchantEmail + ", merchant_response="
				+ merchant_response + "]";
	}



	

	
	
}
