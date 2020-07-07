package com.js.foodpoint.repository;

import com.js.foodpoint.entity.Desert;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DesertRepository extends CrudRepository<Desert, Long> {
}
