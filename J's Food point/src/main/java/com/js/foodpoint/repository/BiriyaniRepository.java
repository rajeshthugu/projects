package com.js.foodpoint.repository;

import com.js.foodpoint.entity.Biriyani;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BiriyaniRepository  extends CrudRepository<Biriyani, Long> {
}
