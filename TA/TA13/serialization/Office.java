package serialization;

import java.io.*;

public class Office implements Serializable {
    private static final long serialVersionUID = 1L; 
    private transient Address address; 
    private Person person;

    private void writeObject(ObjectOutputStream out)
            throws IOException {
        out.defaultWriteObject(); 
        out.writeInt(address.getHouseNumber());
    } 
 
    private void readObject(ObjectInputStream in)
            throws ClassNotFoundException, IOException { 
        in.defaultReadObject(); 
        int houseNumber = in.readInt();
        Address a = new Address();
        a.setHouseNumber(houseNumber); 
        this.setAddress(a) ; 
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Office{" +
                "address=" + address +
                ", person=" + person +
                '}';
    }

    public static void main(String[] args) {
        Office office = new Office();
        Person person = new Person("Alice", 25);
        office.setPerson(person);
        Address address = new Address();
        address.setHouseNumber(5);
        office.setAddress(address);

        try {
            OutputStream fos = new FileOutputStream("office.ser");
            ObjectOutputStream out = new ObjectOutputStream(fos);
            out.writeObject(office); // Serialize to file

            InputStream fis = new FileInputStream("office.ser");
            ObjectInputStream in = new ObjectInputStream(fis);
            Office desOffice = (Office) in.readObject(); // Deserialize from file
            System.out.println("Before serialization:\n" + office);
            System.out.println("After serialization:\n" + desOffice);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}
