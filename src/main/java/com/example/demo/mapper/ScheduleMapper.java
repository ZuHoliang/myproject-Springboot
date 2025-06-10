package com.example.demo.mapper;

import org.hibernate.annotations.Comment;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.dto.ScheduleDto;
import com.example.demo.model.entity.Schedule;

@Comment
public class ScheduleMapper {
	
	@Autowired
	private ModelMapper modelMapper;
	
	public ScheduleDto toDto(schedule, ScheduleDto.class) {;
	if(schedule.getWorkUser() != null) {
		dto.setUserId(schedule.getWorkUser().getId());
		dto.setUsername(schedule.getWorkUser().getUsername());
	}
return dto;
	}
}
