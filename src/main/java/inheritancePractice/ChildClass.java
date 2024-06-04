package inheritancePractice;

public class ChildClass extends ParentClass {

    private String p2;
    public ChildClass(String aniColor, String p0, String p2) {
        super(aniColor, p0);
        this.p2 = p2;
    }

    public static void main(String[] args) {
        ChildClass child = new ChildClass("white", "p0", "p2");


    }
}
