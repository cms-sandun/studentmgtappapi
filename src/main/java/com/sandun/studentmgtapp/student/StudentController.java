/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sandun.studentmgtapp.student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sandun
 */
@RestController
public class StudentController {
    
    @Autowired
    private StudentService studentService;

    /**
     * Find all the students available in the database.
     * @return List of students
     */
    @RequestMapping("/students")
    public ResponseEntity<List<Student>> findAllStudents() {
        return ResponseEntity.ok(studentService.findAllStudents());
    }

    /**
     * Find specific student by given studentId
     * @param id specified student id
     * @return Student object
     */
    @RequestMapping("/students/{id}")
    public ResponseEntity<Student> findStudentById(@PathVariable int id) {
        return ResponseEntity.ok(studentService.findById(id));
    }

    /**
     * Save student object
     * @param student 
     */
    @RequestMapping(method = RequestMethod.POST, value = "/students")
    public ResponseEntity<String> addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    
    /**
     * Update student object
     * @param student 
     */
//    @RequestMapping(method = RequestMethod.PUT, value = "/students/{id}")
//    public String updateStudent(@RequestBody Student student, @PathVariable int id) {
//        return studentService.updateStudent(student, id);
//    }
    
    /**
     * Delete student object
     * @param student
     * @param id 
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/students/{id}")
    public String deleteStudent(@PathVariable int id) {
        return studentService.deleteStudent(id);
    }

}
