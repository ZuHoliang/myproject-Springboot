package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ScheduleRepository;
import com.example.demo.repository.ShiftSwapRequestRepository;
import com.example.demo.service.NotificationService;
import com.example.demo.service.ShiftSwapRequestService;

@Service
public class ShiftSwapRequestServiceImpl implements ShiftSwapRequestService {
	
	@Autowired
	private ScheduleRepository scheduleRepository;
	
	@Autowired
	private ShiftSwapRequestRepository shiftSwapRequestRepository;
	
	@Autowired
	private NotificationService notificationService;
	
	

}
