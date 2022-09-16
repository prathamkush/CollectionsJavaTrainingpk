import java.util.Scanner;

public class temp {
    public void solve(int[] nums, int k){
        int n = nums.length;
        if(k==n || k==0) return;

        if(k>n) k = k%n;

        int ptr1 = 0, ptr2 = k;
        int valueAtk = nums[k];
        while(ptr2<n && ptr1<k){
            int temp1 = nums[ptr1];
            int temp2 = nums[ptr2+1];
            nums[ptr1] = temp2;
            nums[ptr2] = temp1;

            ptr1++;
            ptr2++;
        }
        nums[ptr2] = valueAtk;
    }



    public static void main(String[] args) {
        temp obj = new temp();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            int x = in.nextInt();
            arr[i] = x;
        }

        obj.solve(arr, 3);
        for(Integer num : arr){
            System.out.print(num+" ");
        }
    }
}
