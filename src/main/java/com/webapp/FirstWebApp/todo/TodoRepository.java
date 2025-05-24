package com.webapp.FirstWebApp.todo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TodoRepository extends JpaRepository<todocontent,Integer> {
  public List<todocontent> findByUsername(String username);
}
