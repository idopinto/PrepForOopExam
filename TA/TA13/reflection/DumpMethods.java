package reflection;

import java.lang.reflect.Method;

public class DumpMethods {
    public static void main(String[] args) {
        try {
            Class<?> c = Class.forName("java.lang.String");
            Method[] allMethods = c.getDeclaredMethods();
            for (Method method : allMethods) {
                System.out.println("- Method " + method.getName());
                Class<?>[] params = method.getParameterTypes();
                for (int j = 0; j < params.length; j++) {
                    System.out.println("  + param #" + j + " " + params[j]);
                }
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
