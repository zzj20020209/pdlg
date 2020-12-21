package com.zzj.service;

import com.zzj.vo.Employee;
import com.zzj.vo.PageVo;


public interface EmployeeService {
    public Employee dl(String username);

    public PageVo<Employee> queryEmployeeCount(String employees, String sex, int page, int rows);

    public Employee queryEmployeeById(int id);

    public int queryExist(String username);

    public int addEmployee(Employee employee);

    public int uptEmployee(Employee employee);

    public int delEmployee(String ids);
}
