/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sandun.studentmgtapp.student;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author sandun
 */
public interface StudentRepository extends CrudRepository<Student, Integer>{
    
    public List<Student> findByFullName(String fullName);
    
}
