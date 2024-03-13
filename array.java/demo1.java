// class demo1
// {
//     public static void main(String[] args) {
        // int nums[] [] = new int[3][2];
        // nums[0] [0] = 5;
        // nums[0] [1] = 2;
        // nums[1] [0] = 8;
        // nums[1] [1] = 2;
        // nums[2] [0] = 9;
        // nums[2] [1] = 4;


//         int nums[] [] = {
//                             {5,2},
//                             {8,3},
//                             {9,4}

//                         };
//         for(int i=0;i<=2;i++)
//         {
//             for( int j=0;j<=1;j++)
//             {
//                 System.out.print(nums[i] [j] + "");
//             }
//             System.out.println();
//         }
//     }
// }



// jagged array

class demo1
{
    public static void main(String[] args) {
        // int nums[] [] = new int[3][2];
        // nums[0] [0] = 5;
        // nums[0] [1] = 2;
        // nums[1] [0] = 8;
        // nums[1] [1] = 2;
        // nums[2] [0] = 9;
        // nums[2] [1] = 4;


        int nums[] [] = {
                            {5,2,3,6},
                            {8,3},
                            {9,4,8}

                        };
        for(int i=0;i<=2;i++)
        {
            for(int j=0;j<nums[i].length;j++)
            {
                System.out.print(nums[i] [j] + " ");
            }
            System.out.println();
        }
    }
}