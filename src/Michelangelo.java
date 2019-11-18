public class Michelangelo extends NinjaTurtle implements Printable {

    private int age;
    private String weapon;
    private String happy;

    public Michelangelo(String name, int age, String weapon, String happy) {
        super(name);
        this.age = age;
        this.weapon = weapon;
        this.happy = happy;
    }

    @Override
    public void print() {
        System.out.println(getName() + " " + getAge() + " " + getWeapon() + " " + getHappy());
    }

    public int getAge() {
        return age;
    }

    public String getWeapon() {
        return weapon;
    }

    public String getHappy() {
        return happy;
    }
}
