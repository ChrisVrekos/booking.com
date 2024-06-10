package booking.com;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface HRInterface extends Remote {
    public void book()
            throws RemoteException;

    public void guests()
        throws RemoteException;

    public void cancel()
        throws RemoteException;

    public void list()
        throws RemoteException;

//    public void registerWaitinglist(
//            CallbackClientInterface callbackClientObject
//    ) throws java.rmi.RemoteException;




}
