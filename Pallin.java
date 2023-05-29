import java.rmi.*;  
public interface Pallin extends Remote{  
public boolean pallindrome(String s)throws RemoteException;  
}  