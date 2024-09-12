/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject13;


class BankAccount
{
    double Amount ;
    double getAmount()
    {
        return Amount;
    }
    public BankAccount (double money)
    {
        Amount = money;
    }
    void deposit (double money)
    {
        Amount = Amount + money;
        
    }
    void withdraw (double money)
    {
        Amount =  Amount - money;
    }
    
    void transfer (BankAccount target,double money)
    {
       if(Amount >= money)
       {
           target.deposit(money);
       }
       else
       {
           System.out.println("Not money");
       }
    }
}



