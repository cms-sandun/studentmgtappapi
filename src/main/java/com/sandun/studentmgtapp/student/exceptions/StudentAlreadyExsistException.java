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
public class StudentAlreadyExsistException extends RuntimeException{
    
    public StudentAlreadyExsistException() {
        super();
    }

    public StudentAlreadyExsistException(String s) {
        super(s);
    }

    public StudentAlreadyExsistException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public StudentAlreadyExsistException(Throwable throwable) {
        super(throwable);
    }
    
}
