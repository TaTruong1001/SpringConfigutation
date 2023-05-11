package javabasedconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pojobean.AccountRepository;
import pojobean.AccountRepositoryIpml;
import pojobean.AccountService;
import pojobean.AccountServiceIpml;

@Configuration
public class BeanConfiguration {
    @Bean
    public AccountService accountService(){
        AccountServiceIpml bean = new AccountServiceIpml();
        //inject dependency
        bean.setAccountRepository(accountDao());
        return bean;
    }
    public AccountRepository accountDao(){
        AccountRepository bean = new AccountRepositoryIpml();
        return bean;
    }
}
