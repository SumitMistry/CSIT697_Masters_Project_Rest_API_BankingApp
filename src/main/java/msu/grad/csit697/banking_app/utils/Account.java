package msu.grad.csit697.banking_app.utils;

import javax.validation.constraints.NotBlank;
import java.util.Objects;

public class Account {

    @NotBlank(message = "Bank unique code is mandatory")
    private String uniqueCode;

    @NotBlank(message = "Bank Account number is mandatory")
    private String accountNumber;

    public Account() {}

    public String getUniqueCode() {
        return uniqueCode;
    }
    public void setUniqueCode(String uniqueCode) {
        this.uniqueCode = uniqueCode;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "AccountInput{" +
                "sortCode='" + uniqueCode + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account that = (Account) o;
        return Objects.equals(uniqueCode, that.uniqueCode) &&
                Objects.equals(accountNumber, that.accountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uniqueCode, accountNumber);
    }
}
