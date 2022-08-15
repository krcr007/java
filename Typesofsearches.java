import java.util.*;


public class Typesofsearches {
    public static int Linearsearch(int n[],int key) {

        for(int i=0;i<n.length;i++){
            if(n[i]==key){
                return i;
            }
          
        }
        return -1;//Loop ke bahar.
        

        
    }
    public static int  Largest(int n[]) {
        
        int largest=Integer.MIN_VALUE;
        for( int i=0;i<n.length;i++){
            if(largest<n[i]){
                largest=n[i];
            }
            
        }
        return largest;

        

        
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n[]={2,3,4,5,6,7,8,9,0,10};
        //int key=sc.nextInt();
        


        int index = Largest(n);

        System.out.println("The largest numbe is:"+index);



        
        
    }
}
