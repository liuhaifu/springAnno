package com.cyou;

import org.junit.Test;
import com.cyou.bean.Person;
import com.cyou.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class MainApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
		Person person = applicationContext.getBean(Person.class);
		System.out.println(person);

		String[] personNames = applicationContext.getBeanNamesForType(Person.class);
		Arrays.stream(personNames).forEach(name ->System.out.println(name));


	}

	@Test
	public void testScan() {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		Arrays.stream(beanDefinitionNames).forEach(name-> System.out.println(name));
		System.out.println("test");
	}
}
