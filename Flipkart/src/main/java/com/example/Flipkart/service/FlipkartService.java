package com.example.Flipkart.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.example.Flipkart.dao.FlipkartDaoInterface;
import com.example.Flipkart.entity.FlipkartUser;

@Service
@Transactional
@Scope(scopeName="prototype")
public class FlipkartService implements FlipkartServiceInterface{
	
	@Autowired
	private FlipkartDaoInterface fd;

	@Override
	public String createProfileService(FlipkartUser fu) {
		fd.save(fu);
		return "profile created";
	}

}
