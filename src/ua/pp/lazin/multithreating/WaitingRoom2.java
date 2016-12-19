package ua.pp.lazin.multithreating;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @author Ruslan Lazin
 */
public class WaitingRoom2 implements IWaitingRoom {
    private List<Client> queue = new LinkedList<>();
    private int limit = 10;


    public WaitingRoom2(int size) {
        this.limit = size;
    }

    public synchronized boolean offer(Client client) {
        if (this.queue.size() == this.limit) {
            return false;
        } else
            this.queue.add(client);
        return true;
    }

    public synchronized Client take() {
        while (this.queue.size() == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (this.queue.size() != 0) {
            notifyAll();
        }

        return this.queue.remove(0);
    }
}


