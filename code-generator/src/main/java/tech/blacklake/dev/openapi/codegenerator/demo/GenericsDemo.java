package tech.blacklake.dev.openapi.codegenerator.demo;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author cuiyichen
 * @date 2022/05/19 21:51:19
 */
public class GenericsDemo {
    public static void main(String[] args) throws Exception {
        Class<AController> aControllerClass = AController.class;

        Method method = aControllerClass.getMethod("getUser");
        Method ok = aControllerClass.getMethod("ok");
        Type genericReturnType = method.getGenericReturnType();
        Type genericReturnType1 = ok.getGenericReturnType();
        Class<?> returnType = ok.getReturnType();

        if (genericReturnType instanceof ParameterizedType) {
            ParameterizedType p = (ParameterizedType) genericReturnType;
            System.out.println(p.getRawType());
        }
    }
}
