import java.util.Scanner;

class Timestamps {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();

        int totalHours = hours2 - hours1;
        int totalMinutes = minutes2 - minutes1;
        int totalSeconds = seconds2 - seconds1;

        int total = (totalHours*3600) + (totalMinutes*60) + totalSeconds;
        System.out.print(total);


        // closing the scanner object
        scanner.close();
    }
}