package beanscopes;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojobean.Account;

public class Main {
    public static void main(String[] args) {


        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanscopes/beans.xml");
        Account accountSingleton1 = applicationContext.getBean("account1", Account.class);
        accountSingleton1.setOwnername("David");
        Account accountPrototype1 = applicationContext.getBean("account2", Account.class);
        accountPrototype1.setOwnername("David");

        Account accountSingletonAfter = applicationContext.getBean("account1", Account.class);
        Account accountPrototypeAfter = applicationContext.getBean("account2", Account.class);

        System.out.println("Account1: " +accountSingletonAfter.getOwnername());
        System.out.println("Account2: " +accountPrototypeAfter.getOwnername());
    }
}
