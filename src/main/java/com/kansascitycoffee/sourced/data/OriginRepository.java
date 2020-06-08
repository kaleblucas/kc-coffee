package com.kansascitycoffee.sourced.data;

import com.kansascitycoffee.sourced.models.Origin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface OriginRepository extends CrudRepository<Origin, Integer> {
}
