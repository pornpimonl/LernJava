package lesson07;

import lesson06.*;

public class ChildProtected extends MotherProtected{
    public ChildProtected(){
        System.out.println(x);
    }
    public static void main(String[] args) {
        new ChildProtected();
    }
}
