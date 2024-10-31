package animal;

public class Animal {

    private String name;
    private int old;

    public Animal(String name, int old) {
        this.name = name;
        this.old = old;
    }

    public void say() {
        System.out.println(name + "です。" + old + "歳です。");
    }

    public String getName() {
        return name;
    }

    public int getOld() {
        return old;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOld(int old) {
        this.old = old;
    }

}
