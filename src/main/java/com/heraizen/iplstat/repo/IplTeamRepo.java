package com.heraizen.iplstat.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.heraizen.iplstat.domain.Team;

public interface IplTeamRepo extends MongoRepository<Team,String>{

	Team findByLabel(String label);

}
