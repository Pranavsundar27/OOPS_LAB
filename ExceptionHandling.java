public class ExceptionHandling {
    public static void main(String[] args) {
        int a = 10, b = 0;

        try {
            int result = a / b;
            System.out.println(result);
        } 
        catch(________ e) {
            System.out.println("Cannot divide by zero");
        }
    }
}