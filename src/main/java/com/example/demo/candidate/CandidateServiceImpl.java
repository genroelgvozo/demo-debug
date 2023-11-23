package com.example.demo.candidate;

import com.example.demo.SomeException;
import jakarta.ws.rs.NotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CandidateServiceImpl implements CandidateService {

  public Candidate findById(Integer id) {
    if (id.equals(5)) {
      throw new NotFoundException();
    }
    if (id.equals(10)) {
      throw new SomeException(id);
    }
    return new Candidate(id, "Olegator%s".formatted(id));
  }
}
