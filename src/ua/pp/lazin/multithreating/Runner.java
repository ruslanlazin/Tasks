package ua.pp.lazin.multithreating;

/**
 * @author Ruslan Lazin
 */
public class Runner {

    public static void main(String[] args) {
        IWaitingRoom waitingRoom = new WaitingRoom2(10);

        new Thread(new ClientProducer(waitingRoom)).start();
        new Thread(new ClientProducer(waitingRoom)).start();
        new Thread(new ClientProducer(waitingRoom)).start();
        new Thread(new ClientProducer(waitingRoom)).start();
        new Thread(new ClientProducer(waitingRoom)).start();
        new Thread(new ClientProducer(waitingRoom)).start();
        new Thread(new ClientProducer(waitingRoom)).start();
        new Thread(new ClientProducer(waitingRoom)).start();

        new Thread(new Barber(waitingRoom)).start();
        new Thread(new Barber(waitingRoom)).start();
        new Thread(new Barber(waitingRoom)).start();
        new Thread(new Barber(waitingRoom)).start();
        new Thread(new Barber(waitingRoom)).start();
        new Thread(new Barber(waitingRoom)).start();
    }
}
