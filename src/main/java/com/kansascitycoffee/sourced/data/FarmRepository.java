package com.kansascitycoffee.sourced.data;

import com.kansascitycoffee.sourced.models.Farm;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface FarmRepository extends CrudRepository<Farm, Integer> {
}
