import java.util.InputMismatchException;

//ploswcha ne pravylno vyrahovuetsa, yak sortuvaty objecty? sort by first index value
public class TriangleBuilder {

    public Triangle buildTriangle(String namedTriangleString) {
        int[] sides = getSides(namedTriangleString);
        String name = getName(namedTriangleString);
        if (validateTriangle(sides)) {
            return new Triangle(name, sides[0], sides[1], sides[2]);
        }
        throw new IllegalArgumentException("Can't build Triangle, sides are invalid");
    }

    private int[] getSides(String t){
        String a = t.split(",")[1];
        String b = t.split(",")[2];
        String c = t.split(",")[3];
        int[] sizes = new int[3];
        sizes[0] = Integer.parseInt(a);
        sizes[1] = Integer.parseInt(b);
        sizes[2] = Integer.parseInt(c);
        return sizes;
    }

    private String getName(String s){
        String name = s.split(",")[0];
        return name;
    }

    private Boolean validateTriangle(int[] sides){
        return (sides[0]+sides[1]>sides[2])&&(sides[1]+sides[2]>sides[0])&&(sides[2]+sides[0]>sides[1]);
    }
}
