//strings type mutable && immutable
class str1
{
    public static void main(String[] args) {
        String brand="pwskill";
        System.out.println(brand);
        brand.concat("Bengluru");
        System.out.println(brand);

        StringBuilder brand1=new StringBuilder("pwskill");
        System.out.println(brand1);
        brand1.append("Bengluru");
        System.out.println(brand1);
    }
}