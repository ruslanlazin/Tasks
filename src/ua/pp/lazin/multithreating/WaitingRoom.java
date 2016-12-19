package ua.pp.lazin.multithreating;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @author Ruslan Lazin
 */
public class WaitingRoom implements IWaitingRoom{
    private BlockingQueue<Client> waitingRoom;

    public WaitingRoom(int size) {
        waitingRoom = new ArrayBlockingQueue<>(size);
    }

    public boolean offer(Client client){
        return waitingRoom.offer(client);
    }

    public Client take(){
        Client client = null;
        try {
            client =  waitingRoom.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return client;
    }
}


