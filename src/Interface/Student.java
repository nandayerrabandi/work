package Interface;

public abstract class Student implements School {
    public String  displayName () {
        return "John";
    }
    public void displayClass(){
        System.out.println("7th class");
    }
    public void displaySection() {
        System.out.println("section is B");
    }
}
