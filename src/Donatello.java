public class Donatello extends NinjaTurtle implements Printable{

    private int age;
    private String weapon;
    private String smart;

    public Donatello(String name, int age, String weapon, String smart) {
        super(name);
        this.age = age;
        this.weapon = weapon;
        this.smart = smart;
    }

    @Override
    public void print() {
        System.out.println(getName() + " " + getAge() + " " + getWeapon() + " " + getSmart());
    }

    public int getAge() {
        return age;
    }

    public String getWeapon() {
        return weapon;
    }

    public String getSmart() {
        return smart;
    }
}
