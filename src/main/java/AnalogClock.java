import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hourDegree = scanner.nextInt();

        int minute = (hourDegree%30) * 2;
        System.out.print(minute*6);
        
        // closing the scanner object
        scanner.close();
    }
}