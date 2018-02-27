/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sandun.studentmgtapp.student;

import com.sandun.studentmgtapp.classroom.ClassRoom;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author sandun
 */
@Entity
public class Student {

    @Id
    @GeneratedValue
    private int id;
    private String fullName;
    private String address;
    private String gender;
    private String contactno;
    private String dob;
    private String email;

    public int getStudentId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public String getContactno() {
        return contactno;
    }

    public String getDob() {
        return dob;
    }

    public String getEmail() {
        return email;
    }

}
