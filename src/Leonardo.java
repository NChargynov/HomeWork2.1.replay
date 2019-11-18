public class Leonardo extends NinjaTurtle implements Printable {

    private int age;
    private String weapon;
    private String leader;

    public Leonardo(String name, int age, String weapon, String leader) {
        super(name);
        this.age = age;
        this.weapon = weapon;
        this.leader = leader;
    }

    @Override
    public void print() {
        System.out.println(getName() + " " + getAge() + " " + getWeapon() + " " + getLeader());
    }

    public int getAge() {
        return age;
    }

    public String getWeapon() {
        return weapon;
    }

    public String getLeader() {
        return leader;
    }
}
