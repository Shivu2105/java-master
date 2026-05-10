package polymorphisn.compile_time.variable_shadowing;

public class Driver {
    static void main() {
        p1 ref1 = new p1();
        System.out.println(ref1.i);

        p2  ref2 = new p2();
        System.out.println(ref2.i);

        p1 ref3 = new p2();
        System.out.println(ref3.i); // upcasting
    }
}
