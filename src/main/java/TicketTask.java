import java.util.*;

public class TicketTask implements Task {
    @Override
    public void run() {
        LuckyTicketsFinder ltf = new LuckyTicketsFinder();
        int min = 100000;
        int max = 999999;
        Map<String,Integer> counts  = ltf.getSumOfLuckyTickets1(min,max);
//        int sum2 = ltf.getSumOfLuckyTickets2(min,max);
//     //   int sum3 = ltf.getSumOfLuckyTickets3(min,max);
//       Ticket firstOption = new Ticket(sum1);
//        Ticket secondOption = new Ticket(sum2);
//      //  Ticket thirdOption = new Ticket(sum3);
//        ArrayList<Ticket> luckyTickets = new ArrayList<>();
//        luckyTickets.add(firstOption);
//        luckyTickets.add(secondOption);


//      //  luckyTickets.add(thirdOption);
//        Collections.sort(counts); //logika yaka vyznachyt yaka suma vygrae // stvoryty okremyi class
//
//        for(Ticket t : luckyTickets) {
//            System.out.println(t.toString());
//        }
//        Map<String, Integer> map = new HashMap<>();
//        map.put("one",1);
//        map.put("two",2);

        List<Map.Entry<String, Integer>> entries = new ArrayList<>(counts.entrySet());
        Collections.sort(entries,(o1, o2) -> o1.getValue().compareTo(o2.getValue()));
        for(Map.Entry<String,Integer> entry : entries) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        //or
        // counts.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
    }
}
