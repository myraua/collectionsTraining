import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Elementary {

    public static void main(String[] args) {
        // Elementary.task1Chess(args);
        // Elementary.task2Envelopes(args);
        // Elementary.task3Triangles(args);
        // Elementary.task12ToTwelve(args);
        //Elementary.taskFibonacci(args);
        Elementary.taskPalindrome(args);
    }

    public static void task1Chess(String[] args) {
        int height = 8;
        int width = 8;
        for (int i = 0; i < width; i++) {
            if (i % 2 != 0) {
                System.out.print(" ");
            }
            for (int j = 0; j < height; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
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
        } while (sc.next().equalsIgnoreCase("Yes")) ;
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
//            System.out.print("Enter Triangle name");
//            triangleName = sc.nextLine();
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
        String str[] = {" ","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve"};
        System.out.println(str[i]);
    }
    static void taskFibonacci(String[] args) {
        int a=0, b=1;
        int sum = 0;
        System.out.print(a+" "+b);
        for(int i=2; i<10;i++){
            sum=a+b;
            System.out.print(" "+sum);
            a=b;
            b=sum;
        }
    }
    static void taskPalindrome(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any number");

        int n = sc.nextInt();
        int n1=n;
        int rev = 0;
        while(n!=0){
            rev=rev*10 + n%10;
            n=n/10;
        }
        if(n1==rev) {
            System.out.println("Number is palindrome");
        }
        else {
            System.out.println("Is not palindrome");
        }
    }
}
