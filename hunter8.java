package to.sum.no.to.get.element.in.array;
import java.util.*;
/**
 
 */
public class ToSumNoToGetElementInArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int [] a= new int[n];
        int k=0;
        for(int i=0;i<n;i++)
        {
            a[i]=scn.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]<a[j])
                {
                k=a[i]+a[j];
                for(int l=j+1;l<n;l++)
            {
                if(k==a[l])
                {
                    System.out.println(a[i]+"+"+a[j]+"="+k);
                }
            }
                }
            }
                
            
        }
        
        
    }
    
}
