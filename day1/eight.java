class Eight{
    public static void main(String args[]){
        int array[] = {10,6,35,6,7,34,4,74,4,42,1};
        int n = array.length;
        int flag=1;
        int sum=0;
        for(int i =0;i<n;i++){
            if(array[i]==6){
                for(int j=i;j<n;j++){
                    if(array[j]==7){
                        i=j+1;
                        break;
                    }
                }
            }
            sum+=array[i];
        }
        System.out.println(sum);
    }
}