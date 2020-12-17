package com.heraizen.iplstat.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.heraizen.iplstat.domain.Team;
import com.heraizen.iplstat.service.IplTeamService;
import com.heraizen.iplstat.service.TeamAlreadyExistsException;

@RestController
@RequestMapping("/api/v1/team/")
public class IplTeamController {

	@Autowired
	private IplTeamService iplTeamService;
	
	@PostMapping
	public Team addTeam(@RequestBody Team team) throws TeamAlreadyExistsException {
		return iplTeamService.addTeam(team);
	}
	
	@PutMapping
	public Team updateTeam(@RequestBody Team team) {
		Team updatedTeam = null; // Invoke method the update team
		return updatedTeam;
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<?> deleteTeam(@PathVariable("id")String teamId){
		
		boolean res = true;// Logic
		ResponseMessage  responseMessage=null;		
		if(res) {
			responseMessage = ResponseMessage.builder().message("Deleted successfully").build();
		}else {
			  responseMessage = ResponseMessage.builder().message("Not delted successfully").build();
		}
		return ResponseEntity.ok().body(responseMessage);
	
	}
	
	// Get     -> Get resource
	// Post    -> Create object
	// Put     -> Update
	// Delete  -> Delete resource
}
