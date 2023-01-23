import java.sql.SQLOutput;

public class GetLuckyTicketsSum {

    public static void main(String[] args) {
LuckyTicketsFinder ltf = new LuckyTicketsFinder();
ltf.getSumOfLuckyTickets1(0,999999);
//        for(int i=0; i<1000000;i++) {
//          //  System.out.println(i); //i/100000 123321 =
//            System.out.println("i = " + i);
//            int k = i;                        //1 , 0 , 0
//            for(int j=5; j>0; j--) {
//                System.out.print(k/Math.pow(10,j) + " ");
//                k %= j;
//            }
//            System.out.println();
//        }
//        int i = 123456;
//        System.out.println(i/100000); //1
//        int k = i%100000; //23456
//        System.out.println(k); //23456
//        System.out.println(k/10000); //2
    }

    public int getSumOfLuckyTickets1(int min, int max) {
        int sum1 = 0;
        max = 999999;
        Integer ticketDigit[] = new Integer[5];
        for (min = 100000; min <= max; min++) {
            for (int i = min, j = 0; j < ticketDigit.length-1; j++, i /= 10)  //??
            {
                ticketDigit[j] = i % 10;
            }
            if (ticketDigit[0] + ticketDigit[1] + ticketDigit[2]
                    == ticketDigit[3] + ticketDigit[4] + ticketDigit[5]) {
                sum1++;
            }
        }
        return sum1;
    }
}
