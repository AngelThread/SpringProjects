package com.soundsystem.advance.wiring;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component
@Conditional(MagicExistCondition.class)
public class MagicBean {

	public MagicBean() {
		// TODO Auto-generated constructor stub
	}

}
