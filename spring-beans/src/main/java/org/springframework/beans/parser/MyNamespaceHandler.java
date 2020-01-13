package org.springframework.beans.parser;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @Description 自定义解析器
 * @Date 2020/1/13 11:11
 * @Author hanyf
 */
public class MyNamespaceHandler extends NamespaceHandlerSupport {

	@Override
	public void init() {
		registerBeanDefinitionParser("user", new UserBeanDefinitionParser());
	}
}
