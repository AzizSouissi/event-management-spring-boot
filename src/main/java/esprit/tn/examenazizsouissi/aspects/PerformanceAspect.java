package esprit.tn.examenazizsouissi.aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class PerformanceAspect {
    @Around("execution(void esprit.tn.examenazizsouissi.services.*.*(..))")
    public Object profile(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();
        Object obj = pjp.proceed();
        long elapsedTime = System.currentTimeMillis() - start;
        log.info("Méthode exécutée : " + pjp.getSignature().getName());
        log.info("Method execution time: " + elapsedTime + " milliseconds.");
        return obj;
    }
}
