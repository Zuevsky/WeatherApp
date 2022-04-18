package com.ubercadence.weather.repository;

import com.ubercadence.weather.domain.CityTempMark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface CityTempMarkRepository extends JpaRepository<CityTempMark, Long>, JpaSpecificationExecutor<CityTempMark> {

}
