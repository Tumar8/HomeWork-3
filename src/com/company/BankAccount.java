package com.company;

public class BankAccount   {
    double amount;

    public double getAmount() {
        return amount;
    }
    public void deposit(double sum){
        amount= amount+sum;
        System.out.println("balance:" + amount);
    }
    public void withDraw(double sum) throws LimitException{
        if (sum>amount) {
            throw new LimitException("Your requiring amount for withdrawal is >  than your amount", amount);
        }
        amount = amount - sum;
        System.out.println("drawing "+sum);
    }
}

