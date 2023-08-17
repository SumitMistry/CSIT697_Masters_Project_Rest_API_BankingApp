package msu.grad.csit697.banking_app.config;

import java.util.regex.Pattern;

public class stringPatterns {

    public static final String SUCCESS =
            "Successfully executed!";
    public static final String NO_ACCOUNT_FOUND =
            "Unable to find the match with given unique code and or account number";
    public static final String INVALID_SEARCH_CRITERIA =
            "Unable to retrieve the search based on given unique code and or account number";


    public static final String INSUFFICIENT_ACCOUNT_BALANCE =
            "NSF: Non-sufficient balance in your account.";

    public static final String SORT_CODE_PATTERN_STRING = "[0-9]{2}-[0-9]{2}-[0-9]{2}";

    public static final String ACCOUNT_NUMBER_PATTERN_STRING = "[0-9]{8}";
    public static final Pattern UNIQUE_CODE_PATTERN = Pattern.compile("^[0-9]{2}-[0-9]{2}-[0-9]{2}$");
    public static final Pattern ACCOUNT_NUMBER_PATTERN = Pattern.compile("^[0-9]{8}$");

    public static final String INVALID_TRANSACTION =
            "Invalid input data: Invalid Account number and or Invalid transaction number.";
    public static final String CREATE_ACCOUNT_FAILED =
            "Error while creating a new account";
}
