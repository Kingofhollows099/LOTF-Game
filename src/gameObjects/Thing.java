package gameObjects;

public class Thing {
    public static Thing nothing = new Thing("Air", "you search around, and find some nothing! you pick it up.");

    private String name;
    private String desc;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Thing(String newName, String newDesc){
        name = newName;
        desc = newDesc;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }
}
