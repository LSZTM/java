import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("\n enter number of integers:");
        int n = input.nextInt();
        int arr[]=new int[n];
        int i;

        for(i = 0;i<n; i++){
            int s = i+1;
            System.out.println("enter integer "+s+":");
            arr[i] = input.nextInt();}
        //partition; input parameters high and low
        //pivot is the first element
        //i-low,j-h
        //i increments till it finds an element lesser than pivot
        //j decrements till it finds element greater than pivot
        //swap array[i] and array of [j] if i <j
        //happens till i <j
        //after swap low with j
        //return j value
        //quick sort performs from calling partition
        //1-(l,j),2-(j+1,h)

       }}
class quick_sort{
    static int partition(int array[],int a,int b){
        int pivot = array[a];

        while(a<b){
            a++;
            while(array[a]<= pivot){
                b--;

            }

            while(array[b]>pivot){

                int temp =array[a];
                array[a] = array[b];
                array[b] = temp;
                return b;




            }


            }
        return 0;}
      }



















