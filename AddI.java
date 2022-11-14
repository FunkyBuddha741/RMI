package RMI;

import java.math.BigInteger;
import java.rmi.*;

public interface AddI extends Remote {

    // Addtion of Big Integers
    public BigInteger add(int x,int y) throws RemoteException;

    // Subtraction of Big Integers
    public BigInteger sub(int x,int y) throws RemoteException;
    
    // Multiplication of Big Integers
    public BigInteger mul(int x,int y) throws RemoteException;

    // Division of Big Integers
    public BigInteger[] div(int x,int y) throws RemoteException;

    // Greatest Common Denominator (GCD)
    public BigInteger gcd(int x,int y) throws RemoteException;

    // Least Common Denominator (LCM)
    public BigInteger lcm(int x,int y) throws RemoteException;

}
