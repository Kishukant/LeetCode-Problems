class Solution {
    public int[] minOperations(String boxes) {
        int[] arr=new int[boxes.length()];
        char[] arr2=boxes.toCharArray();
        for(int i=0;i<arr2.length;i++){
            int count=0;
            for(int j=0;j<arr2.length;j++){
                if(arr2[i]=='1' && arr2[j]=='1'){
                    count+=Math.abs(j-i);
                }
                else if(arr2[i]=='0'){
                    if(arr2[j]=='1'){
                        count+=Math.abs(j-i);
                    }
                }
            }
            arr[i]=count;
        }
        return arr;
    }
}