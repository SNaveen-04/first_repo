import java.util.Scanner;
import java.util.Arrays;

class Six{
    public static void main(String args[]){
        int array[] = {1,42,43,26,35,85,245,134,64,34,2,46};
        Arrays.sort(array);
        int n = array.length;
        System.out.println("Smallest two numbers = "+array[0]+' '+array[1]);
        System.out.println("Largest two numbers = "+array[n-2]+' '+array[n-1]);
    }
}