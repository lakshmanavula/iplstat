package com.heraizen.iplstat.service;

import java.util.List;

import com.heraizen.iplstat.dto.LabelDto;
import com.heraizen.iplstat.dto.PlayerDto;

public interface IplStatService {

		
		public LabelDto getTeamLabels()  throws DataNotFoundException;
		public List<PlayerDto> getPlayerByLabel(String label);
		

}
