package com.example.ung_dung_muon_sach.aspest;

import com.example.ung_dung_muon_sach.model.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Aspect
@Component
public class Logger {
    // aspect => advice => pointCut => joinPoint

    @AfterReturning("execution(public * com.example.ung_dung_muon_sach.service.BookService.*(..))")
    private void logService(JoinPoint joinPoint){
        String className = joinPoint.getTarget().getClass().getName();
        String methodName = joinPoint.getSignature().getName();
        for (Object arg: joinPoint.getArgs()){
            if(arg instanceof Book){
                Book book = (Book) arg;
                System.err.println("Book name is: " + book.getName() + " and time " + LocalTime.now());
            }
        }
        System.err.println("Class là : " +className+ " Method là : " +methodName);

    }

}
