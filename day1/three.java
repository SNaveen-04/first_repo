import java.util.Scanner;

class Three{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        char oldchar = ch;
        char newchar;
        if(Character.isUpperCase(ch)){
            newchar = Character.toLowerCase(ch);
        }
        else{
            newchar = Character.toUpperCase(ch);
        }
        System.out.println(oldchar+"->"+newchar);
    }
}