package is.substring;
import java.util.*;
/**
 *
 */
public class IsSubstring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
         int m=scn.nextInt();
        int [] a=new int[n];
       
        int [] b=new int[m];
        int count=0;
        for(int i=0;i<n;i++)
        {
            a[i]=scn.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            b[i]=scn.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(b[i]==a[j])
                {
                    a[j]=0;
                    count++;
                    break;
                }
            }
        }
        if(count==m)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
    
}
