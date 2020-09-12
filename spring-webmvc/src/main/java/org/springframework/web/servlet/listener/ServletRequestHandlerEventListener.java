package org.springframework.web.servlet.listener;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.ServletRequestHandledEvent;

/**
 * @Description 专门监听 ServletRequestHandledEvent 时间的监听器
 * @Date 2020/9/12 15:16
 * @Author hanyf
 */
@Component
public class ServletRequestHandlerEventListener implements ApplicationListener<ServletRequestHandledEvent> {

	private static final Log logger = LogFactory.getLog(ServletRequestHandlerEventListener.class);

	@Override
	public void onApplicationEvent(ServletRequestHandledEvent event) {
		//url=[/demowar_war/controller/hello]; client=[127.0.0.1]; method=[GET]; servlet=[dispatcher]; session=[null]; user=[null]; time=[143ms]; status=[OK]
		logger.info(event.getDescription());
		logger.info("返回状态码为：" + event.getStatusCode()); //返回状态码为：200
		logger.info("异常信息为：" + event.getFailureCause()); //异常信息为：null
		logger.info("处理请求耗时为：" + event.getProcessingTimeMillis()); //处理请求耗时为：143
		logger.info("事件源为：" + event.getSource()); //事件源为：org.springframework.web.servlet.DispatcherServlet@3e7fadbb
	}
}
