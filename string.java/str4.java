class str4
{
    public static void main(String[] args) {
        // String s1="pwskills";
        // String s2=new String("pwskills");
        // System.out.println(s1==s2);
        // System.out.println(s1.equals(s2));

        // String s1="pwskills";
        // String s2="pwskills";
        // String s3="pwJAVa";
        // System.out.println(s1==s2);
        // System.out.println(s1==s3);
        // System.out.println(s1.equals(s2));
        // System.out.println(s1.equals(s3));


        String s1="pwskills";
        String s2=new String("pwskills");
        String s3=new String("pwskills");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s2==s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s2.equalsIgnoreCase(s3));




    }
}