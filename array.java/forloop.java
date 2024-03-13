// //one dimensional array inhance for loop
// class forloop
// {
//     public static void main(String[] args) {
//         // int nums[] [] = new int[3][2];
//         // nums[0] [0] = 5;
//         // nums[0] [1] = 2;
//         // nums[1] [0] = 8;
//         // nums[1] [1] = 2;
//         // nums[2] [0] = 9;
//         // nums[2] [1] = 4;


//         // int nums[] [] = {
//         //                     {5,2,3,6},
//         //                     {8,3},
//         //                     {9,4,8}

//         //                 };

//         int  nums[] = {5,4,7,8};

//         for(int n : nums)
//         {
//             System.out.println(n);
//         }
//     }
// }



/**
 * two dimensional array using inhance  forloop
 */
class forloop
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
                            {8,3,6,4},
                            {9,4,8,1}

                        };
        for(int a[] : nums)
        {
            for(int b : a)
            {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}