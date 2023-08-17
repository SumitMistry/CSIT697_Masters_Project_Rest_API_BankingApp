package msu.grad.csit697.banking_app.utils;

import msu.grad.csit697.banking_app.config.stringPatterns;

public class InputValidator {

    public static boolean isSearchCriteriaValid(Account account) {
        return stringPatterns.UNIQUE_CODE_PATTERN.matcher(account.getSortCode()).find() &&
                stringPatterns.ACCOUNT_NUMBER_PATTERN.matcher(account.getAccountNumber()).find();
    }

    public static boolean isAccountNoValid(String accountNo) {
        return stringPatterns.ACCOUNT_NUMBER_PATTERN.matcher(accountNo).find();
    }

    public static boolean isCreateAccountCriteriaValid(CreateAccount createAccount) {
        return (!createAccount.getBankName().isEmpty() && !createAccount.getOwnerName().isEmpty());
    }

    public static boolean isSearchTransactionValid(Transaction transaction) {
        // TODO Add checks for large amounts; consider past history of account holder and location of transfers

        if (!isSearchCriteriaValid(transaction.getSourceAccount()))
            return false;

        if (!isSearchCriteriaValid(transaction.getTargetAccount()))
            return false;

        if (transaction.getSourceAccount().equals(transaction.getTargetAccount()))
            return false;

        return true;
    }
}
