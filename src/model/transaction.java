package model;
import java.math.BigDecimal;
import java.security.Timestamp;

public class transaction {
    private int transactionId;
    private int accountNumber;
    private String transactionType;
    private BigDecimal amount;
    private String description;
    private Timestamp transactionDate;


public transaction(){
}

public transaction(int transactionId,int accountNumber, String transactionType, BigDecimal amount, String description, Timestamp transactionDate){
    this.transactionId=transactionId;
    this.accountNumber=accountNumber;
    this.transactionType=transactionType;
    this.amount=amount;
    this.description=description;
    this.transactionDate=transactionDate;
}

public int getTransactionId(){
    return transactionId;
}

public void setTransactionId(int transactionId){
    this.transactionId=transactionId;
}

public int getAccountNumber(){
    return accountNumber;
}

public void setAccountNumber(int accountNumber){
    this.accountNumber=accountNumber;
}

public String getTransactionType(){
    return transactionType;
}

public void setTransactionType(String transactionType){
    this.transactionType=transactionType;
}

public BigDecimal getAmount(){
    return amount;
}

public void setAmount(BigDecimal amount){
    this.amount=amount;
}

public String getDescription(){
    return description;
}

public void setDescription(String description){
    this.description=description;
}

public Timestamp getTransactionDate(){
    return transactionDate;
}

public void setTransactionDate(Timestamp transactionDate){
    this.transactionDate=transactionDate;
}

}


