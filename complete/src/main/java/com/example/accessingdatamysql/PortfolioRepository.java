package com.example.accessingdatamysql;

import org.springframework.data.repository.CrudRepository;

public interface PortfolioRepository extends CrudRepository<Portfolio, Integer> {
}
