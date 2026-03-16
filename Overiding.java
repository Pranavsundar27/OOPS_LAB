class Parent {
    void view() {
        System.out.println("parent class method");
    }
}
class Child extends Parent {
    void view() {
        System.out.println("child class method");
    }
}
public class Overiding {
    public static void main(String args[]) {
        Child ob2 = new Child();
        ob2.view();
    }
}