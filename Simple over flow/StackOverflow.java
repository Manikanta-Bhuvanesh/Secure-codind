public class StackOverflow {
     
    public static int repeat(int num) {
        System.out.println("Number: " + num);
        return repeat(num++);
    }
    public static void main(String[] args) {
        StackOverflow.repeat(1);
    }
}
