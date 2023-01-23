public class Ticket implements Comparable<Ticket> {

    //private String ticketNumber;
    //private int min;
    //private int max;
    private int sumOfTickets;

    public Ticket(int sumOfTickets) {
        //this.ticketNumber = ticketNumber;
       // this.min = min;
       // this.max = max;
        this.sumOfTickets = this.sumOfTickets;
    }

    @Override
    public int compareTo(Ticket o) {
        if(this.sumOfTickets == o.sumOfTickets)  {
            return 1;
        } else
            return 0;
    }
    @Override
    public String toString() {
        return "Ticket{" +
                "sumOfTickets='" + sumOfTickets + '\'' +
                '}';
    }
}
