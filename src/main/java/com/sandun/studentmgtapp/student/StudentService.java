/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sandun.studentmgtapp.student;

import com.sandun.studentmgtapp.student.exceptions.StudentAlreadyExsistException;
import com.sandun.studentmgtapp.student.exceptions.StudentException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.persistence.EntityNotFoundException;
import javax.validation.constraints.NotNull;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.stereotype.Service;

/**
 *
 * @author sandun
 */
@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    /**
     * Find all the students
     *
     * @return List of Student objects
     */
    public List<Student> findAllStudents() {
        List<Student> students = null;
        students = (List<Student>) studentRepository.findAll();
        if (CollectionUtils.isNotEmpty(students)) {
            return students;
        } else {
            throw new StudentException("There are no any student records in the database.");
        }
    }

    /**
     * Find a Student object for given id
     *
     * @param id Student id given as parameter
     * @return
     */
    public Student findById(int id) {
        Student student = studentRepository.findOne(id);
        if (student != null) {
            return student;
        } else {
            throw new StudentException("There is no any student record or the given ID.");
        }
    }

    /**
     * Save a student to the database
     *
     * @param student Student object as parameter
     */
    public void addStudent(Student student) {
        if (CollectionUtils.isNotEmpty(studentRepository.findByFullName(student.getFullName()))) {
            throw new StudentAlreadyExsistException("Student is already created. Cannot duplicated.");
        } else {
            studentRepository.save(student);
        }
    }

    public String updateStudent(@NotNull Student student) {
        return "Update student";
    }

    String deleteStudent(int id) {
        return "Delete student";
    }

}
