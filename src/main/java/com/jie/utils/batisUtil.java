package com.jie.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class batisUtil {
    private static SqlSessionFactory sqlSessionFactory = null;

    static {
        try {
            InputStream inputStream =null;
            String resource = "mybatis-config.xml";
            inputStream  = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static SqlSession getSqlSession() {
        return sqlSessionFactory.openSession();
    }
}
