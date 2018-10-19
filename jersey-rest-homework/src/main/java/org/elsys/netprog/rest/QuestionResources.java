package org.elsys.netprog.rest;

import java.net.URI;import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.*;
import org.json.JSONArray;
import org.json.simple.*;
import org.json.simple.JSONObject;


@Path("/questions")
public class QuestionResources {
	private static QuestionBank questions = new QuestionBank();
	@GET
	@Path("/random")
	@Produces(value={MediaType.APPLICATION_JSON})
	public Question getQuestion() throws URISyntaxException{
		
		return questions.getRandomQuestion();
	}
	
	@PUT
	@Path("/guess/{id}/{guess}")
	@Produces(value={MediaType.APPLICATION_JSON})
	public Response guess(@PathParam("id") String gameId, @PathParam("guess") String guess) throws Exception{
		//TODO: Add your code here
		return Response.status(404).build();
	}
	
	@GET
	@Path("/games")
	@Produces(value={MediaType.APPLICATION_JSON})
	public Response getGames() {
		//TODO: Add your code here
		return Response.status(404).build();
	}
}
