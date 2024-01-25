package gameObjects.Living;

import gameObjects.Thing;

public class Living extends Thing{
    int health;
    int turn;
    public Living(String newName, String newDesc, int health, int turn) {
        super(newName, newDesc);
}    
public int getHealth() {
    return health;
}
public void setHealth(int health) {
    this.health = health;
}
public int turn() {
    return turn;
}
}