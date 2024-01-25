package gameObjects.Living;

import gameObjects.Thing;

public class Living extends Thing{
    int health;
    public Living(String newName, String newDesc, int health) {
        super(newName, newDesc);
        this.health = health;
    }
public int getHealth() {
    return health;
}
public void setHealth(int health) {
    this.health = health;
}
}