package com.revature.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class LifeCycleBean
		implements BeanPostProcessor, BeanNameAware, BeanFactoryAware, DisposableBean, InitializingBean {

	private String secret;
	
	public LifeCycleBean() {
		super();
		System.out.println("Instantiating lifecycle bean");
	}
	
	public void customInit(){
		
		System.out.println("custom init method");
		
	}
	
	public void customDestroy(){
		
		System.out.println("custom destroy method");
		
	}

	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		System.out.println("Populating property: secret");
		this.secret = secret;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("inside after properties set");

	}

	@Override
	public void destroy() throws Exception {
		
		System.out.println("inside destroy");

	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		
		System.out.println("inside set bean factory");

	}

	@Override
	public void setBeanName(String name) {
		
		System.out.println("inside set bean name");

	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Inside before initialization of: " + beanName);
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Inside after initialization of: " + beanName);
		return bean;
	}

}
