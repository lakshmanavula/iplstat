package com.heraizen.iplstat.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.heraizen.iplstat.dao.IplStatDao;
import com.heraizen.iplstat.dto.LabelDto;
import com.heraizen.iplstat.dto.PlayerDto;

@Service
public class IplStatServiceImpl implements IplStatService {

	private static final Logger log = LoggerFactory.getLogger(IplStatServiceImpl.class);

	@Autowired
	private IplStatDao iplStatDao;

	@Override
	public LabelDto getTeamLabels() throws DataNotFoundException {
		LabelDto labelDto = iplStatDao.findTeamLabels();
		if (labelDto != null) {
			log.info("Total {} team labels found ", labelDto.getLabels().size());
			return labelDto;
		}
		log.info("There no teams added yet, and labels return as null");
		throw new DataNotFoundException("There are no labels in data source");
	}

	
	@Override
	public List<PlayerDto> getPlayerByLabel(String label) {
		Assert.notNull(label, "Label can't be empty or null");
		List<PlayerDto> players = iplStatDao.findPlayerByLabel(label);
		log.info("For given team: {} has total {} player ", label, players.size());
		return players;
	}

	

}
