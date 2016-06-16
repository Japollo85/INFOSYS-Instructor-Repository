package com.mercy.javatraining.computations;

public class Fibonacci {

    public static void main(String args[]) {
 
        
        int number = 21;
 
        System.out.println("\n\nFibonacci series upto " + number +" numbers : ");
        for(int i=1; i<=number; i++){
            System.out.print(fibonacciRecusion(i) +" ");
        }
        
        fibonacciLoop(number);
    } 
 
    public static int fibonacciRecusion(int number){
        if(number == 1 || number == 2){
            return 1;
        }
 
        return fibonacciRecusion(number-1) + fibonacciRecusion(number -2); //tail recursion
    }
 
    public static void fibonacciLoop(int number){
       
        int fibo1=1, fibo2=1, fibonacci=1;
        System.out.println("____");

        for(int i= 3; i<= number; i++){
            fibonacci = fibo1 + fibo2; //Fibonacci number is sum of previous two Fibonacci number
            fibo1 = fibo2;
            fibo2 = fibonacci;
            System.out.print(fibonacci+",");

 
        }
    }
	
}
