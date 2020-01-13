package org.springframework.tests.parse;

import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.parser.User;
import org.springframework.beans.propertyeditors.FileEditor;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.ClassUtils;

import java.beans.PropertyEditor;
import java.io.File;

import static org.junit.Assert.assertTrue;

/**
 * @Description TODO
 * @Date 2020/1/13 11:35
 * @Author hanyf
 */
public class CustomerXmlDemo {

	@Test
	public void demo() throws Exception {
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
		reader.loadBeanDefinitions(new ClassPathResource("applicationCountext.xml"));

		User user = (User) beanFactory.getBean("coustomerBean");
		System.out.println(user.getEmail());
	}
}
