/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sandun.studentmgtapp.student.exceptions;

/**
 *
 * @author sandun
 */
public class StudentException extends RuntimeException {

    public StudentException() {
        super();
    }

    public StudentException(String s) {
        super(s);
    }

    public StudentException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public StudentException(Throwable throwable) {
        super(throwable);
    }

}
