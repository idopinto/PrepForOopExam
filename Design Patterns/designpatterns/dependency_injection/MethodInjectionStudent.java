package designpatterns.dependency_injection;

/**
 * @author Ohad Klein
 */
public class MethodInjectionStudent {
    private final String name;
    private final int grade;

    public MethodInjectionStudent(String name, int grade) {
        this.grade = grade;
        this.name = name;
    }

    public void printData(StudentPrintingService service) {
        // service is injected directly to the method which uses it
        service.print(this.name, this.grade);
    }
}
