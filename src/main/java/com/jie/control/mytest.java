package com.jie.control;

import com.jie.dao.AccountMapper;
import com.jie.pojo.Account;
import com.jie.utils.batisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class mytest {
    public static void main(String[] args) {
        SqlSession sqlSession = batisUtil.getSqlSession();
        AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
        List<Account>  list = mapper.getAccountList();
        for (Account account : list) {
            System.out.println(account);
        }
    }
}
