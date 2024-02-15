package demos;

public class patternTest {
    public static void main(String[] args) {
        int n =38;
        
        int lastdigit=n%10;
        
        int roundednum = n-lastdigit + (lastdigit<5 ? 0:10);
        System.out.println("Rounded number:"+roundednum );
    }
}
