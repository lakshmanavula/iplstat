package com.heraizen.iplstat.util;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.heraizen.iplstat.domain.Team;

public final class SeedDataUtil {

	private static final Logger log = LoggerFactory.getLogger(SeedDataUtil.class);
	private static final String fileName = "/ipl2020.json";

	private SeedDataUtil() {

	}

	public static List<Team> loadFromJSON() {
		ObjectMapper objectMapper = new ObjectMapper();
		List<Team> teams=new ArrayList<>();
		try {
			teams = objectMapper.readValue(SeedDataUtil.class.getResource(fileName), new TypeReference<List<Team>>() {
			});
		} catch (Exception e) {
			log.error("While loading seed data :{}", e);
		}
		return teams;
	}
}
