package com.hcsappmvvm.hcsappmvvm_springserver.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppealRepository extends CrudRepository<Appeal, Integer> {

}
