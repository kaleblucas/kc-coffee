package com.kansascitycoffee.sourced.data;

import com.kansascitycoffee.sourced.models.Cafe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CafeRepository extends CrudRepository<Cafe, Integer> {
}
