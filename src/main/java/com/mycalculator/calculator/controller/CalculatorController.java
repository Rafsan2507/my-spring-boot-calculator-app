package com.mycalculator.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @GetMapping("/home")
    public String home(){
        return "Welcome";
    }
    @GetMapping("/add")
    public int add(@RequestParam("num1") int a,@RequestParam("num2") int b){
        return a+b;
    }
    @GetMapping("/sub")
    public int sub(@RequestParam("num1") int a,@RequestParam("num2") int b){
        return a-b;
    }
    @GetMapping("/mul")
    public int mul(@RequestParam("num1") int a,@RequestParam("num2") int b){
        return a*b;
    }
    @GetMapping("/div")
    public double div(@RequestParam("num1") int a,@RequestParam("num2") int b){
        return (double)a/b;
    }
}
