package org.springframework.beans.parser;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * @Description 自定义 User 解析器
 * @Date 2020/1/13 11:14
 * @Author hanyf
 */
public class UserBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

	/**
	 * Determine the bean class corresponding to the supplied {@link Element}.
	 * <p>Note that, for application classes, it is generally preferable to
	 * override {@link #getBeanClassName} instead, in order to avoid a direct
	 * dependence on the bean implementation class. The BeanDefinitionParser
	 * and its NamespaceHandler can be used within an IDE plugin then, even
	 * if the application classes are not available on the plugin's classpath.
	 * @param element the {@code Element} that is being parsed
	 * @return the {@link Class} of the bean that is being defined via parsing
	 * the supplied {@code Element}, or {@code null} if none
	 * @see #getBeanClassName
	 */
	@Override
	protected Class<?> getBeanClass(Element element) {
		return User.class;
	}

	/**
	 * Parse the supplied {@link Element} and populate the supplied
	 * {@link BeanDefinitionBuilder} as required.
	 * <p>The default implementation does nothing.
	 * @param element the XML element being parsed
	 * @param bean used to define the {@code BeanDefinition}
	 */
	@Override
	protected void doParse(Element element, BeanDefinitionBuilder bean) {
		String userName = element.getAttribute("userName");
		String email = element.getAttribute("email");
		if (StringUtils.hasText(userName)) {
			bean.addPropertyValue("userName", userName);
		}
		if (StringUtils.hasText(email)) {
			bean.addPropertyValue("email", email);
		}
	}
}
