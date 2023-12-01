/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package homework2;

import java.util.Scanner;

/**
 *
 * @author Tatiana
 */
public class Homework2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Create a program that will ask the user for two numbers (separately!) 
as input and then output a message telling them which number was bigger OR if they were the same.*/
        Scanner myScanner = new Scanner (System.in);
        int num1 = 0;
        int num2 = 0;
        try{
            System.out.println("Choose a number");
            num1=myScanner.nextInt();
            System.out.println("Choose another number");        
            num2=myScanner.nextInt();
        }
        catch (Exception e){
            System.out.println("Error! This is not a number!");
        }
        if (num1>num2){
            System.out.println(num1+" is bigger than "+num2);
        }
        else if (num1<num2){
            System.out.println(num2+" is bigger than "+num1);
        }
        else if (num1==num2){
            System.out.println("The numbers are the same");
        }
        else {
            System.out.println("Error!");
        }
        /*2)	Create a program that will ask the user for two numbers and then calculate the result of 
        DIVIDING the first number by the second number (NB – this might not be an integer!).*/
        double division = 0;
        if (num2!=0){
            division=num1/num2;
            System.out.println(num1+" divided by "+num2+" is "+division);
        } else {
            System.out.println("Error!");
        }               
        /*3)	Create a program that will ask the user for a number and then output a message saying whether the number 
        is ODD or EVEN.
Reminder: modulus  % in Java. A number is EVEN if number % 2 equals 0*/
        if ((num1%2)==0){
            System.out.println(num1+" is an even number.");
        }
        else{
            System.out.println(num1+" is an ODD number.");
        }
        
        //sum = nun1 + num2
        int sum = num1 + num2;
        System.out.println("The sum of "+ num1 + " + " + num2 + " is " + sum);
        
        //sub = num1 - num2
        int sub = num1 - num2;
        System.out.println("The subtraction of " + num1 + " - " + num2 + " is " + sub);

    }
}