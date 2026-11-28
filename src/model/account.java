package model;

import java.math.BigDecimal;

public class account {
    private int accountNumber;
    private int userId;
    private BigDecimal balance;
    private String status;

    public account(){
    }

    public account(int accountNumber, int userId, BigDecimal balance, String status){
        this.accountNumber=accountNumber;
        this.userId=userId;
        this.balance=balance;
        this.status=status;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }

    public int getUserId(){
        return userId;
    }

    public void setUserId(int userId){
        this.userId=userId;
    }

    public BigDecimal getBalance(){
        return balance;
    }

    public void setBalance(BigDecimal balance){
        this.balance=balance;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status=status;
    }
}
