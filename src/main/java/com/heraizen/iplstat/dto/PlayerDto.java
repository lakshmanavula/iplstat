package com.heraizen.iplstat.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PlayerDto {
	private String name;
	private String role;
	private double price;
	private String label;
}
