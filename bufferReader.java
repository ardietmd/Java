# Java
package contohbufferreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Ardiet Achmad
 */
public class Contohbufferreader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
     
        String nama;
        
        InputStreamReader isr = new InputStreamReader(System.in);
        
        BufferedReader br = new BufferedReader(isr);
        
        System.out.println("input nama : ");
        nama = br.readLine();
        
        System.out.println("nama kamu " + nama );
        
       
        
        
    }
    
}
