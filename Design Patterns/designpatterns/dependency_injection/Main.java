package designpatterns.dependency_injection;

/**
 * @author Ohad Klein
 */
public class Main {
    public static void main(String[] args) {
        // demonstrating all 4 ways to use the service:
        System.out.println("No injection method:");
        NoInjectionStudent israel = new NoInjectionStudent("Israel", 94);
        israel.printData(); // printing service is created inside

        System.out.println("Constructor injection method:");
        StudentPrintingService printingService = new StudentPrintingService();
        ConstructorInjectionStudent orya =
                new ConstructorInjectionStudent("Orya", 98, printingService);
        orya.printData();

        System.out.println("Property injection method:");
        PropertyInjectionStudent shay = new PropertyInjectionStudent("Shay", 90);
        shay.setStudentPrintingService(printingService);
        shay.printData();

        System.out.println("Method injection method:");
        MethodInjectionStudent ido = new MethodInjectionStudent("Ido", 100);
        ido.printData(printingService);
    }
}
