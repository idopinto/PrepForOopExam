package designpatterns.iterator;

import java.util.List;

/**
 * @author Ohad Klein
 */
public class Main {
    public static void main(String[] args) {
        Student ido = new Student("Ido", 22);
        Student orya = new Student("Orya", 23);
        Student shay = new Student("Shay", 21);
        Student israel = new Student("Israel", 21);
        Student ohad = new Student("Ohad", 24);

        PartyAggregate<Student> studentParty = new PartyAggregate<>();
        studentParty.addGroup(List.of(israel, ido, shay, orya));
        Iterator<Student> partyIterator = studentParty.createIterator();
        while (partyIterator.hasNext()) {
            System.out.println(partyIterator.next().toString());
        }
        studentParty.remove(orya);
        studentParty.add(ohad);
        partyIterator = studentParty.createIterator();
        while (partyIterator.hasNext()) {
            System.out.println(partyIterator.next().toString());
        }
    }
}
