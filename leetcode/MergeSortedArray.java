package leetcode;

import java.util.Arrays;

public class MergeSortedArray {
  
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    if(nums2.length == 0) return;
    if(nums1.length == 0) return;
    
    int i = m - 1, j = n - 1, k = m + n - 1;

    while(k >= 0){
      System.out.println(k);
      if(i >= 0 && nums1[i] > nums2[j]){
        nums1[k] = nums1[i];
        i --;
      }
      else if(j >= 0 && nums2[j] > nums1[j]){
        nums1[k] = nums2[j];
        j --;
      }
      k --;
    }



        
  }
}
