package designpatterns.dependency_injection;

/**
 * @author Ohad Klein
 */
public class StudentPrintingService implements PrintingService{
    @Override
    public void print(String name, int grade) {
        System.out.printf("Student %s got grade %d.%n", name, grade);
    }
}
