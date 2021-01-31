package com.test.embedded.repository;

import com.test.embedded.entity.County;
import com.test.embedded.entity.CountyPk;

import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.repository.CrudRepository;

@JdbcRepository(dialect = Dialect.POSTGRES)
public interface CountyRepository extends CrudRepository<County, CountyPk>{

}
