import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ==================================================
           LAB TASK 1, Person and Address Objects
        ================================================== */
        System.out.println("Lab task No 1");

        Address baseAddress =
                new Address("University Road", "C-45", "Faisalabad", "38000");

        Person p1 = new Person("Arham", baseAddress);
        new Person("Danish", baseAddress);
        new Person("Shayan", baseAddress);

        System.out.println(p1);
        System.out.println();


        /* --------------------------------------------------
           Alternative Method of Object Creation
        -------------------------------------------------- */
        System.out.println("Second method to create an Object");

        Person p2 = new Person(
                "Huzaifa",
                new Address(
                        "Canal View",
                        "E-19",
                        "Sialkot",
                        "5" + "1300"
                )
        );

        System.out.println(p2);
        System.out.println();


        /* ==================================================
           LAB TASK 2, Employee Information
        ================================================== */
        System.out.println("Lab task No 2");

        Date empDob = new Date(9, 4, 1995);
        Date empDoj = new Date(27, 8, 2022);

        Employee emp = new Employee("Naveed", empDob, empDoj);

        System.out.println(
                "Joined within last 5 years: " +
                        emp.joinedWithinLastFiveYears()
        );

        System.out.println(
                "Age less than 40: " +
                        emp.isYoungerThan40()
        );

        System.out.println();


        /* ==================================================
           LAB TASK 3, Book and Audio Cassette
        ================================================== */
        System.out.println("Lab task No 3");

        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter details for Book:");
        Book book = new Book();
        book.getdata(sc);

        System.out.println("\nBook Details:");
        book.putdata();

        System.out.println("\nEnter details for Tape:");
        AudioCassette tape = new AudioCassette();
        tape.getdata(sc);

        System.out.println("\nTape Details:");
        tape.putdata();


        /* ==================================================
           LAB TASK 4, Student Data Handling
        ================================================== */
        System.out.println();
        System.out.println("Lab task No 4");

        Student student = new Student();
        student.getdata(sc);
        student.display();


        /* ==================================================
           LAB TASK 5, Laptop Specifications
        ================================================== */
        System.out.println();
        System.out.println("Lab task No 5");

        Laptop defaultLaptop = new Laptop();
        defaultLaptop.display();

        System.out.println();

        Laptop customLaptop = new Laptop(
                56,
                16384,
                1024000,
                3600,
                33.6,
                21.9,
                2.4,
                1.9
        );
        customLaptop.display();


        /* ==================================================
           HOME TASK 1, Student Result Processing
        ================================================== */
        System.out.println();
        System.out.println("Home task No 1");

        Test test = new Test();

        test.getdata();
        test.getmarks();
        test.Finalresult();

        System.out.println("\n--- Student Result ---");
        test.putdata();
        test.putmarks();


        /* ==================================================
           HOME TASK 2, Simple and Complex Operations
        ================================================== */
        System.out.println();
        System.out.println("Home task No 2:");

        System.out.println("=== Using Parent Class ===");
        Simple simpleCalc = new Simple(24, 6);
        simpleCalc.add();
        simpleCalc.sub();
        simpleCalc.mul();
        simpleCalc.div();

        System.out.println("\n=== Using Child Class ===");
        Complex complexCalc1 = new Complex(28, 7);
        complexCalc1.add();
        complexCalc1.sub();
        complexCalc1.mul();
        complexCalc1.div();

        System.out.println("\n=== Child Class with Invalid Values ===");
        Complex complexCalc2 = new Complex(-12, 4);
        complexCalc2.add();
        complexCalc2.sub();
        complexCalc2.mul();
        complexCalc2.div();


        /* ==================================================
           HOME TASK 3, Electricity Bill Calculation
        ================================================== */
        System.out.println();
        System.out.println("Home task No 3:");

        More_Electricity electricity = new More_Electricity(710);
        System.out.println("Total Bill = Rs. " + electricity.Bill());


        /* ==================================================
           HOME TASK 4, Courier Package System
        ================================================== */
        System.out.println();
        System.out.println("Home task No 4:");

        Package normal = new Package(
                "Kamran", "Street 6", "Gujranwala", "Punjab", "52250",
                "Salman", "Street 11", "Sukkur", "Sindh", "65200",
                18, 9
        );

        TwoDayPackage twoDay = new TwoDayPackage(
                "Kamran", "Street 6", "Gujranwala", "Punjab", "52250",
                "Salman", "Street 11", "Sukkur", "Sindh", "65200",
                18, 9, 30
        );

        OvernightPackage overnight = new OvernightPackage(
                "Kamran", "Street 6", "Gujranwala", "Punjab", "52250",
                "Salman", "Street 11", "Sukkur", "Sindh", "65200",
                18, 9, 6
        );

        System.out.println("Normal Package Cost: " + normal.calculateCost());
        System.out.println("Two Day Package Cost: " + twoDay.calculateCost());
        System.out.println("Overnight Package Cost: " + overnight.calculateCost());

        sc.close();
    }
}
