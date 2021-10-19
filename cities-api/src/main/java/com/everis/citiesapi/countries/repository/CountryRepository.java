package com.everis.citiesapi.countries.repository;

import com.everis.citiesapi.countries.Country;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;

public interface CountryRepository extends JpaRepository <Country, Long> {

    Page<Country> findAll(Pageable page);
}
