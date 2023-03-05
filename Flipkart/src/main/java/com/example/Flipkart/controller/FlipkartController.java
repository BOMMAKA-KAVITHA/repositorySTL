package com.example.Flipkart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Flipkart.entity.FlipkartUser;
import com.example.Flipkart.service.FlipkartServiceInterface;

@RestController
public class FlipkartController {
	
	@Autowired
	private FlipkartServiceInterface fs;

	@PostMapping("createProfile")
	public String createProfile(@RequestBody FlipkartUser fu) {
		return fs.createProfileService(fu);
	}
}
