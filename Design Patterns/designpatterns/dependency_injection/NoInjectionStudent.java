package designpatterns.dependency_injection;

/**
 * @author Ohad Klein
 */
public class NoInjectionStudent {
    private final String name;
    private final int grade;
    private final StudentPrintingService studentPrintingService;

    public NoInjectionStudent(String name, int grade) {
        this.grade = grade;
        this.name = name;
        // The service is created inside the class:
        this.studentPrintingService = new StudentPrintingService();
    }

    public void printData() {
        this.studentPrintingService.print(this.name, this.grade);
    }
}
