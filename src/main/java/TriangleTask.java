import java.util.*;

public class TriangleTask implements Task{

    Scanner sc = new Scanner(System.in);

    public void run() {
        TriangleBuilder tb = new TriangleBuilder();
        do {
            String triangle1 = getTriangle("Please enter name and sides for triangle1");
            String triangle2 = getTriangle("Please enter name and sides for triangle2");
            String triangle3 = getTriangle("Please enter name and sides for triangle3");

            ArrayList<Triangle> triangles = new ArrayList<>();
            triangles.add(tb.buildTriangle(triangle1));
            triangles.add(tb.buildTriangle(triangle2));
            triangles.add(tb.buildTriangle(triangle3));

            Collections.sort(triangles);
            triangles.forEach(System.out::println);  //LAMBDA in Groovy always used -> opys methodu bez yogo objawlen

//            for(Object i : triangles) {
//            System.out.println(i); }
            System.out.println("Type Yes to continue");
        } while (sc.next().equalsIgnoreCase("Yes"));
        sc.close();

    }
    public String getTriangle(String s) {
        try {
            System.out.println(s);
            String triangle = sc.nextLine();
            return triangle;
        } catch (InputMismatchException e) {
            System.out.println("Please try again and enter integer value next time");
        }
        System.exit(0);
        return "";
    }
}
