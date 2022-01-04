package serialization;

import java.io.*;

public class SerializeEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("Pam", 123456789, 30);

        try {
            OutputStream fos = new FileOutputStream("employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fos);
            out.writeObject(emp); // Serialize to file

            InputStream fis = new FileInputStream("employee.ser");
            ObjectInputStream in = new ObjectInputStream(fis);
            Employee desEmp = (Employee) in.readObject(); // Deserialize from file

            System.out.println(desEmp.getName());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
