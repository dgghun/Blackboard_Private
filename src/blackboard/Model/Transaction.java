package blackboard.Model;

import java.util.Date;
import java.util.Objects;

/**
 *
 * 
 */
public class Transaction {
    private Date date;
    private String payee;
    private Double transactionAmount;
    private String memo;
    private String checkingNumber;
    private Boolean cleared;

    //Empty constructor
    public Transaction(){};
    
    // Constructor
    public Transaction(Date date, String payee, Double transactionAmount, String memo, String checkingNumber, Boolean cleared) {
        this.date = date;
        this.payee = cleanUpSpaces(payee.trim());
        this.transactionAmount = transactionAmount;
        this.memo = cleanUpSpaces(memo.trim());
        this.checkingNumber = cleanUpSpaces(checkingNumber.trim());
        this.cleared = cleared;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        // Need to decide on format
        this.date = date;
    }

    public String getPayee() {
        return payee;
    }

    public void setPayee(String payee) {
        this.payee = cleanUpSpaces(payee.trim());
    }

    public Double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(Double transactionAmount) {
        // Need to format for money
        this.transactionAmount = transactionAmount;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = cleanUpSpaces(memo.trim());
    }

    public String getCheckingNumber() {
        return checkingNumber;
    }

    public void setCheckingNumber(String checkingNumber) {
        this.checkingNumber = cleanUpSpaces(checkingNumber.trim());
    }

    public Boolean getCleared() {
        return cleared;
    }

    public void setCleared(Boolean cleared) {
        this.cleared = cleared;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.date);
        hash = 29 * hash + Objects.hashCode(this.payee);
        hash = 29 * hash + Objects.hashCode(this.transactionAmount);
        hash = 29 * hash + Objects.hashCode(this.memo);
        hash = 29 * hash + Objects.hashCode(this.checkingNumber);
        hash = 29 * hash + Objects.hashCode(this.cleared);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Transaction other = (Transaction) obj;
        if (!Objects.equals(this.payee, other.payee)) {
            return false;
        }
        if (!Objects.equals(this.memo, other.memo)) {
            return false;
        }
        if (!Objects.equals(this.checkingNumber, other.checkingNumber)) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        if (!Objects.equals(this.transactionAmount, other.transactionAmount)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Transaction{" + "date=" + date + ", transactionAmount=" + transactionAmount + '}';
    }
    
    
    /**
     * Removes leading, trailing and duplicate empty spaces
     * @param str
     * @return a cleaned up string
     */
    private String cleanUpSpaces(String str){
        
        StringBuilder temp = new StringBuilder(str.trim()); //Trim leading/trailing spaces
        int length = temp.length();
        
        for(int i = 0; i < length; i++){
            
            //If there are two empty spaces next to each other
            if(temp.charAt(i) == ' ' && temp.charAt(i+1) == ' '){
                temp.deleteCharAt(i+1);     // Delete 2nd empty space
                length = temp.length();     // Update length for loop
                i = i -1;                   // Set index back to current spot. 
            }
        }
        return temp.toString();
    }
     
}
