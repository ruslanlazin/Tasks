package ua.pp.lazin.multithreating;

/**
 * @author Ruslan Lazin
 */
public class ClientProducer implements Runnable {
    private IWaitingRoom waitingRoom;
    private static final long TIMEOUT = 500;

    public ClientProducer(IWaitingRoom waitingRoom) {
        this.waitingRoom = waitingRoom;
    }

    @Override
    public void run() {

        while (true) {
            Client client = new Client();
            System.out.println("New " + client + " is going to have haircut");
            boolean willWait = waitingRoom.offer(client);
            if (willWait) {
                System.out.println("Ok, " + client + " will have haircut here");
            } else {
                System.out.println("We are sorry, but " + client + " moved out");
            }
            try {
                Thread.sleep(TIMEOUT);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
