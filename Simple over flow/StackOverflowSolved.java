public class StackOverflowSolved {
     
    public static int recursive(int num) {
        System.out.println("Number: " + num);
        num++;
        if(num==10){
        	return num;
        }
        else{
        	return recursive(num);
        }   
    }
    public static void main(String[] args) {
        StackOverflowSolved.recursive(1);
    }
}