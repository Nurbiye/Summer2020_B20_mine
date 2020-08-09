package day18_ForLoop;


/*
write a program that can reverse the following string:
                String str = "Java";
                output: avaJ
            please provide two solutions:
                        first solution, you MUST use substring method
                        second solution, you Must use charAt method
 */
public class reverse {
    public static void main(String[] args) {
        String str = "Java";
                   //avaJ
        String s1 = str.substring(1); //"ava"
        String s2 = str.substring(0,1); //"J"
        //char ch1 = str.charAt(0);  //we can use this instead of substring
        String result1 = s1 + s2;
        System.out.println(result1);






    }
}
