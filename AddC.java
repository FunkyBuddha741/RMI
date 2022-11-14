package RMI;

import java.math.BigInteger;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AddC extends UnicastRemoteObject implements AddI {
    
        
    public AddC() throws RemoteException
    {
        super();
    }

    public BigInteger add(int x, int y)
    throws RemoteException
    {
        String xrep = String.valueOf(x);
        String yrep = String.valueOf(y);

        BigInteger biX = new BigInteger(xrep);
        BigInteger biY = new BigInteger(yrep);

        return biX.add(biY);

    }

    public BigInteger sub(int x, int y)
    throws RemoteException
    {
        String xrep = String.valueOf(x);
        String yrep = String.valueOf(y);

        BigInteger biX = new BigInteger(xrep);
        BigInteger biY = new BigInteger(yrep);

        return biX.subtract(biY);

    }

    public BigInteger mul(int x, int y)
    throws RemoteException
    {
        String xrep = String.valueOf(x);
        String yrep = String.valueOf(y);

        BigInteger biX = new BigInteger(xrep);
        BigInteger biY = new BigInteger(yrep);

        return biX.multiply(biY);

    }

    public BigInteger[] div(int x, int y)
    throws RemoteException
    {
        String xrep = String.valueOf(x);
        String yrep = String.valueOf(y);

        BigInteger biX = new BigInteger(xrep);
        BigInteger biY = new BigInteger(yrep);

        BigInteger [] div = biX.divideAndRemainder(biY);

        return div;

    }

    public BigInteger gcd(int x, int y)
    throws RemoteException
    {
        String xrep = String.valueOf(x);
        String yrep = String.valueOf(y);

        BigInteger biX = new BigInteger(xrep);
        BigInteger biY = new BigInteger(yrep);

        return biX.gcd(biY);

    }
    
    public BigInteger lcm(int x, int y)
    throws RemoteException
    {
        String xrep = String.valueOf(x);
        String yrep = String.valueOf(y);

        BigInteger biX = new BigInteger(xrep);
        BigInteger biY = new BigInteger(yrep);

        BigInteger gcd = biX.gcd(biY);
        BigInteger prod = biX.multiply(biY);

        BigInteger [] lcm = prod.divideAndRemainder(gcd);

        return lcm[0];

    }
}
