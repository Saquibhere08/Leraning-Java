public class arrayExample {
    public static void main(String[] args){
        int[] nums=new int[5]; //Declare an array of 5 integers

        nums[0]=10;
        nums[1]=100;
        nums[2]=1000;
        nums[3]=10000;
        nums[4]=100000;
//store values in the array

        System.out.println("Array elements are: ");
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]); 
            //Print the array elements
        }
    }
    
}
