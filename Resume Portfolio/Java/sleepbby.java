import java.util.Random;

/* Cole Barron
 * This program is from 2022 and showcases the implementation of the Runnable
 * interface to utilize threads with exception handling. Each thread is a baby that is asleep for a random amount of time
 * and alerts the user when the time is up/they wake up.
 */

class Baby implements Runnable {                            //Baby class implementing Runnable
    public int time;                                        //initializing variables
    public String name;
    public Baby(String name1) {                             //Baby constructor
        this.name = name1;
        Random rand = new Random();
        time = rand.nextInt(5000);
    }
    public void run() {                                     //Baby run method that displays the baby and the time they are asleep,
        try {                                               //running through the random amount of time assigned to them, then displaying
            System.out.println("My name is " + name + " I am going " +          //that they are awake
                    "to sleep for " + time + "ms");
            Thread.sleep(time);
            System.out.println("My name is " + name + ", I am " +
                    "awake, feed me!!!");
        } catch (Exception InterruptException) {
            System.out.println("sleep did not work!!");
        }
    }
}

public class sleepbby {                                     //sleepbby main start
    public static void main(String args[]) {                //main method creating 5 threads/babies and starting them
        Thread b1 = new Thread(new Baby("Noah"));
        Thread b2 = new Thread(new Baby("Olivia"));
        Thread b3 = new Thread(new Baby("Liam"));
        Thread b4 = new Thread(new Baby("Emma"));
        Thread b5 = new Thread(new Baby("Amelia"));
        b1.start();
        b2.start();
        b3.start();
        b4.start();
        b5.start();
    }
}
