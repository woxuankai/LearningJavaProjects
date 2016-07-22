import java.util.*;

class Clock{
    public static void main(String[] arguments){
        Calendar now =  Calendar.getInstance();
        System.out.println(now.get(Calendar.WEEK_OF_YEAR));
        System.out.println(now.get(Calendar.AM));
        System.out.println(now.get(Calendar.AM_PM));
        long starttime = System.currentTimeMillis();
        System.out.println(2015-starttime/1000/60/60/24/365);
        String[] names={"A","B","C","D","E"};
        System.out.println(names.length);
        String Str="This is a string";
        char[] charr=Str.toCharArray();
        for(int dex=0;dex< Str.length();dex++)
        {
            if(charr[dex] != ' ')
                System.out.print(charr[dex]);
            else
                System.out.print('.');
        }
    }
}