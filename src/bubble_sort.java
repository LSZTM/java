import java.util.Scanner;
class bubble_sort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("\n enter number of integers:");
        int n = input.nextInt();
        int a[]=new int[n];
        int i = 0;
        for(i = 0;i<n;i++){
            int s = i+1;
            System.out.println("enter integer "+s+":");
            a[i] = input.nextInt();


        }
        for(i =0;i<n-1;i++){
            for(int j =i+1;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1]=temp;

                }
            }
        }
        for (int element: a) {
            System.out.println(element);
        }



    }
}
