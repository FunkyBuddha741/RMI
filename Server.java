package RMI;
import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.rmi.*;

public class Server {

    public static void main(String[] args) {
       
        try{
            AddI stub = new AddC();
            System.out.println("Server Running on port: 5000");
            try{
                Naming.rebind("rmi://localhost:5000/operators",stub);
            }
            catch(MalformedURLException e){
                e.printStackTrace();
            }
        }

        catch(RemoteException e){
            e.printStackTrace();

        }
    }
    
}
