package Polymorphism;

public class Exec {
    public static void main(String[] args) {
        Mobile mob= new Mobile();
        Samsung sam=new Samsung();
        Apple app =new Apple();
        mob.displayBrand();
        sam.displayBrand();
        app.displayBrand();
    }
}
