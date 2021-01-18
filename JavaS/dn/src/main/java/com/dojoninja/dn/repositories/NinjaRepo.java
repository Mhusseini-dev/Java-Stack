package com.dojoninja.dn.repositories;

import com.dojoninja.dn.models.Ninja;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NinjaRepo extends CrudRepository<Ninja, Long> {

}