package com.xinhai.thinking;

/**
 * 多态向上转型
 */
class Cycle{
    public void ride(){
        System.out.println("Bicycle ride");
    }
}
class Unicycle extends Cycle{
    public void ride(){
        System.out.println("Unicycle ride");
    }
}
class Bicycle extends Cycle{
    public void ride(){
        System.out.println("Bicycle ride");
    }
}
class Tricycle extends Cycle{
    public void ride(){
        System.out.println("Tricycle ride");
    }
}

public class Ja8_1_1 {

    public static void ride(Cycle c){
        c.ride();
    }
    public static void main(String[] args) {
        Unicycle uc = new Unicycle();
        Bicycle bc = new Bicycle();
        Tricycle tc = new Tricycle();
        Ja8_1_1.ride(uc);
        Ja8_1_1.ride(bc);
        Ja8_1_1.ride(tc);
    }
}
