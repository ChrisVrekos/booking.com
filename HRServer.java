package booking.com;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class HRServer {

    public static void main(String[] args) {
        try{
            startRegistry(11255);
            HRImpl exportedObj = new HRImpl();
            String registerurl = "rmi://localhost:11255/booking";
            Naming.rebind(registerurl, exportedObj);
            System.out.println("Callback Server ready.");
        }catch (Exception re) {
            System.out.println(
                    "Exception in HRServer.main: " + re);
        } // end catch
    }
    private static void startRegistry(int RMIPortNum)
            throws RemoteException {
        try {
            Registry registry =
                    LocateRegistry.getRegistry(RMIPortNum);
            registry.list( );
            // This call will throw an exception
            // if the registry does not already exist
        }
        catch (RemoteException e) {
            // No valid registry at that port.
            Registry registry =
                    LocateRegistry.createRegistry(RMIPortNum);
        }
    } // end startRegistry

}
