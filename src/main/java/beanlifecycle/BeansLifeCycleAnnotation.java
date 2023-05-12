package beanlifecycle;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Component
public class BeansLifeCycleAnnotation {
    @PostConstruct
    public void init() throws Exception{
        System.out.println("Init method is called");
    }
    @PreDestroy
    public void destroy() throws RuntimeException{
        System.out.println("Destroy method is called");
    }
}
