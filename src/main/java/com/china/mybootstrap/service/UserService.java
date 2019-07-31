package com.china.mybootstrap.service;

import com.china.mybootstrap.dao.DepartmentMapper;
import com.china.mybootstrap.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    public Department getDepartments (Integer id);

    public int login(Department department);
}
