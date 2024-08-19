import java.util.Random;
import java.util.ArrayList;

/* Cole Barron
 * This program is from 2022 and utilizes the Thread execution extension to display 100 threads
 * that are all trying to guess the number 123456. Each thread is assigned an ID and a random number from 1-1000000
 * to see how many tries it takes each thread to get the number 123456. Each thread is ended by displaying to the
 * console their thread ID and how many tries it took them to guess the number 123456.
 */

class Guesser extends Thread {                                  //Guesser class
    public int threadID;                                        //initializing variables
    public static int nextThreadID = 0;
    public Guesser() {                                          //constructor
        nextThreadID+=1;
        threadID = nextThreadID;
    }
    public void run() {                                         //run method creating the random number
        Random rand = new Random();
        boolean cont = true;
        int y = 1;
        while(cont == true) {                                   //while loop to guess the number 123456
            int x = rand.nextInt(1000000);
            if(x == 123456) {
                cont = false;
            } else {
                y+=1;
            }
        }
        System.out.println("I'm thread " + threadID + ", I just found " +
                "the number on guess " + y);                    // Output statement stating the thread ID and tries it took that thread
    }
}

public class randnumber {                                       //randnumber main class
    public static void main(String args[]) {                    //main method start
        ArrayList<Guesser> threads = new ArrayList<Guesser>();  //ArrayList of threads
        for(int i = 0; i < 100; i++) {                          //for loop creating and adding 100 threads to the arraylist
            Guesser thread = new Guesser();
            threads.add(thread);
        }
        for(int i = 0; i < 100; i++) {                          //for loop starting all threads
            threads.get(i).start();
        }
    }
}
