package gameObjects.Living;

public class Enemy extends Living{
    int damage;
    int capDamage;
    public Enemy(String newName, String newDesc, int capDamage, int damage) {
        super(newName, newDesc);
    }
    public int getDamage() {
        return damage;
    }
    public int getCapDamage() {
        return capDamage;
    }
    public void lowerCapDamage(int amount) {
        this.capDamage -= amount;
    }
}
