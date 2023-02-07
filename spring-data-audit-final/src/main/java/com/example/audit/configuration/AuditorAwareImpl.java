package com.example.audit.configuration;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
public class AuditorAwareImpl implements AuditorAware<String> {

  @Override
  public Optional<String> getCurrentAuditor() {
    String loggedInUsername = SecurityContextHolder.getContext().getAuthentication().getName();
    //System.out.println(loggedInUsername);
    return Optional.of(loggedInUsername);
  }
  
}
