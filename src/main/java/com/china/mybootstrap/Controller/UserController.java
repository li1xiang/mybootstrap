package com.china.mybootstrap.Controller;

import com.china.mybootstrap.entity.Department;
import com.china.mybootstrap.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;


    @GetMapping(value = "/{id}")
    public Department entry(@PathVariable ("id") int id){
        Department departments = userService.getDepartments(id);
        return  departments;
    }

    @PostMapping(value = "/login")
    public String login(@RequestParam(value = "username") String username , @RequestParam(value = "password") String password, Map<String,Object> map, HttpSession session){
        Department department = new Department();
        department.setUsrName(username);
        department.setDepartmentname(password);
        int login = userService.login(department);
        if(login==1){
            session.setAttribute("loginUser",username);
            return "redirect:/main.html";
        }else {
            return "redirect:/login.html";
        }
        
    }
}
