# Java
package array2d;

/**
 *
 * @author Ardiet Achmad
 */
public class Array2d {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] kontak = {{"lili","123456"},{"lala","456789"},{"maya","7894"}};
        for (int x =0; x < kontak.length; x++) {
            System.out.println("nama : " + kontak[x][0]);
            System.out.println("nomor : " + kontak[x][1]);
            System.out.println("---------------");
        }
            
    }
    
}
