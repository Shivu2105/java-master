package inheritance.diamond;

public class Child implements  Parent1, Parent2{
    @Override
    public void fun(){
        Parent1.super.fun();
    }
}
