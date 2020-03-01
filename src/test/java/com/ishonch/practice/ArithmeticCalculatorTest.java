package com.ishonch.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class ArithmeticCalculatorTest {
    private ArithmeticCalculator arithmeticCalculator;

    @BeforeEach
    public void setUp() {
        arithmeticCalculator = new ArithmeticCalculator();
    }

    @Test
    public void test() {
        assertEquals(1,1);
    }


    @Test
    @DisplayName("Функция Pow (n,m) правильная!!")
    public void testPow(){
        int result = arithmeticCalculator.pow(2,3);
        assertEquals(result,8);
    }
    @Test
    @DisplayName("Функция Pow (n,0) правильная!!")
    public void testPow0(){
        int result = arithmeticCalculator.pow(2,0);
        assertEquals(result,1);
    }
    @Test
    @DisplayName("Функция Pow (0,n) правильная!!")
    public void testPow00(){
        int result = arithmeticCalculator.pow(0,2);
        assertEquals(result,0);
    }



    @Test
    @DisplayName("Результат практики деления двух чисел")
    public void testDivide()
    {
        int result = arithmeticCalculator.divide(8,4);
        assertEquals(result, 2);}


    @Test
    @DisplayName("abs правильно работает")
    public void testabs(){
        int result;

       result= arithmeticCalculator.abs(-1115);
       assertEquals(result,1115);

    }

    @Test
    @DisplayName("multiply правильно работает")
    public void testmultiply(){
        int result;

        result= arithmeticCalculator.multiply(5,10);
        assertEquals(result,15);

    }


}