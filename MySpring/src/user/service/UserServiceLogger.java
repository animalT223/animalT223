package user.service;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

public class UserServiceLogger {
	public static final Logger log=Logger.getLogger(UserServiceLogger.class);
	
	public void brfore(JoinPoint jp){
		log.info("调用"+jp.getTarget()+"的"+jp.getSignature().getName()+"方法。方法入参："+Arrays.toString(jp.getArgs()));
	}
	
	public void alterPeturning(JoinPoint jp,Object result){
		log.info("调用"+jp.getTarget()+"的"+jp.getSignature().getName()+"方法。方法返回值："+result);
	}

}
