package com.china.mybootstrap.service.imp;

import com.china.mybootstrap.dao.DepartmentMapper;
import com.china.mybootstrap.entity.Department;
import com.china.mybootstrap.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserSericeImp implements UserService {
    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public Department getDepartments(Integer id) {
       return  departmentMapper.selectByPrimaryKey(id);
    }

    @Override
    public int login(Department department) {
        return  departmentMapper.selectDepart(department);
    }
}
