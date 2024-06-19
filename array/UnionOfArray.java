package rohan.array;

import java.util.ArrayList;

public class UnionOfArray {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,5,6,};
        int [] arr2 = {2,3,3,4,4,4,5,6,6,7};
        int m = arr1.length;
        int n = arr2.length;
        ArrayList<Integer> union =union(arr1,arr2,n,m);
        System.out.println("The union of arr1 and arr2 is : ");
        for (int val : union){
            System.out.print(+val+" ");
        }

    }
    static ArrayList<Integer> union(int[] arr1, int[] arr2, int m, int n){
        int i =0;
        int j =0;
        ArrayList<Integer> union = new ArrayList<>();
        while (i<n&&j<m){
            if (arr1[i]<=arr2[j]){
                if (union.isEmpty()|| union.get(union.size()-1)!=arr1[i])
                    union.add(arr1[i]);
                i++;
            }else {
                if (union.isEmpty()|| union.get(union.size()-1)!=arr2[j])
                    union.add(arr2[j]);
                j++;
            }
        }
        while (i<n){
            if (union.isEmpty()|| union.get(union.size()-1)!=arr1[i])
                union.add(arr1[i]);
            i++;
        }
        while (j<m){
            if (union.isEmpty()|| union.get(union.size()-1)!=arr2[j])
                union.add(arr2[j]);
            j++;
        }
        return union;
    }
}


