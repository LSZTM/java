import java.util.Scanner;
class Reverse_sort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("\n enter number of integers:");
        int n = input.nextInt();
        int a[]=new int[n];


        System.out.println("Hello, World!");






        int i = 0;
        for(i = 0;i<n;i++){
            System.out.println("enter integer "+i+":");
            a[i] = input.nextInt();


        }
        for(i =0;i<n;i++){
            for(int j =i+1;j<n;j++){
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j]=temp;

                }
                else{
                    j = j+1;
                }
            }
        }
        for (int element: a) {
            System.out.println(element);
        }



    }
}
