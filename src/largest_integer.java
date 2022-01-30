import java.util.Scanner;
public class largest_integer {
    public  static int largestnumber(int a,int b,int c){

        int greatest_integer;
        if(a>b && a>c){
            greatest_integer = a;
            return greatest_integer;
        }
        else if(b>a && b>c){
            greatest_integer = b;
            return greatest_integer;
        }
        else{
            greatest_integer = c;
            return greatest_integer;

        }





         }


    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.print("\n enter int1:");
        int a = input.nextInt();
        System.out.print("\n enter int2:");
        int b = input.nextInt();
        System.out.print("\n enter int3:");
        int c = input.nextInt();
        int result = largestnumber(a,b,c);
        System.out.println("largest int is:"+result);
    }




}

