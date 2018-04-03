package batis.spring.poc.mapper;

import batis.spring.poc.domain.model.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class EmployeeMapperTest {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Test
    public void shouldGetAllEmployeesAndMapEmployeeRelation() {
        List<Employee> employees = employeeMapper.getAllEmployees();
        assert employees.size() == 2;
    }

    @Test
    public void shouldGetAllEmployeesWithTypeContractorAndMapEmployeeRelation() {
        List<Employee> employees = employeeMapper.getEmployeeWithType("CONTRACTOR");
        assert employees.size() == 1;
    }
}