package com.soundsystem.advance.wiring;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class MagicExistCondition implements Condition{

	@Override
	public boolean matches(ConditionContext arg0, AnnotatedTypeMetadata arg1) {
		return true;
	}

}
