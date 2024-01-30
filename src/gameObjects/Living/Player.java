package gameObjects.Living;

public class Player extends Living {
    int health;
    public Player(String newName, String newDesc, int health) {
        super(newName, newDesc);
        health = 1000;
        this.health = health;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
}
