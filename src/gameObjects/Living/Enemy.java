package gameObjects.Living;

public class Enemy extends Living{
    int damage;
    public Enemy(String newName, String newDesc, int health, int damage) {
        super(newName, newDesc, health);
    }
    public int getDamage() {
        return damage;
    }
}
