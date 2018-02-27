/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sandun.studentmgtapp.mark;

import com.sandun.studentmgtapp.examtype.ExamType;
import com.sandun.studentmgtapp.student.Student;
import com.sandun.studentmgtapp.subect.Subject;

/**
 *
 * @author sandun
 */
public class Mark {
    private Student student;
    private ExamType examType;
    private Subject subject;
    private int marks;

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public ExamType getExamType() {
        return examType;
    }

    public void setExamType(ExamType examType) {
        this.examType = examType;
    }
    
}
