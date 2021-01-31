package com.test.embedded.repository;

import javax.inject.Inject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.test.embedded.entity.County;
import com.test.embedded.entity.CountyPk;
import com.test.embedded.entity.Settlement;
import com.test.embedded.entity.SettlementPk;
import com.test.embedded.entity.SettlementType;
import com.test.embedded.entity.State;
import com.test.embedded.entity.Zone;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;

@MicronautTest
public class SettlementRepositoryTests
{
    private static Logger log;
    @Inject
    protected SettlementRepository repo;
    
    @Test
    public void testInsertion() {
        Settlement settlement = new Settlement();
        State state = new State();
        state.setId(Integer.valueOf(1));
        SettlementType type = new SettlementType();
        type.setId(Integer.valueOf(21));
        County county = new County();
        CountyPk countyPk = new CountyPk();
        countyPk.setId(Integer.valueOf(1));
        countyPk.setState(state);
        county.setId(countyPk);
        Zone zone = new Zone();
        zone.setId(Integer.valueOf(1));
        SettlementPk setPk = new SettlementPk();
        setPk.setCode("20010");
        setPk.setCodeId(Integer.valueOf(9));
        setPk.setCounty(county);
        settlement.setId(setPk);
        settlement.setZone(zone);
        settlement.setSettlementType(type);
        settlement.setDescription("New settlement");
        settlement.setEnabled(Boolean.valueOf(true));
        
        settlement = this.repo.save(settlement);
        Assertions.assertNotNull((Object)settlement);
    }
    
    static {
        log = LoggerFactory.getLogger(SettlementRepositoryTests.class);
    }
}