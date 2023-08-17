package msu.grad.csit697.banking_app.services;

import msu.grad.csit697.banking_app.models.Account;
import msu.grad.csit697.banking_app.repositories.AccountRepository;
import msu.grad.csit697.banking_app.repositories.TransactionRepository;
import msu.grad.csit697.banking_app.utils.RandomCodeGenerator;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountService {

    private final AccountRepository accountRepository;
    private final TransactionRepository transactionRepository;

    public AccountService(AccountRepository accountRepository,
                          TransactionRepository transactionRepository) {
        this.accountRepository = accountRepository;
        this.transactionRepository = transactionRepository;
    }

    public Account getAccount(String sortCode, String accountNumber) {
        Optional<Account> account = accountRepository
                .findBySortCodeAndAccountNumber(sortCode, accountNumber);

        account.ifPresent(value ->
                value.setTransactions(transactionRepository
                        .findBySourceAccountIdOrderByInitiationDate(value.getId())));

        return account.orElse(null);
    }

    public Account getAccount(String accountNumber) {
        Optional<Account> account = accountRepository
                .findByAccountNumber(accountNumber);

        return account.orElse(null);
    }

    public Account createAccount(String bankName, String ownerName) {
        RandomCodeGenerator randomCodeGenerator = new RandomCodeGenerator();
        Account newAccount = new Account(bankName, ownerName, randomCodeGenerator.generateUniqueCode(), randomCodeGenerator.generateAccountNumber(), 0.00);
        return accountRepository.save(newAccount);
    }
}
