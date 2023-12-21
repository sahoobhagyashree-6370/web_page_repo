import java.util.*;
public class arrayProblem {
public static void main(String[] args) {
    //System.out.println("Enter a number that you want to search");
    Scanner sc= new Scanner(System.in);
    //int num=sc.nextInt();
    int arr[]={21,34,34,5,8,4,34,78,4,5,34,56,77,5};
    int count=0;
    int odd=0;
    int flag=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]%2==0){
            count++;
            }
            if(arr[i]%2!=0){
                odd++;
            }
            if(arr[i]%4==0){
                flag++;
            }
    }
    System.out.println("Even occours "+count+ " times");
    System.out.println("odd occours "+odd+ " times");
    System.out.println("divisible by 4 occours "+flag+ " times");
    
}
    
}
