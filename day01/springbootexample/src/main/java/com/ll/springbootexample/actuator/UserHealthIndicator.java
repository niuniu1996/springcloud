package com.ll.springbootexample.actuator;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health.Builder;
import org.springframework.stereotype.Component;

/**
 * 扩展健康端点
 */
@Component
public class UserHealthIndicator extends AbstractHealthIndicator {

	@Override
	protected void doHealthCheck(Builder builder) throws Exception {
		builder.up().withDetail("status", true);
		//builder.down().withDetail("status", false);
	}

}
