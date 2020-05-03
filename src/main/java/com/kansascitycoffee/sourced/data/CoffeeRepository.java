package com.kansascitycoffee.sourced.data;

import com.kansascitycoffee.sourced.models.Coffee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface CoffeeRepository extends CrudRepository<Coffee, Integer> {
}
