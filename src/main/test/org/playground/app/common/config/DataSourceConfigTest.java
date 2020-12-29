package org.playground.app.common.config;


import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

public class DataSourceConfigTest {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(DataSourceConfig.class);

    @Test
    void dataSourceTest() {
        DataSource bean = ac.getBean("dataSource", DataSource.class);
        System.out.println("dataSource = " + bean);
    }
}
