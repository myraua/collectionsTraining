
import java.io.*;
import java.util.Scanner;

public class Elementary {

    public static void main(String[] args) throws IOException {

        System.out.println("Hello! Welcome!");
       // Task task = new ChessboardTask();
       // task.run();
        Task task = new TicketTask();
        task.run();
        // Chessboard.task1Chess(8, 8);
        // Elementary.task2Envelopes(args);
        // Elementary.task3Triangles(args);
        // Elementary.task12ToTwelve(args);
        //Elementary.taskFibonacci(args);
        //Elementary.taskPalindrome(args);
        //Elementary.fileParser("output.txt");
        MyCollections mc = new MyCollections();
    }

    public static void task1Chess(String[] args) {
        int height = 8;
        int width = 8;
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if ((i + j) % 2 != 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
//        for (int i = 0;i < width; i++) {    //second true or false, unless true - will run
//            if (i % 2 != 0) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < height; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
    }

    public static void task2Envelopes(String[] args) {
        Scanner sc = new Scanner(System.in);
        double square1;
        double square2;
        do {
            System.out.println("Please enter double number for envelope 1 length");
            double a = sc.nextDouble();
            System.out.println("Please enter double number for envelope 1 height");
            double b = sc.nextDouble();
            System.out.println("Please enter double number for envelope 2 length");
            double c = sc.nextDouble();
            System.out.println("Please enter double number for envelope 2 height");
            double d = sc.nextDouble();
            square1 = a * b;
            square2 = c * d;
            if (square1 < square2)
                System.out.println("It fits!");
            else if (square1 >= square2) {
                System.out.println("It doesn't fit.");
            } else {
                System.out.println("Not valid input");
            }
            System.out.println("Type Yes to continue");
        } while (sc.next().equalsIgnoreCase("Yes"));
        sc.close();
    }

    //    public static void task3Triangles(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String triangleName;
//        double a;
//        double b;
//        double c;
//        Object[] triangle = new Object[4];
//        for (int i = 0; i < 3; i++) {
//            System.out.print("Enter Triangle first");
//            triangle1 = sc.nextLine();
   // triangle1.split(",")
    //Triangle, Triangle builder, triangle validator, triangleTask classes
    //triabgle.toString();
//            System.out.print("Enter first Triangle length");
//            a = sc.nextDouble();
//            System.out.print("Enter second Triangle length");
//            b = sc.nextDouble();
//            System.out.print("Enter third Triangle length");
//            c = sc.nextDouble();
//            triangle[0] = triangleName;
//            triangle[1] = a;
//            triangle[2] = b;
//            triangle[3] = c;
//            System.out.println(triangle);
//        }
//        // double area = (a + b + c) / 2.0d;
//        //  double resArea = Math.sqrt(area * (area - a) * (area - b) * (area - c)); //Heron's formula
//
////            for (j = i + 1; j <= 3; j++) {
////                if (resArea(triangle[j]) < resArea(triangle[i])) {
////                    triangle temp = triangle[i];
////                    triangle[i] = triangle[j];
////                    triangle[j] = triangle temp;
//
//    }
//    static void task4FileParser(String[] args) throws FileNotFoundException {
//        ArrayList<String> files = new ArrayList<>();
//        Scanner sc = new Scanner(new File("files.text"));
//        while(sc.hasNext()){
//            String nextInput = sc.next();
//
//        }
//
//    }
    static void task12ToTwelve(String[] args) {
        int i = 12;
        String str[] = {" ", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve"};
        System.out.println(str[i]);
    }

    static void taskFibonacci(String[] args) {
        int a = 0, b = 1;
        int sum = 0;         //can declare int length = 10, then i<length
        System.out.print(a + " " + b);
        for (int i = 2; i < 10; i++) {
            sum = a + b;
            System.out.print(" " + sum);
            a = b;
            b = sum;
        }
    }

    static void taskPalindrome(String[] args) { //vydilyty na objecty palindrome class
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any number");

        int n = sc.nextInt();
        int n1 = n;
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        if (n1 == rev) {
            System.out.println("Number is palindrome");
        } else {
            System.out.println("Is not palindrome");
        }
    }

    static void taskNumberSeries(String[] args) {
        int length;     //1,2,3,4,5  //length 3 sqrMin = 25 //5,6,7
        int squareMin;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter length of series");
        length = sc.nextInt();
        System.out.println("Please enter value of minimal square root possible for number in series");
        squareMin = sc.nextInt(); //25
        int i;
        for (i = 1; i * i <= squareMin; i++) {
            System.out.print(i + ",");
        }
        //how to add length there?
    }
//try array lista dla trioh validations //object Ticket z parameters...
//    static void luckyTickets(String[] args) { //class Ticket, class TicketCount, int sum1 = 1 spysok, int sum2 = 2 spysok, int sum3 = spysok 3 //Java collections...list
//        int min, j, i;                             //ticket(string numberOfTicket)
//        int max = 999999;
//        int sum = 0;
//        String ticketDigit[] = new int[5]; // String.indexOf(); ?????? charAt() kastyty do chysla...
//        for (min = 100000; min <= max; min++) {
//            for (i = min, j = 0; j < 6; j++, i /= 10)  //??
//            {
//                ticketDigit[j] = i % 10;
//            }
//            if (ticketDigit[0] + ticketDigit[1] + ticketDigit[2]
//                    == ticketDigit[3] + ticketDigit[4] + ticketDigit[5]) {
//                sum++;
//            }
//            System.out.println("First sum " + sum);
//        }
//            for(min=100000;min<=max;min++){
//                for(i = min, j =0; j < 6; j++ , i/=10 )  //??
//                {
//                    ticketDigit[j] = i%10;
//                }
//                if(ticketDigit[0]+ticketDigit[2]+ticketDigit[4]
//                        == ticketDigit[3]+ticketDigit[1]+ticketDigit[5]){
//                    sum++;
//                }
        // %2!=0
   //  }

    public static void fileParser(String pathFile) throws IOException { //string was highlighted, why lower case letter
        pathFile = "output.txt"; //find a word in text  //regex in Java??? ready library so you can parse for symbols, words. String class. .contains(),
        BufferedReader reader = new BufferedReader(new FileReader(pathFile)); //String.indexOf(); for second condition...
        int lines = 0;
        int words = 0;
        int chars = 0;
        String text;
        String letters = "";
        try {
            while ((text = reader.readLine()) != null) {
                letters += text;
                lines += 1;

                String[] word = text.split(" ");
                for (String w : word) {
                    words++;
                }
                chars = text.length();
            }
//            BufferedReader reader = new BufferedReader(new FileReader(pathFile));
//            LineNumberReader lineNumberReader = new LineNumberReader(reader);
//            System.out.println("Qty of lines in file is " + lineNumberReader);
        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        }
        System.out.println("line: " +lines);
        System.out.println("word: " +words);
        System.out.println("length: " +chars);
    }
}

