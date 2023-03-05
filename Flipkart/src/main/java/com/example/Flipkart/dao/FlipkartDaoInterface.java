package com.example.Flipkart.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Flipkart.entity.FlipkartUser;

@Repository
public interface FlipkartDaoInterface extends JpaRepository<FlipkartUser, Integer>{

}
