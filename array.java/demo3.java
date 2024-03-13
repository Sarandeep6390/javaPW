// //ArrayIndexOutOfBoundsException 
// class demo3
// {
//     public static void main(String[] args) {
//         int nums[] = {5,3,7,6};
//         System.out.println(nums[4]);
//         System.out.println("Bye");
//     }
// }



// //ArrayIndexOutOfBoundsException case remove
// class demo3
// {
//     public static void main(String[] args) {
//         int nums[] = {5,3,7,6};
//         System.out.println(nums[nums.length-1]);
//         System.out.println("Bye");
//     }
// }


//ArrayIndexOutOfBoundsException case remove
//in loop for print
class demo3
{
    public static void main(String[] args) {
        int nums[] = {5,3,7,6};
        //for(int i=0;i<4;i++)   //for(int i=0;i<num.length;i++)  
        for(int n : nums)
        {
            //System.out.println(nums[i]);
            System.out.println(n);
        }
    }
}

