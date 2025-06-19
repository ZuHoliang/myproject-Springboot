package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.config.AIModerationConfig;
import com.example.demo.service.AuthService;

import jakarta.servlet.http.HttpSession;

public class AIModerationConfigController {
	
	@Autowired
	private AIModerationConfig config;
	
	@Autowired
	private AuthService authService;
	
	@GetMapping("")
	public AIModerationConfig getConfig(HttpSession session) {
		authService.checkAdminPermission(session);
		return config;
	}
	
	@PutMapping("")
	public AIModerationConfig updateConfig(@RequestBody AIModerationConfig newConfig, HttpSession session) {
		authService.checkAdminPermission(session);
		config.setUsernameCheck(newConfig.isUsernameCheck());
		config.setMessageCheck(newConfig.isMessageCheck());
		config.setAnnouncementCheck(newConfig.isAnnouncementCheck());
		return config;
	}

}
