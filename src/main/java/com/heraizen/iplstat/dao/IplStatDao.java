package com.heraizen.iplstat.dao;

import java.util.List;

import com.heraizen.iplstat.dto.LabelDto;
import com.heraizen.iplstat.dto.PlayerDto;

public interface IplStatDao {

	


	public LabelDto findTeamLabels();
	public List<PlayerDto> findPlayerByLabel(String label);



}
