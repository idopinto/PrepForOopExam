package designpatterns.dependency_injection;

/**
 * @author Ohad Klein
 */
public class PropertyInjectionStudent {
    private final String name;
    private final int grade;
    private StudentPrintingService studentPrintingService;

    public PropertyInjectionStudent(String name, int grade) {
        this.grade = grade;
        this.name = name;
    }

    public void setStudentPrintingService(StudentPrintingService service) {
        // The service is injected as a property set function
        // (can also make the field public and inject directly):
        this.studentPrintingService = service;
    }

    public void printData() {
        this.studentPrintingService.print(this.name, this.grade);
    }
}
