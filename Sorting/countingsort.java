import java.util.*;
public class countingsort{
    public static void countSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest = Math.max(largest,arr[i]);
        }
        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0)
            {
                arr[j]=i;
                j++;
                count[i]--;
                
            }
      
       }
for(int i=0;i<arr.length;i++){
    System.out.print(arr[i] + " ");
}
    }


  
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        countSort(arr);
    }
}

// import java.util.*;

// public class countingsort{
//     public static void countSort(int arr[]){
//         int largest = Integer.MIN_VALUE;
//         for(int i=0;i<arr.length;i++){
//             largest = Math.max(largest,arr[i]);
//         }
//         int count[]=new int[largest+1];
//         for(int i=0;i<arr.length;i++){
//             count[arr[i]]++;
//         }
//         int j=0;
//         for(int i=0;i<count.length;i++){
//             while(count[i]>0)
//             {
//                 arr[j]=i;
//                 j++;
//                 count[i]--;  
//             }
//         }
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i] + " ");
//         }
//     }

//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int arr[]=new int[a];
//         for(int i=0;i<arr.length;i++){
//             arr[i]=sc.nextInt();
//         }
//         countSort(arr);
//     }
// }
