package com.yohanii.design_pattern;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;

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
