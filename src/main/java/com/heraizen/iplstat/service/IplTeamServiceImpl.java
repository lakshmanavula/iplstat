package com.heraizen.iplstat.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.heraizen.iplstat.domain.Player;
import com.heraizen.iplstat.domain.Team;

@Service
public class IplTeamServiceImpl implements IplTeamService {

	@Override
	public List<Team> addTeams(List<Team> team) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Team addTeam(Team team) throws TeamAlreadyExistsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Team updateTeam(Team team) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Team findTeamByLabel(String label) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Team findTeamById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteTeam(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Team> getTeams() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeAllTeams() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Player addPlayer(String id, Player player) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Player updatePlayer(String id, Player player) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removePlayer(String id, String playerName) {
		// TODO Auto-generated method stub
		
	}

}
