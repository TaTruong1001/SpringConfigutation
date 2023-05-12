package beanlifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("lifeCycleConfiguration/beans.xml");
        BeansLifeCycle beans = applicationContext.getBean("beansLifeCycle", BeansLifeCycle.class);

    }
}
