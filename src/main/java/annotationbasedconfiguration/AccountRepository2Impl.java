package annotationbasedconfiguration;

import org.springframework.stereotype.Repository;
import pojobean.Account;
import pojobean.AccountRepository;
import pojobean.AccountRepositoryIpml;
import pojobean.AccountServiceIpml;

import java.util.HashMap;
import java.util.Map;

@Repository
public class AccountRepository2Impl implements AccountRepository {
    private Map<Long, Account> accountsMap = new HashMap<>();;
    {
        Account account1 = new Account();
        account1.setId(1L);
        account1.setOwnername("John");
        account1.setBalance(10.0);

        Account account2 = new Account();
        account2.setId(2L);
        account2.setOwnername("Mary");
        account2.setBalance(20.0);

        accountsMap.put(account1.getId(),account1);
        accountsMap.put(account2.getId(), account2);
    }

    @Override
    public void insert(Account account) {
        accountsMap.put(account.getId(), account);
    }

    @Override
    public void update(Account account) {
        accountsMap.put(account.getId(), account);
    }

    @Override
    public Account find(long accountId) {
        return accountsMap.get(accountId);
    }
}
