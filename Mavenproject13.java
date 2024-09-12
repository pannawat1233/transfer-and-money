/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject13;
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class Mavenproject13 {

    public static void main(String[] args) {
    BankAccount A = new BankAccount(0);
    BankAccount b = new BankAccount(1000);
    double fullmoney = 0;
    boolean lockloop = true;
    Scanner input = new Scanner(System.in);
    
    while (lockloop == true)
    {
       
       try
       {                     
           System.out.println("Enter number"); 
           System.out.println(" 1.deposit\n 2.withdraw\n 3.transfer\n 4.leave");
           
           int number = input.nextInt();
           switch (number) {
               case 1:
                   System.out.println("Enther money");
                   int depositAmount  = input.nextInt();
                   A.deposit(depositAmount );
                   fullmoney = A.getAmount();
                   System.out.println(fullmoney);
                   break;                                    
                case 2:
                    System.out.println("Enter the amount to withdraw");
                    int withdrawAmount  = input.nextInt();
                    A.withdraw(withdrawAmount );
                    fullmoney = A.getAmount();
                    System.out.println(fullmoney);
                    break;
                case 3:
                    System.out.println("Enter the amount to transfer");
                    int Inputtransfer = input.nextInt();
                    A.transfer(b, Inputtransfer);
                    break;
                case 4:
                    lockloop = false;
                    System.out.println("Exiting");
                    break;
                case 5:
                    System.out.println(fullmoney);
                    System.out.println(A.getAmount());
                    System.out.println(b.getAmount());
               default:
                   System.out.println("Invalid option. Please try again.");
                   break;
           }
           
       }
       catch(Exception e)
       {
        System.out.println("An error occurred: " + e.getMessage());
        input.next();
       }
    }
    input.close();
    }
}