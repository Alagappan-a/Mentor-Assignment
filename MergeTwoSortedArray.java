package Zsgs.Practice;

import java.util.Arrays;

public class MergeTwoSortedArray {
    void mergeTwoSortedArray(){
        int [] a1={1,3,5,9};
        int[] a2 = { 2,4,6,8};
        int [] result = new int[a1.length+ a2.length];
        int j=0,r=0,i=0;//r=6;j=2,i=3
        for(;i<a1.length;){
            if(a1[i]<a2[j]){
                    result[r++]=a1[i++];
            }
            else{
                result[r++]=a2[j++];
                if(j==a2.length){
                    break;
                }
            }
        }
        if(i< a1.length){
            result[r++]=a1[i++];
        }
        if (j<a2.length){
            result[r++]=a2[j++];
        }

        System.out.println(Arrays.toString(result));
    }
    public static void main(String[] args) {
        new MergeTwoSortedArray().mergeTwoSortedArray();
    }
}
