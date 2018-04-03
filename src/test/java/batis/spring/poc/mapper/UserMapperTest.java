package batis.spring.poc.mapper;

import batis.spring.poc.domain.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void shouldGetAllUserAndMapEmployeeRelation() {
        List<User> users = userMapper.getAllUsers();
        assert users.size() == 2;
    }
}