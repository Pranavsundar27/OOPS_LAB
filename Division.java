class Division {

    public int div(int a, int b) {
        return (a / b);
    }

    public int div(int a, int b, int c) {
        return ((a + b) / c);
    }

    public static void main(String args[]) {
        Division ob = new Division();

        System.out.println(ob.div(10, 2));
        System.out.println(ob.div(10, 2, 3));
    }
}