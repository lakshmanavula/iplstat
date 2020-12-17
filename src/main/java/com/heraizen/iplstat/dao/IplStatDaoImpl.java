package com.heraizen.iplstat.dao;

import static org.springframework.data.mongodb.core.aggregation.Aggregation.group;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.match;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.newAggregation;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.project;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.unwind;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.aggregation.MatchOperation;
import org.springframework.data.mongodb.core.aggregation.ProjectionOperation;
import org.springframework.data.mongodb.core.aggregation.UnwindOperation;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Repository;

import com.heraizen.iplstat.dto.LabelDto;
import com.heraizen.iplstat.dto.PlayerDto;

@Repository
public class IplStatDaoImpl implements IplStatDao {

	private Logger log = LoggerFactory.getLogger(IplStatDaoImpl.class);

	
	private MongoOperations monogoOperations;

	

	@Override
	public LabelDto findTeamLabels() {
		Aggregation query = newAggregation(group("null").addToSet("label").as("labels"), project().andExclude("_id"));
		AggregationResults<LabelDto> result = monogoOperations.aggregate(query, "team", LabelDto.class);
		log.debug("Generated query :{}", query);
		return result.getUniqueMappedResult();
	}

	@Override
	public List<PlayerDto> findPlayerByLabel(String label) {
	
		MatchOperation match = match(Criteria.where("label").is(label));
		UnwindOperation unwind = unwind("players");
		ProjectionOperation project = project().and("players.name").as("name").and("players.role").as("role")
				.and("players.price").as("price").and("label").as("label").andExclude("_id");
		Aggregation query = newAggregation(match, unwind, project);
		log.debug("Generated query :{}", query);
		AggregationResults<PlayerDto> result = monogoOperations.aggregate(query, "team", PlayerDto.class);
		List<PlayerDto> playerDtos = result.getMappedResults();
		log.info("Total {} players found for the given label: {}", playerDtos.size(), label);
		return playerDtos;
	}

	

}
