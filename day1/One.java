import java.util.Arrays;
import java.util.Scanner;

class One{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER FEW CHARACTERS");
        char array[]=sc.next().toCharArray();
        Arrays.sort(array);
        System.out.println(array);
    }
}