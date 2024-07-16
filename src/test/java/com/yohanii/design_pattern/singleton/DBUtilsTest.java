package com.yohanii.design_pattern.singleton;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DBUtilsTest {

    ARepository aRepository;
    BRepository bRepository;

    @Test
    public void singletonTest() {

        aRepository = new ARepository();
        bRepository = new BRepository();

        DBUtils dbA = aRepository.getDb();
        DBUtils dbB = bRepository.getDb();

        assertThat(dbA).isEqualTo(dbB);
    }

}
