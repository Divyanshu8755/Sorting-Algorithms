import java.util.Scanner;
public class Sorting{
    public static void SelectionSort(int[] arr,int n){
        for(int i=0;i<=n-2;i++){
            int min=i;
            for(int j=i;j<=n-1;j++){
                if(arr[min]>arr[j]) min=j;
            }
            swap(arr,min,i);
        }
    }
    public static void BubbleSort(int[] arr,int n){
        for(int i=n-1;i>=0;i--){
            int didswap=0;
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]) {
                    swap(arr,j,j+1); 
                    didswap=1;
                }
            }
            if(didswap==0) break;
            //System.out.println("runs");
        }
    }
    public static void InsertionSort(int[] arr,int n){
        for(int i=0;i<=n-1;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                swap(arr,j,j-1);
                j--;
            }
        }
    }
    public static void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array  :-  ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the array elements :- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //SelectionSort(arr,n);
        //BubbleSort(arr,n);
        //InsertionSort(arr,n);
        
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");;
        }
    }
}