package com.zzj.dao;

import com.zzj.vo.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeDao {
    public Employee dl(String username);

    public List<Employee> queryEmployeeAll(@Param("employees") String employees, @Param("sex") String sex);

    public int queryEmployeeCount(@Param("employees") String employees, @Param("sex") String sex);

    public Employee queryEmployeeById(int id);

    public int queryExist(String username);

    public int addEmployee(Employee employee);

    public int uptEmployee(Employee employee);

    public int delEmployee(int id);
}
