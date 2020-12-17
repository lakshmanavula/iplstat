package com.heraizen.iplstat.domain;

import java.util.List;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Team {

		@Id
		private String id;
		private String label;
		private String home;
		private String coach;
		private String name;
		private String city;
		private List<Player> players;
}
