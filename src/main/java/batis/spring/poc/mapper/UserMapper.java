package batis.spring.poc.mapper;

import batis.spring.poc.domain.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM \"user\"")
    List<User> getAllUsers();
}