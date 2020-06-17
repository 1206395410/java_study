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
        User user = new User(9,"小红","1234");
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.addUser(user);
        mapper.deleteUser(7);
        return mapper.getUsers();
    }

    public int addUser(User user) {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.addUser(user);
    }

    public int deleteUser(int id) {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.deleteUser(id);
    }
}
