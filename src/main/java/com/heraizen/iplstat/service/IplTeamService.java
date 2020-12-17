package com.heraizen.iplstat.service;

import java.util.List;

import com.heraizen.iplstat.domain.Player;
import com.heraizen.iplstat.domain.Team;

public interface IplTeamService {

	public List<Team> addTeams(List<Team> team);

	public Team addTeam(Team team)throws TeamAlreadyExistsException;

	public Team updateTeam(Team team);

	public Team findTeamByLabel(String label);

	public Team findTeamById(String id);

	public void deleteTeam(String id);

	public List<Team> getTeams();

	public void removeAllTeams();

	public Player addPlayer(String id, Player player);
	
	public Player updatePlayer(String id, Player player);

	public void removePlayer(String id, String playerName);

}
