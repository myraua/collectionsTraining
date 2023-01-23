

public class Envelope implements Comparable<Envelope> {

    private int width;
    private int length;

    public Envelope(int width, int length) {
        this.width = width;
        this.length = length;
    }
    public int compareTo(Envelope e) {
        if(this.length >= e.length && this.width >= e.width) {
            return 1;
        }
       else {
           return 0 ;
        }
    }
    }

//    public Envelope(int w, int l) {
//        width = w;
//        length = l;
//    }
//
//        public double getSquare(){
//        Scanner sc = new Scanner(System.in);
//        do {
//            System.out.println("Please enter double number for envelope length");
//            int width = sc.nextInt();
//            System.out.println("Please enter double number for envelope height");
//            int length = sc.nextInt();
//            System.out.println("Type Yes to continue");
//        } while (sc.next().equalsIgnoreCase("Yes"));
//        sc.close();
//        double square = width*length;
//        return square;
//    }
//    public int compareTo(Envelope e) {
//        Envelope one = (Envelope) o;
//        if(getSquare() > one.getSquare())
//        {
//            return 1;
//        }
//        else if(getSquare() < one.getSquare())
//        {
//            return -1;
//        }
//        else {
//            return 0;
//        }
//    }
//    }

