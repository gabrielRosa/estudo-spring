package com.gabriel.spring.api.repository;

import com.gabriel.spring.api.domain.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> { }
