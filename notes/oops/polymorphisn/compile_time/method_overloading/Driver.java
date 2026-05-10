package polymorphisn.compile_time.method_overloading;

public class Driver {
    static void main() {

        Calculator calci = new Calculator();
        System.out.println(calci.add(5,10));
        System.out.println(calci.add(2,05, 41));
    }
}
