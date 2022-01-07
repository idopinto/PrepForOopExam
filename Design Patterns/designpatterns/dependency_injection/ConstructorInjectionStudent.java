package designpatterns.dependency_injection;

/**
 * @author Ohad Klein
 */
public class ConstructorInjectionStudent {
    private final String name;
    private final int grade;
    private final StudentPrintingService studentPrintingService;

    public ConstructorInjectionStudent(String name, int grade, StudentPrintingService service) {
        this.grade = grade;
        this.name = name;
        // The service is injected from the constructor:
        this.studentPrintingService = service;
    }

    public void printData() {
        this.studentPrintingService.print(this.name, this.grade);
    }
}
