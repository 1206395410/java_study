package com.demo.dao;

import com.demo.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface UserDao {
    @Select("select * from user")
    List<User> getUsers();

    @Select("select * from user where id = #{id} and name = #{name}")
    User getUserById(@Param("id") int id, @Param("name") String name);

    @Insert("insert into user (id,name,pwd) values ( #{id}, #{name}, #{pwd} )")
    int insertUser(Map<String,Object> map);

    @Delete("delete from user where id = #{id}")
    int deleUser(int id);
}
