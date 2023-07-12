import com.sun.jdi.PathSearchingVirtualMachine;
import java.util.*;

public class COUNT_OF_ARRAY_ELEMENT {
    public void count_FUNC(int array[])
    {
        int size=array.length;
        int count=0,max,OUTPUT;
        max=Integer.MIN_VALUE;
        for(int i = 0;i<size;i++) {
            if (max<array[i]) {
                max = array[i];
            }
        }

        for (int i=0;i<size;i++)
        {
            if(array[i]==max)
            {
                count++;
            }
        }
        OUTPUT=size-count;
        System.out.println(OUTPUT);

    }

    public static void main(String[] args) {
        //int array[]=new int[5];
     //  int  array[]={1,2,3,4,5};
        //int size =array.length;
        //System.out.println(size);
        COUNT_OF_ARRAY_ELEMENT SC=new COUNT_OF_ARRAY_ELEMENT();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        SC.count_FUNC(array);
    }
}
