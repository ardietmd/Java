# Java
package doraemon;

import java.util.ArrayList;

/**
 *
 * @author Ardiet Achmad
 */
public class Doraemon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList kantungAjaib = new ArrayList();
        
        kantungAjaib.add("senter pembesar");
        kantungAjaib.add(532);
        kantungAjaib.add("tikus");
        kantungAjaib.add(1231234.123);
        kantungAjaib.add(true);
        
        kantungAjaib.remove("tikus");
        
        System.out.println(kantungAjaib);
        
        
        System.out.println("kantong ajaib berisi " + kantungAjaib.size ()+ " item");
    }
    
}
