package com.miya_masa.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miya_masa.sample.domain.City;

public interface CityRepository extends JpaRepository<City, Long> {

}
