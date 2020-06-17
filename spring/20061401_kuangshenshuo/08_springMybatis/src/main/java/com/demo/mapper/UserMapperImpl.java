package com.demo.mapper;

import com.demo.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;
//不知道真实开发中用不用的到这么写，感觉并没有简化多少.
public class UserMapperImpl implements UserMapper{
    private SqlSessionTemplate sqlSession;

    public UserMapperImpl(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<User> getUsers() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.getUsers();
    }
}
