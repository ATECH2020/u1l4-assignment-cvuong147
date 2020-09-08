import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int aStudents = scanner.nextInt();
        int bStudents = scanner.nextInt();
        int cStudents = scanner.nextInt();

        double aTotal = aStudents/2.0;
        if ((aStudents%2.0) == 1)
          aTotal += 0.5;

        double bTotal = bStudents/2.0;
        if ((bStudents%2.0) == 1)
          bTotal += 0.5;

        double cTotal = cStudents/2.0;
        if ((aStudents%2.0) == 1)
          cTotal += 0.5;

        System.out.print((int)(aTotal + bTotal + cTotal));


        // closing the scanner object
        scanner.close();
    }
}