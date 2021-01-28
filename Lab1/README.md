# Lab 1

Goals
Understand method and constructor overloading  

Description  
Create a class BankAccount with methods to withdraw funds, deposit funds, display account information such as account number and balance  
The user can open a bank account providing the following information:  
●	name and initial balance  
●	name only (initial balance set to 0 in that case)  
Account number should be assigned in the constructor based on the value in the static field of the class.  
Overload the withdraw method with one that also takes a fee and deducts that fee from the account.  
Overload the deposit method with one that also takes an interest and increases all the balance in the account by that percent.  
After every transaction account number and balance should be displayed.  
In the main method, create several BankAccount objects for testing purposes, deposit and withdraw funds from them in all possible ways.  