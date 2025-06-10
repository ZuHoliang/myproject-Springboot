package com.example.demo.mapper;

import org.hibernate.annotations.Comment;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.dto.ScheduleDto;
import com.example.demo.model.entity.Schedule;

@Component
public class ScheduleMapper {

	@Autowired
	private ModelMapper modelMapper;

	//Entity轉DTO
	public ScheduleDto toDto(Schedule schedule) {
		ScheduleDto dto = modelMapper.map(schedule, ScheduleDto.class);
		if (schedule.getWorkUser() != null) {
			dto.setUserId(schedule.getWorkUser().getUserId());
			dto.setUsername(schedule.getWorkUser().getUsername());
		}
		dto.setShiftType(schedule.getShiftType() != null ? schedule.getShiftType().name() : null);
		return dto;
	
	}
	
	//DTO轉Entity
	public Schedule toEntity(ScheduleDto dto) {
		Schedule schedule = modelMapper.map(dto, Schedule.class);
		return schedule;
	}
	
}
