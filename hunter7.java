package even.no.odd.no.position;
import java.util.*;
/**
 *

 */
public class EvenNoOddNoPosition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scn.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(i%2==0&&(a[i]%2)!=0)
            {
                System.out.print(a[i]);
            }
            else if(i%2!=0&&(a[i]%2)==0)
            {
                System.out.print(a[i]);
            }
        }
    }
    
}
