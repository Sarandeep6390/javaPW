// is- else statement
// class Launch5
// {
//     public static void main(String []args)
//     {
//         int age = 18;
//         if(age >= 18)
//         {
//             System.out.println("Legal adult");
//         }
//         else
//         {
//             System.out.println("You are kid");
//         }
//     }
// }


// class Launch5
// {
//     public static void main(String []args)
//     {
//         int age = 18;
//         if(age >= 18 && age < 60)
//         {
//             System.out.println("You are an adult");
//         }
//         else if(age >= 60)
//         {
//             System.out.println("You are old now");
//         }
//         else
//         {
//             System.out.println("You are still a kid");
//         }
//     }
// }


class Launch5
{
    public static void main(String []args)
    {
        int age = 18;
        if(age >= 18 && age < 60)
        {
            if(age > 20 && age < 30)
            {
                System.out.println("You are in 20's");
            }
            else if(age >= 30 && age <= 40)
            {
                System.out.println("You are in 30's");
            }
            else
            {
                System.out.println("You are still teen");
            }
        }
        else if(age > 60)
        {
            System.out.println("You are old now");
        }
        else if(age>=16 && age < 18)
        {
            System.out.println("You are teen ager");
        }
        else
        {
            System.out.println("You are an kid");
        }
    }
}
