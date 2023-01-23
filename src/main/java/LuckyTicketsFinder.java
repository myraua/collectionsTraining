import java.util.HashMap;
import java.util.Map;

public class LuckyTicketsFinder {

    public Map<String,Integer> getSumOfLuckyTickets1(int min, int max) {
        int simpleTicketCount = 0;
        int hardTicketCount = 0;
        int defaultTicketCount = 0;
        max = 999999;
        min = 100000;
        String result;
        int i;
        for (i = min; i <= max; i++) {       //i/100000 = 0   i%1000000= 100000
            result = String.valueOf(i);
           if(isSimpleLuckyTicket(result)) {
                simpleTicketCount++;
            }
           if(isDefaultLuckyTicket(result)) {
               defaultTicketCount++;
           }
           if(isHardLuckyTicket(result)) {
               hardTicketCount++;
           }
        }
        System.out.println(simpleTicketCount);
        System.out.println(defaultTicketCount);
        System.out.println(hardTicketCount);
        Map<String, Integer> counts = new HashMap<>();
        counts.put("simpleTicketCount",simpleTicketCount);
        counts.put("defaultTicketCount",defaultTicketCount);
        counts.put("hardTicketCount",hardTicketCount);
        return counts;
    }
    private boolean isSimpleLuckyTicket(String ticket){
       int left = ticket.charAt(0)+ticket.charAt(1)+ticket.charAt(2);
       int right = ticket.charAt(3)+ticket.charAt(4)+ticket.charAt(5);
       return left==right;
    }
    private boolean isHardLuckyTicket(String ticket){
        int left = 0;
        int right = 0;
        for(int i= 0; i<ticket.length();i++) {
            if (ticket.charAt(i) % 2 == 0) {
                left += ticket.charAt(i);
            }
            else {
                right += ticket.charAt(i);
            }
        }
            return left == right;
    }
    private boolean isDefaultLuckyTicket(String ticket){
        int left = ticket.charAt(0)+ticket.charAt(2)+ticket.charAt(4);
        int right = ticket.charAt(3)+ticket.charAt(1)+ticket.charAt(5);
        return left==right;
    }
    public int getSumOfLuckyTickets2(int min, int max) {
        int sum2 = 0;
        max = 999999;
        min = 100000;
        String result;
        int left;
        int right;
        int i;
        for (i = min; i <= max; i++) {
            result = String.valueOf(i);
            left = result.charAt(0)+result.charAt(2)+result.charAt(4);
            right = result.charAt(1)+result.charAt(3)+result.charAt(5);
            if(left==right) {
                sum2++;
            }
        }
        return sum2;
    }
//    public int getSumOfLuckyTickets3(int min, int max) {
//        int sum3 = 0;
//        max = 999999;
//        max = 999999;
//        min = 100000;
//        int sumEven = 0;
//        int sumOdd = 0;
//        String result;
//        int i;
//        for (i = min; i <= max; i++)
//        {
//            result = String.valueOf(i);
//                if(result.charAt(i) % 2 ==0)
//                   sumEven += i%10;
//                else
//                    sumOdd += i%10;
//            }
//            if(sumEven==sumOdd){
//                sum3++;
//            }
//        return sum3;
//    }
//    public int getSumOfLuckyTickets1(int min, int max) {
//        int sum1 = 0;
//        max = 999999;
//        Integer ticketDigit[] = new Integer[5];
//        for (min = 100000; min <= max; min++) {
//            for (int i = min, j = 0; j < ticketDigit.length-1; j++, i /= 10)  //??
//            {
//                ticketDigit[j] = i % 10;
//            }
//            if (ticketDigit[0] + ticketDigit[1] + ticketDigit[2]
//                    == ticketDigit[3] + ticketDigit[4] + ticketDigit[5]) {
//                sum1++;
//            }
//        }
//        return sum1;
//    }
//        public int getSumOfLuckyTickets2(int min, int max) { //why min highlighted
//            int sum2 = 0;
//            max = 999999;
//            Integer ticketDigit2[] = new Integer[5];
//            for(min=100000;min<=max;min++){
//                for (int i = min, j = 0; j < ticketDigit2.length-1; j++, i /= 10)
//                {
//                    ticketDigit2[j] = i%10;
//                }
//                if(ticketDigit2[0]+ticketDigit2[2]+ticketDigit2[4]
//                        == ticketDigit2[3]+ticketDigit2[1]+ticketDigit2[5]){
//                    sum2++;
//                }
//        }
//            return sum2;
//    }
//    public int getSumOfLuckyTickets3(int min, int max) {
//        int sum3 = 0;
//        max = 999999;
//        int sumEven = 0;
//        int sumOdd = 0;
//        Integer ticketDigit3[] = new Integer[5];
//        for(min=100000;min<=max;min++){
//            for (int i = min, j = 0; j < ticketDigit3.length-1; j++, i /= 10) //??
//            {
//                if(ticketDigit3[j] % 2 ==0)
//                   sumEven += i%10;
//                else
//                    sumOdd += i%10;
//            }
//            if(sumEven==sumOdd){
//                sum3++;
//            }
//        }
//        return sum3;
//    }
}
