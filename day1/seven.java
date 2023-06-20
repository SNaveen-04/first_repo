class Seven{
    public static void main(String args[]){
        int array[] = {1,2,5,6,6,2,6,7,1,5,4,7,5,6,6};
        int max_count = 0;
        int max_freq = 0;
        int n = array.length;
        for(int i = 0 ; i < n ; i++ ){
            int count = 0 ;
            for(int j = i+1 ; j < n ; j++){
                if(array[i]==array[j]){
                    count++;
                }
            }
            if(count>max_count){
                max_count=count;
                max_freq=array[i];
            }
        }
        System.out.println(max_freq);
    }
}