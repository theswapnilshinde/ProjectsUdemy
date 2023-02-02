package com.microservices.currencyexchangeservices.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.currencyexchangeservices.beans.CurrncyExchange;


@Repository
public interface CurrencyServiceRepo extends JpaRepository<CurrncyExchange, Integer> {

}
