package com.heraizen.iplstat.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.heraizen.iplstat.dto.LabelDto;
import com.heraizen.iplstat.dto.PlayerDto;
import com.heraizen.iplstat.service.DataNotFoundException;
import com.heraizen.iplstat.service.IplStatService;

@RestController
@RequestMapping("/api/v1/stat/")
public class IplStatController {

	@Autowired
	private IplStatService iplStatService;

	@GetMapping("labels")
	public LabelDto getLabels() throws DataNotFoundException {
		return iplStatService.getTeamLabels();
	}

	@GetMapping("players/{label}")
	public List<PlayerDto> getPlayers(@PathVariable("label") String label) {
		return iplStatService.getPlayerByLabel(label);
	}

}
