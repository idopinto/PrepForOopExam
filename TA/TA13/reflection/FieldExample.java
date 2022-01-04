package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

public class FieldExample {
    private double d;
    public static final int i = 37;
    String s = "testing";

    public static void main(String[] args) {
        try {
            Class<FieldExample> cls = FieldExample.class;
            FieldExample f = cls.getConstructor().newInstance();
            Field[] fieldList = cls.getDeclaredFields();
            for (Field fld : fieldList) {
                System.out.println("name = " + fld.getName());
                System.out.println("decl class = " + fld.getDeclaringClass());
                System.out.println("type = " + fld.getType());
                System.out.println("value = " + fld.get(f));
                int mod = fld.getModifiers();
                System.out.println("modifiers = " + Modifier.toString(mod));
                System.out.println();
            }

        } catch (IllegalAccessException | InstantiationException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}