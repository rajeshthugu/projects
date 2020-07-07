package com.js.foodpoint.repository;

import com.js.foodpoint.entity.Cake;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CakeRepository extends CrudRepository<Cake, Long> {
}
