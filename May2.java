/*
*Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
*/

class Solution {
    public void moveZeroes(int[] arr) {
           int i=0,j=0;
   while(i<arr.length )
    {
 
     if(arr[i]==0)
        {
         i++;
        }
     else
        {
         arr[j]=arr[i];
         j++;
          i++;
        }
    }
 int resultLength= j;
  for(int k=resultLength;k<arr.length;k++)
      {

           arr[k]=0;
    }
 
 
    }
}
