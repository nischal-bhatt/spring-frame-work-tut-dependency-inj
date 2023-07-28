package sfg.di.demo.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean , BeanNameAware,
        BeanFactoryAware, ApplicationContextAware {

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("factori");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("name is : " + s);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("termiunated");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("properties");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("application context set");
    }

    public void afterInit()
    {
        System.out.println("initializing...");
    }

    public void beforeInit()
    {
        System.out.println("before init");
    }
}
