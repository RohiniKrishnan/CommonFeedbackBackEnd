package com.cg.plp.service;


import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.plp.beans.CommonFeedback;
import com.cg.plp.beans.Merchant;
import com.cg.plp.beans.Admin;
import com.cg.plp.repo.IFeedbackRepository;
import com.cg.plp.repo.IMerchantRepository;
import com.cg.plp.repo.IAdminRepository;
@Service
//@Transactional
public class FeedbackServiceImpl implements IFeedbackService{
	
	Admin admin=new Admin();
	CommonFeedback fb=new CommonFeedback();
	Merchant merchant=new Merchant();
	
	@Autowired
	IFeedbackRepository feedbackRepo;
	@Autowired
	IMerchantRepository merchantRepo;
	@Autowired
	IAdminRepository adminRepo;
	
	
	@Override
		public String addFeedback(int id, String feedback) {
		
		List<Merchant> list=new ArrayList<>();
		merchantRepo.findAll().forEach(list::add);
		admin.setPid(id);
		admin.setFeedback(feedback);
		fb.setPid(id);
		fb.setFeedback(feedback);
	for (Merchant merchant : list) {
		if(merchant.getProd_id()==id)
		{
			merchant.setProd_id(id);
			merchant.setCustomer_feedback(feedback);
			feedbackRepo.save(fb);
			adminRepo.save(admin);
			merchantRepo.save(merchant);
			
			return "Feedbackadded";
		}
		
		}
	return feedback;

	}

@Override
	public String addResponse(int pid, String response) {
	
		List<Merchant> list=new ArrayList<>();
		merchantRepo.findAll().forEach(list::add);
		admin.setPid(pid);
		admin.setMerchant_response(response);
		fb.setPid(pid);
		fb.setResponse(response);
		
		for (Merchant merchant : list) {
			if(merchant.getProd_id()==pid) {
				merchant.setProd_id(pid);
				merchant.setMerchant_response(response);
				feedbackRepo.save(fb);
				adminRepo.save(admin);
				merchantRepo.save(merchant);
				
				return "Responseadded";
			}
			
		}
		return response;
	}

}
