package batis.spring.poc.mapper;

import batis.spring.poc.domain.model.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    @Select("SELECT * FROM employees")
    List<Employee> getAllEmployees();

    @Select("SELECT * FROM employees WHERE employee_type = #{employeeType}")
    List<Employee> getEmployeeWithType(@Param("employeeType") String employeeType);
}