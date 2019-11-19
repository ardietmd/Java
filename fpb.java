# Java
public class Latihanfpb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int m, n, r;
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("m : ");
        m = s.nextInt();
        System.out.print("n : ");
        n = s.nextInt();
        
        r = m % n;
        while (r!=0){
            m=n;
            n=r;
            r=m % n;
        }
        System.out.println("FPB = "+ n); 
    }
        
           }
