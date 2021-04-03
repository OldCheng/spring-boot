//package com.example.introduction.aop;
//
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.After;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.Pointcut;
//import org.aspectj.lang.reflect.MethodSignature;
//import org.springframework.stereotype.Component;
//
///**
// * 通过注解的方式 打印方法执行时间
// * @Author 程杰
// * @Date 2021/1/23 15:09
// * @Version 1.0
// */
//@Aspect
//@Component
//public class TimeAspect {
//
//    /**
//     * 开始时间
//     */
//    private Long begin;
//
//    /**
//     * 结束时间
//     */
//    private Long end;
//
//    //@Pointcut("@annotation(com.gree.ecommerce.aop.TimeOperation)")
//    @Pointcut("@within(com.gree.ecommerce.aspect.TimeOperation)")
//    public void logOperation(){}
//
//    @Before(value = "logOperation()")
//    public void before(){
//        begin = System.currentTimeMillis();
//    }
//
//    @After(value = "logOperation()")
//    public void after(JoinPoint jp){
//        end = System.currentTimeMillis();
//        MethodSignature methodSignature = (MethodSignature) jp.getSignature();
//        //所属类的类名
//        String className1 = jp.getSignature().getDeclaringTypeName();//全类名
//        String className = jp.getSignature().getDeclaringType().getSimpleName();
//        String voidName = jp.getSignature().getName();
//        // 参数类型
//        Class[] parameterTypes = methodSignature.getParameterTypes();
//        // 参数名
//        String[] parameterNames = methodSignature.getParameterNames();
//        StringBuilder operateRecordLog = new StringBuilder();
//        operateRecordLog.append("-----record-begin---\n");
//        operateRecordLog.append("所属类的类名: "+className +"\n");
//        operateRecordLog.append("  执行的方法: "+ voidName);
//        operateRecordLog.append("(");
//        for (int i = 0; i < parameterTypes.length; i++) {
//            String parameterTypeName = parameterTypes[i].getName();
//            String typeName = parameterTypeName.substring(parameterTypeName.lastIndexOf(".") + 1);
//            String parameterName = parameterNames[i];
//            //参数列表
//            operateRecordLog.append(typeName).append(" ").append(parameterName);
//            if(i != parameterTypes.length - 1){
//                operateRecordLog.append(",");
//            }
//        }
//        operateRecordLog.append(")\n");
//        //获取传入目标方法的参数
//        Object[] args = jp.getArgs();
//        for (int i = 0; i < args.length; i++) {
//            operateRecordLog.append(" 第").append(i+1).append("个参数为: ").append(args[i]);
//            if(i != args.length - 1){
//                operateRecordLog.append("\n");
//            }
//        }
//        operateRecordLog.append("\n用时 " + (end - begin) + " 毫秒");
//        operateRecordLog.append("\n-----record-end-----");
//        System.out.println("\nListen execution time\n"+operateRecordLog.toString());
//    }
//
//    //@Around("logOperation()")
//    public void around(ProceedingJoinPoint jp) throws Throwable {
//        long begin1 = System.currentTimeMillis();
//        System.out.println("------around----before--------------");
//        jp.proceed();
//        System.out.println("------around------after------------");
//        long end1 = System.currentTimeMillis();
//        System.out.println("用时"+(end1 - begin1)+"毫秒===========================");
//        MethodSignature methodSignature = (MethodSignature) jp.getSignature();
//        String className = methodSignature.getDeclaringType().getSimpleName();
//        String methodName = methodSignature.getName();
//        System.out.println(className);
//        System.out.println(methodName);
//    }
//
//}
