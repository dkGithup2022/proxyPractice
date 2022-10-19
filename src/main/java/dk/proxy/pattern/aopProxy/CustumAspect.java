package dk.proxy.pattern.aopProxy;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CustumAspect {
    @Around("bean(gameComponent)")
    public void timeStamp(ProceedingJoinPoint point) throws Throwable{
        Long before = System.currentTimeMillis();
        point.proceed();
        System.out.println("took " + (System.currentTimeMillis() - before));
    }
}
/*
aspect & around 설정을 해 놓으면
빈이 생성이 될때, 해당 aop 로직이 같이 수행 가능한 프록시 객체를 같이 생성이 되고
나중에 주입된 컴포넌트가 실행될땐 이 프록시 객체가 불린다.
 */
