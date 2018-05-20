package frst.repeat;
import java.util.*;
/**
 *
 
 */
public class FrstRepeat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn=new Scanner(System.in);
        ArrayList<Integer> obj1= new ArrayList<Integer>();
        int n=scn.nextInt();
        int[] a= new int[n];
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            a[i]=scn.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            obj1.add(a[i]);
        }
        
        for(int i=0;i<n;i++)
        {
            int f=Collections.frequency(obj, a[i]);
            if(f>1)
            {
                cnt=i;
                break;
            }
        }
        System.out.println(a[cnt]);
        
        
    }
    
}
