package ua.pp.lazin.multithreating;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Ruslan Lazin
 */
public class Client {
    private static AtomicInteger count = new AtomicInteger(0);
    private final int clientId;

    public Client() {
        clientId = count.incrementAndGet();
    }

    public int getClientId() {
        return clientId;
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientId=" + clientId +
                '}';
    }
}
