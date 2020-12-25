package com.zzj.dao;

import com.zzj.vo.Employee;
import com.zzj.vo.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface EmployeeDao {
    public Employee dl(String username);

    public List<Employee> queryEmployeeAll(@Param("employees") String employees);

    public int queryEmployeeCount(@Param("employees") String employees);

    public List<Employee> queryEmployee();

    public Employee queryEmployeeById(int id);

    public int queryExist(String username);

    public int addEmployee(Employee employee);

    public int uptEmployee(Employee employee);

    public int delEmployee(int id);
}
