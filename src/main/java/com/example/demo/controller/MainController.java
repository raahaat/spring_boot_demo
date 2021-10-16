package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MainController {

    @Autowired
    EmpRepo empRepo;


    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome";
    }
    @PostMapping("/emp")
    public Employee createEmp(@RequestBody Employee newEmp){

        empRepo.save(newEmp);
        return newEmp;
    }
    @GetMapping("/emp")
    public List<Employee> getEmps(){
        return empRepo.findAll();
    }
    @GetMapping("/emp/{id}")
    Employee getEmp(@PathVariable(value = "id") int id){
        return empRepo.findById(id).get();

    }

//    @PutMapping("/emp/{id}")
//    public Employee updateEmp(@PathVariable int id, @RequestBody Employee updatedEmp){
//        Employee emp = empRepo.findById(id).get();
//        emp.setName(updatedEmp.getName());
//        emp.setAddress(updatedEmp.getAddress());
//        emp.setPhone(updatedEmp.getPhone());
//        return empRepo.save(emp);
//    }

    @PutMapping("/emp/{id}")
    public Employee updateEmp(@PathVariable int id, @RequestBody Employee updatedEmp){
        Employee emp = empRepo.findById(id).get();
        emp = updatedEmp;
        return empRepo.save(emp);
    }

    @DeleteMapping("/emp/{id}")
    public Employee deleteEmp(@PathVariable int id){

      empRepo.deleteById(id);
      return null;
    }

}
