package serialization;

import java.io.*;

public class SerializeTwoEmployees {
    public static void main(String[] args) {
        Employee emp = new Employee(); // must be Serializable
        try {
            OutputStream fos = new FileOutputStream("anotherEmployee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fos);
            emp.setName("Carol");
            out.writeObject(emp); // saves with name = “Carol”
            emp.setName("Cheryl");
            out.writeObject(emp); // saves object with name = ?

            InputStream fis = new FileInputStream("anotherEmployee.ser");
            ObjectInputStream in = new ObjectInputStream(fis);
            Employee desEmp = (Employee) in.readObject();
            System.out.println(desEmp.getName());
            desEmp = (Employee) in.readObject();
            System.out.println(desEmp.getName());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
