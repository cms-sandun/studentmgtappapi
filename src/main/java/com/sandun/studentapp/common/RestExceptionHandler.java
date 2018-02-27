/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sandun.studentapp.common;

import com.sandun.studentmgtapp.student.exceptions.StudentAlreadyExsistException;
import javax.persistence.EntityNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import static org.springframework.http.HttpStatus.NOT_FOUND;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@Slf4j
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    protected ResponseEntity<ErrorMessage> handleDefaultException(Exception ex) {
        ErrorMessage errorMessage = new ErrorMessage(ex.getMessage(), "handleDefaultException");
        logger.error(errorMessage);
        return new ResponseEntity<ErrorMessage>(errorMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
    
    @ExceptionHandler(StudentAlreadyExsistException.class)
    protected ResponseEntity<ErrorMessage> handleStudentAlreadyExsistException(StudentAlreadyExsistException ex) {
        ErrorMessage errorMessage = new ErrorMessage(ex.getMessage(), "handleStudentAlreadyExsistException");
        logger.error(errorMessage);
        return new ResponseEntity<ErrorMessage>(errorMessage, new HttpHeaders(), HttpStatus.CONFLICT);
    }    

}
