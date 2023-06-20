import java.util.Scanner;

class Five{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int array[] = {43,3,54,23,6};
        System.out.println("enter a element to searched");
        int num = sc.nextInt();
        int flag = -1;
        for(int i=0;i<array.length;i++){
            if(num == array[i]){
                flag = i+1;
            }
        }
        if(flag == -1){
            System.out.println(flag);
        }
        else{
            System.out.println("position "+flag);
        }
    }
}