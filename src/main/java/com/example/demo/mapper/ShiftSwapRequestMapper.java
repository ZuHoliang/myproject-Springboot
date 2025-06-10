package com.example.demo.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.dto.ShiftSwapRequestDto;

@Component
public class ShiftSwapRequestMapper {
	
	@Autowired
	private ModelMapper modelMapper;
	
	
	//Entity轉DTO
	public ShiftSwapRequestDto toDto(ShiftSwapRequestDto request) {
		ShiftSwapRequestDto dto = modelMapper.map(request, ShiftSwapRequestDto.class);
		
		if(request.getRequestUser() != null) {
			dto.setRequestUserId(request.getRequestUser().getUserId());
		}
	}
	
	
	
	
	//DTO轉Entity
	

}
