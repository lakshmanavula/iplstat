package com.heraizen.iplstat.dto;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LabelDto {

		private List<String> labels;
}
