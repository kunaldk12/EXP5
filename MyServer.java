import java.rmi.*;  
import java.rmi.registry.*;  
public class MyServer{  
public static void main(String args[]){  
try{  
Pallin stub=new PallinRemote();  
Naming.rebind("PAL", stub);  
System.out.println("Server Strarted");
}catch(Exception e){System.out.println(e);}  
}  
}  