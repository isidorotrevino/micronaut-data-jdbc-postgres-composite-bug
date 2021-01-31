package com.test.embedded.repository;

import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.jdbc.annotation.JdbcRepository;
import com.test.embedded.entity.SettlementPk;
import com.test.embedded.entity.Settlement;
import io.micronaut.data.repository.CrudRepository;

@JdbcRepository(dialect = Dialect.POSTGRES)
public interface SettlementRepository extends CrudRepository<Settlement, SettlementPk>{

}
