package com.heraizen.iplstat.dao;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.heraizen.iplstat.dto.LabelDto;
import com.heraizen.iplstat.dto.PlayerDto;

@SpringBootTest
public class IplStatDaoImplTest {

	@Autowired
	private IplStatDao iplStatDao;

	@BeforeEach
	void init() {
		// init part
	}

	@Test
	void testFindLabels() {
		LabelDto labelDto = iplStatDao.findTeamLabels();
		assertThat(labelDto.getLabels(), hasSize(8));
	}

	@Test
	void testFindPlayerByLabel() {
		String label = "RCB";
		List<PlayerDto> playersList = iplStatDao.findPlayerByLabel(label);
		assertThat(playersList, hasSize(21));
	}
}
