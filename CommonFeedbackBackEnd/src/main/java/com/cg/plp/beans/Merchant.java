package com.cg.plp.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Merchant {

	@Id
	@Column(name="merchant_email",length=25)
	private String merchant_email;
	@Column(name="product_id")
	private int prod_id;
	@Column(name="merchant_name",length=20)
	private String merchant_name;
	@Column(name="merchant_password",length=10)
	private String merchant_password;
	@Column(name="merchant_type",length=20)
	private String merchantType;
	@Column(name="customer_feedback",length=50)
	private String customer_feedback;
	@Column(name="merchant_response",length=50)
	private String merchant_response;
	
	
	public Merchant() {
		
	}

	public Merchant(String merchant_email, int prod_id, String merchant_name, String merchant_password,
			String merchantType, String customer_feedback, String merchant_response) {
		super();
		this.merchant_email = merchant_email;
		this.prod_id = prod_id;
		this.merchant_name = merchant_name;
		this.merchant_password = merchant_password;
		this.merchantType = merchantType;
		this.customer_feedback = customer_feedback;
		this.merchant_response = merchant_response;
	}


	public String getMerchant_email() {
		return merchant_email;
	}


	public void setMerchant_email(String merchant_email) {
		this.merchant_email = merchant_email;
	}


	public int getProd_id() {
		return prod_id;
	}


	public void setProd_id(int prod_id) {
		this.prod_id = prod_id;
	}


	public String getMerchant_name() {
		return merchant_name;
	}


	public void setMerchant_name(String merchant_name) {
		this.merchant_name = merchant_name;
	}


	public String getMerchant_password() {
		return merchant_password;
	}


	public void setMerchant_password(String merchant_password) {
		this.merchant_password = merchant_password;
	}


	public String getMerchantType() {
		return merchantType;
	}


	public void setMerchantType(String merchantType) {
		this.merchantType = merchantType;
	}


	public String getCustomer_feedback() {
		return customer_feedback;
	}


	public void setCustomer_feedback(String customer_feedback) {
		this.customer_feedback = customer_feedback;
	}


	public String getMerchant_response() {
		return merchant_response;
	}


	public void setMerchant_response(String merchant_response) {
		this.merchant_response = merchant_response;
	}

	@Override
	public String toString() {
		return "Merchant [merchant_email=" + merchant_email + ", prod_id=" + prod_id + ", merchant_name="
				+ merchant_name + ", merchant_password=" + merchant_password + ", merchantType=" + merchantType
				+ ", customer_feedback=" + customer_feedback + ", merchant_response=" + merchant_response + "]";
	}

	
}
