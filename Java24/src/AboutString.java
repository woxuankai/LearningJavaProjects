import java.util.*;
class AboutString{
    public static void main(String[] arg)
    {
        Vector<String> victor;
        victor = new Vector<>(1);
        System.out.println("Size:" + victor.size());
        victor.add("String0");
        System.out.println("Size:" + victor.size());
        victor.add("String1");
        victor.add("String2");
        System.out.println( victor.get(2) );
        if(victor.contains("String2")) {
            System.out.println("Found Sring2");
        }

        for(String str:victor) {
            System.out.println(str);
        }
        victor.remove(0);
        victor.remove("String1");
        
        
        
        
        
        String StrToTest = "String To Test";
        String StrToTest1 ="String To Test";
        String StrToTest2 ="string to test";
        System.out.println("equals\n" + StrToTest.equals(StrToTest1) + " " +  StrToTest.equals(StrToTest2));
        System.out.println("lower\n" + StrToTest.toLowerCase());
        System.out.println("upper\n" + StrToTest.toUpperCase());
        System.out.println("indexof\n" + StrToTest.indexOf("To"));
        System.out.println("indexof\n" + StrToTest.indexOf("to"));
    }
}