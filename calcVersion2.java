package com.company;

import java.util.Scanner;

public class calcVersion2 {

    public static void calculator(long n1,long n2, char op){
        long result;
        switch(op){
            case '+' :
                result = n1 + n2;
                System.out.println("Result : "+result);
                break;
            case '-':
                result = n1 - n2;
                System.out.println("Result : "+result);
                break;
            case '*':
                result = n1 * n2;
                System.out.println("Result : "+result);
                break;
            case '/':
                if(n2==0) {
                    System.out.println("Can't divide by zero, it's an error.");
                    break;
                }
                else{
                    double res = (double)n1 / (double)n2;
                    System.out.println("Result : "+res);
                    }
                    break;
            default :
                System.out.println("Invalid Operator");
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number ");
        long n1 = s.nextInt();
        System.out.println("Enter second number ");
        long n2 = s.nextInt();
        System.out.println("Enter an operator : +, -, *, / ");
        char op = s.next().charAt(0);
        if(n1 >= Long.MIN_VALUE && n1 <= Long.MAX_VALUE){
           if(n2 >= Long.MIN_VALUE && n2 <= Long.MAX_VALUE) {
               calculator(n1,n2,op);
           }
        }
    }
}
//By Shivam Kumar
