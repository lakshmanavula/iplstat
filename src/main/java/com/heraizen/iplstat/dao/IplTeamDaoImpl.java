package com.heraizen.iplstat.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Repository;

import com.heraizen.iplstat.domain.Player;
import com.heraizen.iplstat.domain.Team;
import com.heraizen.iplstat.repo.IplTeamRepo;
import com.heraizen.iplstat.service.TeamAlreadyExistsException;

@Repository
public class IplTeamDaoImpl implements IplTeamDao {

	@Autowired
	private IplTeamRepo iplTeamRepo;
	
	@Autowired
	private MongoOperations mongoOperations;

	@Override
	public List<Team> insertTeams(List<Team> team) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Team insertTeam(Team team) throws TeamAlreadyExistsException {
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
		Team team =iplTeamRepo.findByLabel(label);
		return team;
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
	public List<Team> findTeams() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeAllTeams() {
		// TODO Auto-generated method stub

	}

	@Override
	public Player insertPlayer(String id, Player player) {
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
