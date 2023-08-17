package msu.grad.csit697.banking_app.utils;

import javax.validation.constraints.Positive;
import java.util.Objects;

public class Withdraw extends Account {
    String sortCode;
    String accountNumber;

    // Check the Transfer amount is Positive and not the negative number
    @Positive(message = "Please check the amount, the positive input to be expected")
    private double amount;

    public Withdraw() {
        this.sortCode = super.getSortCode();
        this.accountNumber = super.getAccountNumber();
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "AccountInput{" +
                "sortCode='" + sortCode + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(sortCode, accountNumber, amount);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Withdraw that = (Withdraw) o;
        return Objects.equals(sortCode, that.sortCode) &&
                Objects.equals(accountNumber, that.accountNumber) &&
                Objects.equals(amount, that.amount);
    }

}
