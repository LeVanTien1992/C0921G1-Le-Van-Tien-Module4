package com.example.ung_dung_muon_sach.aspest;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class Logger {

    @AfterThrowing(value = "execution(* com.example.ung_dung_muon_sach.controller.BookController.orderBook(..))")
    public void checkException(){

        System.out.println("====================");
        System.out.println("Lỗi rồi bạn ơi");
    }


    @After(value = "execution(* com.example.ung_dung_muon_sach.controller.BookController.orderBook(..))")
    public void loggerDone(){

        System.out.println("====================");
        System.out.println("Xong rồi nhé!");
    }
}
