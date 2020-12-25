package com.zzj.service.impl;

import com.github.pagehelper.PageHelper;
import com.zzj.dao.EmployeeDao;
import com.zzj.service.EmployeeService;
import com.zzj.vo.Employee;
import com.zzj.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class EmployeeServiceImp implements EmployeeService {

    @Autowired
    EmployeeDao employeeDao;

    @Override
    public Employee dl(String username) {
        return employeeDao.dl(username);
    }

    @Override
    public PageVo<Employee> queryEmployeeCount(String employees,int page,int rows) {
        PageVo<Employee> pageVo = new PageVo<>();
        PageHelper.startPage(page,rows);
        pageVo.setRows(employeeDao.queryEmployeeAll(employees));
        pageVo.setTotal(employeeDao.queryEmployeeCount(employees));
        return pageVo;
    }

    @Override
    public List<Employee> queryEmployee() {
        return employeeDao.queryEmployee();
    }

    @Override
    public Employee queryEmployeeById(int id) {
        return employeeDao.queryEmployeeById(id);
    }

    @Override
    public int queryExist(String username) {
        return employeeDao.queryExist(username);
    }

    @Override
    public int addEmployee(Employee employee) {
        return employeeDao.addEmployee(employee);
    }

    @Override
    public int uptEmployee(Employee employee) {
        return employeeDao.uptEmployee(employee);
    }

    @Override
    public int delEmployee(String ids) {
        String [] id = ids.split(",");
        int num=0;
        for (int i=0;i<id.length;i++){
            System.out.println(Integer.parseInt(id[i]));
            num+=employeeDao.delEmployee(Integer.parseInt(id[i]));
        }
        return num;
    }
}
