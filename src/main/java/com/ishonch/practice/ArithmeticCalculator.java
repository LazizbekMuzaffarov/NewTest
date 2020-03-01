package com.ishonch.practice;

/**
 * Этот класс содержит простые арифметические функции
 */
public class ArithmeticCalculator {
    public Integer add(Integer first, Integer second) {
        // Muzaffar
        return null;
    }

    public Integer subtract(Integer first, Integer second) {
        // Navruz
        return null;
    }

    public Integer divide(Integer first, Integer second) {
        // Hamza
        Integer number1 , number2;
        Integer result;
        number1 = first;
        number2 = second;
        result = number1 / number2;
        if( number2 > 0)
        {
            return result;
        }
        else
        {
            return null;
        }

    }

    public Integer multiply(Integer first, Integer second) {
        // Lazizbek
        return first+second;
    }

    public Integer mod(Integer first, Integer second) {
        // Adham
        return null;
    }

    public Integer abs(Integer first) {
        if (first<0)
        {
            return first*(-1);
        }
        else
        {
        // Husanboy
        return first;
        }
        //это полажения нужно math библатека
        /*return abs(first)*/
    }

    public Integer pow(Integer first, Integer second) {
       if(first==0){
           return 0;
       }else if (second==0){
            return 1;
       }
       int a=1;
        for(int i=0;i<second;i++){
            a*=first;
       }
        return a;
    }
}
