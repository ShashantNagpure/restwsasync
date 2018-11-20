package com.bharath.restws.restwsasync;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;

import org.springframework.stereotype.Service;

import com.bharath.restws.model.ChecksList;

@Path("/checkprocessingservice")
public interface CheckProcessor {
	
	@POST
	@Path("/checks")
	@Consumes("application/xml")
	public void processChecks(@Suspended AsyncResponse response,ChecksList checksList);

}
