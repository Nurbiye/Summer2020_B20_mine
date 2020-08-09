package OurStudyGroup;

public class ReverseInteger {
    public static void main(String[] args) {

        int num=1234567;
        while(num>=1){
            int lastDigit=num%10;
            num/=10;
            System.out.print(lastDigit);
        }



    }
}
