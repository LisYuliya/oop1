public class Player {

    private static long nextId = 1;
    private long id;
    private String name;
    private double damage;
    private double healthPoint;

    public Player(String name) {
        this.id = nextId++;
        this.name = name;
        this.damage = 1.0;
        this.healthPoint = 100.0;
    }

    public void attack(Player player) {
        player.healthPoint -= this.damage;
        System.out.println(this.name + " attacks " + player.name + " for " + this.damage + " damage. " +
                player.name + " health: " + player.healthPoint + ", " +
                this.name + " health: " + this.healthPoint);
        if (player.healthPoint <= 0) {
            System.out.println(player.name + " is dead.");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double getDamage() {
        return this.damage;
    }

    public void setHealthPoint(double healthPoint) {
        this.healthPoint = healthPoint;
    }

    public double getHealthPoint() {
        return this.healthPoint;
    }

    public long getId() {
        return this.id;
    }
}
