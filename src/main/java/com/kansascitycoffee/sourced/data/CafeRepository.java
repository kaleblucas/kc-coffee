package com.kansascitycoffee.sourced.data;

import com.kansascitycoffee.sourced.models.Cafe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface CafeRepository extends CrudRepository<Cafe, Integer> {
}
