package com.heraizen.iplstat.dao;

import java.util.List;

import com.heraizen.iplstat.domain.Player;
import com.heraizen.iplstat.domain.Team;
import com.heraizen.iplstat.service.TeamAlreadyExistsException;

public interface IplTeamDao {
	public List<Team> insertTeams(List<Team> team);

	public Team insertTeam(Team team) throws TeamAlreadyExistsException;

	public Team updateTeam(Team team);

	public Team findTeamByLabel(String label);

	public Team findTeamById(String id);

	public void deleteTeam(String id);

	public List<Team> findTeams();

	public void removeAllTeams();

	public Player insertPlayer(String id, Player player);

	public Player updatePlayer(String id, Player player);

	public void removePlayer(String id, String playerName);
}
