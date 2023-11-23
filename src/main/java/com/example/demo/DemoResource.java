package com.example.demo;

import com.example.demo.candidate.Candidate;
import com.example.demo.candidate.CandidateService;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

@Path("/")
public class DemoResource {
  private final static Logger LOGGER = LoggerFactory.getLogger(DemoResource.class);
  private final CandidateService candidateService;

  @Autowired
  public DemoResource(CandidateService candidateService) {
    this.candidateService = candidateService;
  }

  @GET
  @Path("/candidates/{id}")
  @Produces(MediaType.APPLICATION_JSON)
  public Candidate getCandidate(@PathParam("id") Integer id) {
    LOGGER.info("Requested candidate by id {}", id);
    return candidateService.findById(id);
  }
}
