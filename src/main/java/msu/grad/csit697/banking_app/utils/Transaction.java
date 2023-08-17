package msu.grad.csit697.banking_app.utils;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Positive;

public class Transaction {

    private Account sourceAccount;

    private Account targetAccount;

    @Positive(message = "You can only transfer Positive amount.")
    // Prevent fraudulent transfers attempting to abuse currency conversion errors
    @Min(value = 1, message = "Your amount needs to be greater than 1")
    private double amount;

    private String reference;

    @Min(value = -90, message = "Latitude stays in range of -90 and 90")
    @Max(value = 90, message = "Latitude stays in range of -90 and 90")
    private Double latitude;

    @Min(value = -180, message = "Longitude stays in range of -180 and 180")
    @Max(value = 180, message = "Longitude stays in range of -180 and 180")
    private Double longitude;

    public Transaction() {}

    public Account getSourceAccount() {
        return sourceAccount;
    }
    public void setSourceAccount(Account sourceAccount) {
        this.sourceAccount = sourceAccount;
    }
    public Account getTargetAccount() {
        return targetAccount;
    }
    public void setTargetAccount(Account targetAccount) {
        this.targetAccount = targetAccount;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public String getReference() {
        return reference;
    }
    public void setReference(String reference) {
        this.reference = reference;
    }
    public Double getLatitude() {
        return latitude;
    }
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }
    public Double getLongitude() {
        return longitude;
    }
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "TransactionInput{" +
                "sourceAccount=" + sourceAccount +
                ", targetAccount=" + targetAccount +
                ", amount=" + amount +
                ", reference='" + reference + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
