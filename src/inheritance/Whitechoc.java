package inheritance;

public class Whitechoc extends Choclates {
    String brand="cadbury";

    public static void main(String[] args) {
        Whitechoc obj= new Whitechoc();
        System.out.println(obj.brand+" "+obj.cname+" cost is "+obj.cost);
    }
}
