package user.service;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

public class UserServiceLogger {
	public static final Logger log=Logger.getLogger(UserServiceLogger.class);
	
	public void brfore(JoinPoint jp){
		log.info("����"+jp.getTarget()+"��"+jp.getSignature().getName()+"������������Σ�"+Arrays.toString(jp.getArgs()));
	}
	
	public void alterPeturning(JoinPoint jp,Object result){
		log.info("����"+jp.getTarget()+"��"+jp.getSignature().getName()+"��������������ֵ��"+result);
	}

}
