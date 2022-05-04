class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
        Arrays.sort(arr);
       Arrays.sort(dep);
       int j=0,i=1;
       int max_plat=1;
       int need=1;
       while(i<n && j<n){
           if(arr[i]<=dep[j]){
               max_plat+=1;
               i+=1;
           
               
               if(max_plat>need)
                need=max_plat;
           }
           else
           {
               j++;
               max_plat--;
           }
           
       }
       return need;
        
    }
    
}
