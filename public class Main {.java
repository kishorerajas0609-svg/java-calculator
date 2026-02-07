import java.util.*;
public class Main{
    public static void main (String[] args) {
        Scanner s= new Scanner(System.in);
        int a=0;
        while(true){
            System.out.print("Enter operator: ");
            char op=s.next().trim().charAt(0);
            System.out.println();
            if(op=='+' || op=='-'||op=='*'||op=='/'||op=='%'){
                System.out.println("Enter a no:");
                int n1=s.nextInt();
                int n2=s.nextInt();
                System.out.println();
                if(op=='+'){
                    a=n1+n2;
                }
                if(op=='-'){
                    a=n1-n2;
                }
                if(op=='*'){
                    a=n1*n2;
                }
                if(op=='/'){
                    if(n2!=0){
                        a=n1/n2;
                    }
                }
                if(op=='%'){
                    a=n1%n2;
                }
            }else if(op=='x' || op=='X'){
                break;
            }else{
                System.out.print("Invalid operation");
            }
            System.out.println(a);
        }
    }
}
