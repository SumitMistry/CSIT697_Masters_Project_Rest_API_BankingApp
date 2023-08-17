package msu.grad.csit697.banking_app.utils;

import com.mifmif.common.regex.Generex;

import static msu.grad.csit697.banking_app.config.stringPatterns.ACCOUNT_NUMBER_PATTERN_STRING;
import static msu.grad.csit697.banking_app.config.stringPatterns.SORT_CODE_PATTERN_STRING;

public class RandomCodeGenerator {
    Generex CodeGenerex = new Generex(SORT_CODE_PATTERN_STRING);
    Generex accountNumberGenerex = new Generex(ACCOUNT_NUMBER_PATTERN_STRING);

    public RandomCodeGenerator(){}

    public String generateUniqueCode() {
        return CodeGenerex.random();
    }

    public String generateAccountNumber() {
        return accountNumberGenerex.random();
    }
}
