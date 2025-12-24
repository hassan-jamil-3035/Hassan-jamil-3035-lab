import java.util.Random;

public class Main {

    public static void main(String[] args) {

        /* ==================================================
           LAB TASK 1, Object Creation Counter
        ================================================== */
        System.out.println("Lab task No 1");

        int i = 0;
        while (i < 9) {
            new CounterClass();
            i++;
        }
        System.out.println();


        /* ==================================================
           LAB TASK 2, Total Objects Count
        ================================================== */
        System.out.println("Lab task No 2");

        int totalObjects = CounterClass.getCount();
        System.out.println("The total Objects in this class are: " + totalObjects);
        System.out.println();


        /* ==================================================
           LAB TASK 3, Int Class Testing
        ================================================== */
        System.out.println("Lab task No 3");

        Int n1 = new Int();          // default constructor
        Int n2 = new Int(200);       // parameterized constructor

        System.out.println("Before initialization:");
        n1.display();

        System.out.println("After initialization:");
        n2.display();

        n2.setValue(150);

        System.out.println("After changing:");
        n2.display();
        System.out.println();


        /* ==================================================
           LAB TASK 4, Time Class
        ================================================== */
        System.out.println("Lab task No 4");

        Time t1 = new Time();
        t1.input();

        t1.display12Hour();
        t1.display24Hour();
        System.out.println();


        /* ==================================================
           LAB TASK 5, Marks Calculation
        ================================================== */
        System.out.println("Lab task No 5");

        Marks hassan = new Marks(85, 75, 99);
        hassan.sum();
        hassan.average();
        System.out.println();


        /* ==================================================
           HOME TASK 1, Rectangle Calculations
        ================================================== */
        System.out.println("Home task No 1");

        Rectangle rectangle1 = new Rectangle(4, 40);
        rectangle1.getArea();
        rectangle1.getPerimeter();

        Rectangle rectangle2 = new Rectangle(3.5, 35.9);
        rectangle2.getArea();
        rectangle2.getPerimeter();
        System.out.println();


        /* ==================================================
           HOME TASK 2, Stock Percentage Change
        ================================================== */
        System.out.println("Home task No 2");

        Stock ORCLobj = new Stock(
                "ORCL",
                "Oracle Corporation",
                34.5,
                34.35
        );

        ORCLobj.getChangePercent();
        System.out.println();


        /* ==================================================
           HOME TASK 3, DateLib File
        ================================================== */
        System.out.println("Home task No 3 is implemented in the DateLib file");
        System.out.println();


        /* ==================================================
           HOME TASK 4, Random Number File
        ================================================== */
        System.out.println("Home task No 4 is implemented in the RandomNumber file");
        System.out.println();


        /* ==================================================
           HOME TASK 5, Account Operations
        ================================================== */
        System.out.println("Home task No 5");
        System.out.println();

        Account hassanjamil = new Account(
                1122,
                20000,
                new Date(5, 10, 2000)
        );

        System.out.println(hassanjamil);
        System.out.println();

        hassanjamil.withdraw(2500);
        System.out.println();

        hassanjamil.deposit(3000);
    }
}
