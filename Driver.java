
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Kerly Titus
 */
public class Driver {

    /**
     * main class
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Network objNetwork = new Network(); /* Activate the network */
        objNetwork.start();

        Server server1 = new Server("Thread1");
        server1.start();
        Server server2 = new Server("Thread2");
        server2.start();
        // Server server3 = new Server("Thread3");
        // server3.start();

        Client objClient1 = new Client("sending"); /* Start the sending client thread */
        objClient1.start();
        Client objClient2 = new Client("receiving"); /* Start the receiving client thread */
        objClient2.start();

        /*
         * A synchronized statement allows us to set a lock on the buffer. A
         * synchrnoized method would only put a lock on that specific method, meaning
         * that two threads could in theory run and break the code ex: 1 thread runs a
         * deposit and the other runs a withdraw. By using a synchronized statement, we
         * are basically setting the lock on the buffer, meaning that no matter what
         * method you are accessing, you need to get access to the lock on the buffer, a
         * shared object between threads.
         */

        /*
         * Implementing a third thread resulted in a shorter running time. This is due
         * to the fact that we can share the process between more than 2 threads. More
         * threads allows for parralelism. Basically more threads can work on the same
         * process, dividing the tasks even more.
         */
    }

}
