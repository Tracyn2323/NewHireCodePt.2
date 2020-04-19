import java.util.LinkedList;
import java.util.Queue;


    public class Manager {
        Queue<Double> deskAvailable;


        public Manager() {
            this.deskAvailable = new LinkedList<>();

            deskAvailable.offer(1.1);
            deskAvailable.offer(1.2);
            deskAvailable.offer(1.3);
            deskAvailable.offer(1.4);
            deskAvailable.offer(1.5);
        }
        public double getAvailableDesk() {
            double availableDesk = 0.0;
            if (deskAvailable.peek() != null) {
                availableDesk = this.deskAvailable.remove();
            }
            return availableDesk;
        }
    }
