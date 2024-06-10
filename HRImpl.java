package booking.com;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import java.util.Vector;

public class HRImpl extends UnicastRemoteObject implements HRInterface{
    private int[] rooms;

    protected HRImpl() throws RemoteException {
        super();
        int[] rooms = {10, 20, 30, 40, 50};
    }


    @Override
    public void book() throws RemoteException {

    }

    @Override
    public void guests() throws RemoteException {

    }

    @Override
    public void cancel() throws RemoteException {

    }

    @Override
    public void list() throws RemoteException {
        String[] roomDescriptions = {
                "δωμάτια τύπου A (single rooms) που κοστίζουν 75 Ευρώ τη βραδιά",
                "δωμάτια τύπου B (double rooms) που κοστίζουν 110 Ευρώ τη βραδιά",
                "δωμάτια τύπου C (twin rooms) που κοστίζουν 120 Ευρώ τη βραδιά",
                "δωμάτια τύπου D (triple rooms) που κοστίζουν 150 Ευρώ τη βραδιά",
                "δωμάτια τύπου E (quad rooms) που κοστίζουν 200 Ευρώ τη βραδιά"
    };
    int i = 0;
        for (int number : rooms) {
            String roomDescription = roomDescriptions[i];
            System.out.println(number + " " + roomDescription);
            i++;
        }
    }
}
