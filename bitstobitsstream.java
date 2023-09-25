package numberconversion;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class bitstobitsstream {
	public static void main(String[] args) 
    {
        try
        {       
            // Here FO is the object of the file which is created to write.
            FileOutputStream FO=new FileOutputStream("E:/TH.txt");

            // Here F is the object of the file from which we have to write the content.
            DataOutputStream F=new DataOutputStream(FO);

            // These are the Input which is to be write on the file TH.txt
            F.writeBytes("Gwalior");
            F.writeBytes("\n");
            F.writeBytes("Indore");
            F.writeBytes("\n");
            F.writeBytes("Bhopal");
            F.writeBytes("\n");
            F.writeBytes("7008");
            F.writeBytes("\n");

            // FO colsed
            FO.close();
            // F closed
            F.close();

            //reading data
            FileInputStream FI=new FileInputStream("");
            DataInputStream DI=new DataInputStream(FI);             
            String s="";                
            // This loop will print the whole whole inputted data on the screen
            while((s=DI.readLine())!=null)
            {
                System.out.println(s);
            }           
        }
        
        catch(IOException e)
        {
            System.out.println(e);  
        }
    }

}
