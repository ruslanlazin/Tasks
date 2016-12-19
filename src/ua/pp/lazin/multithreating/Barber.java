package ua.pp.lazin.multithreating;

/**
 * @author Ruslan Lazin
 */
public class Barber implements Runnable {
    private IWaitingRoom waitingRoom;
    private static final long HAIRCUT_DURATION = 500;

    public Barber(IWaitingRoom waitingRoom) {
        this.waitingRoom = waitingRoom;
    }


    @Override
    public void run() {
        while (true) {

            Client client = waitingRoom.take();
            System.out.println("Start cutting " + client);
            try {
                Thread.sleep(HAIRCUT_DURATION);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Finish cutting " + client);

        }
    }
}
