package ua.pp.lazin.multithreating;

/**
 * @author Ruslan Lazin
 */
interface IWaitingRoom {

    boolean offer(Client client);

    Client take();
}