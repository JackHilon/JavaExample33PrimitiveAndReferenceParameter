
package javaexample33primitiveandreferenceparameter;


public class JavaExample33PrimitiveAndReferenceParameter {

   
    public static void main(String[] args) {
       
        int a=5;
        int[] arr=new int[] {1,2,3,4};
        
        System.out.println("Your array: ");
        PrintArray(arr);
        System.out.println("a: "+a);
        System.out.println();
        
        Change(a, arr);
        
        System.out.println("Your array: ");
        PrintArray(arr);
        System.out.println("a: "+a);
    }
    private static void Change(int z, int[] array)
    {
        z=1000;
        for (int i = 0; i < array.length; i++) {
            array[i]=0;
        }
    }
    
    private static void PrintArray(int[] b)
    {
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+"");
        }
        System.out.println();
    }
    
}
