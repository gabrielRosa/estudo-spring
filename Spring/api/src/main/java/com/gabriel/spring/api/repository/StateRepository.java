package com.gabriel.spring.api.repository;

import com.gabriel.spring.api.domain.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> { }
