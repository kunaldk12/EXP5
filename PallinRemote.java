import java.util.Scanner;
import java.rmi.*;  
import java.rmi.server.*;  
public class PallinRemote extends UnicastRemoteObject implements Pallin
{  
PallinRemote()throws RemoteException
{  
super();  
}  
public boolean pallindrome(String s)
{
String a, b = "";
boolean status = false;
	a=s;
     
        int n = a.length();
        for(int i = n - 1; i >= 0; i--)
        {
            b = b + a.charAt(i);
        }
        if(a.equalsIgnoreCase(b))
        {
           return true;
        }
        else
        {
             return false;
        }
    
}  
}  