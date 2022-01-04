package reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodInvoke {
    public static void main(String[] args) {
        try {
            Class<?> cls = MyClass.class;
            Class<?>[] partypes = {int.class, int.class};
            Method method = cls.getDeclaredMethod("add", partypes);
            method.setAccessible(true);
            MyClass obj = new MyClass();
            Object[] arglist = new Object[2];
            arglist[0] = 27;
            arglist[1] = 3;
            Object retObj = method.invoke(obj, arglist);
            Integer retInt = (Integer) retObj;
            System.out.println(retInt);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
