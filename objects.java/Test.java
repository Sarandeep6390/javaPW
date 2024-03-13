//instance variable not impact one another obj
// class Test 
// {
//     int a; //instance variable =global declare
//     String name="Rahul"; //instance variable = global variable
//     public static void main(String[] args) {
//         // declare the variable
//         // create the object
//         // inside main are local variable
//         int num=9;   // num=primitive variable
//         Test obj1=new Test();  
//         Test obj2=new Test(); // obj=Refrence variable  
//         obj1.name="Aman";
//         System.out.println(obj1.a);
//         System.out.println(obj1.name); //Here name is a instance variable


//         System.out.println(obj2.a);
//         System.out.println(obj2.name);
//     }
// }

//now focus on local variable

class Test 
{
    int a; //instance variable =global declare
    String name="Rahul"; //instance variable = global variable
    public static void main(String[] args) {
        // declare the variable
        // create the object
        // inside main are local variable
        int num=9;   // num=primitive variable
        System.out.println(num);
    }
}
