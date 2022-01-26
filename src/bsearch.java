import java.util.Scanner;
public class bsearch {

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        System.out.print("\n enter number of integers:");
        int n = input.nextInt();
        int a[]=new int[n];
        int i = 0;
        for(i = 0;i<n;i++){
            int s = i+1;
            System.out.println("enter integer "+s+":");
            a[i] = input.nextInt();}
        System.out.print("\n enter number to be searched:");
        int x = input.nextInt();
        int y = 0;
        int midpt = (n/2);
        int z = n-1;


        while(z<=n){
            if(a[y] == x){
                System.out.print("positions is: "+y);
                System.exit(0);

            }
            else if(a[z] == x){
                System.out.print("positions is: "+z);
                System.exit(0);

            }

            else if(a[midpt] == x){

                System.out.print("positions is: "+midpt);
                System.exit(0);
            }

            else if(midpt < x){
                z = midpt;
                midpt = midpt/2;



                }
            else if(midpt > x){
                y = midpt;
                midpt = z/2;



            }



        }}}
