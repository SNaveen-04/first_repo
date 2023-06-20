import java.util.Scanner;

class Four{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char ch = 'y';
        while(ch=='y'||ch=='Y'){
            System.out.println("MENU");
            System.out.println("1.ADD");
            System.out.println("2.SUB");
            int opt = sc.nextInt();
            if(opt!=1||opt!=2){
                System.out.println("WRONG OPTION");
                break;
            }
            System.out.println("ENTER TWO NUMBERS");
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(opt==1){
                int c = a+b;
                System.out.println("SUM ="+c);
            }
            else{
                if(opt==2){
                    int c = a-b;
                    System.out.println("DIFF="+c);
                }
            }
            System.out.println("PRESS Y/y to continue or any to terminate");
            ch = sc.next().charAt(0);
        }
    }
}