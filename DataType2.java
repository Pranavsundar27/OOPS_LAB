class DataType2 {
    public static void main(String[] args) {

        // String (no object creation using new)
        String college = "Amrita";

        // Array
        int[] marks = {80, 85, 90};

        System.out.println("College Name: " + college);

        System.out.println("Marks:");
        for (int m : marks) {
            System.out.println(m);
        }
    }
}
