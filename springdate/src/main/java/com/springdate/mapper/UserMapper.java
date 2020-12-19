package com.springdate.mapper;

import com.springdate.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper{
      List<User> getUserList();
}
