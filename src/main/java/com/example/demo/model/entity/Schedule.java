package com.example.demo.model.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Schedule {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "schedule_id")
	private Long schedleId;
	
	@ManyToOne
	@JoinColumn(name = "user_id", nullable = true)
	@Column(name = "user_id")
	private User user;
	
	private LocalDate workDate;
	
	@Column(length = 20)
	private String shiftType;
	
	@CreationTimestamp
	private LocalDateTime createTime;
	
	@CreationTimestamp
	private LocalDateTime upDateTime;
	
	

}
