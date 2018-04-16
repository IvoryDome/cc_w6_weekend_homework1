package rooms;

public enum BedroomType {
    SINGLE("Single", 1),
    DOUBLE("Double",2),
    FAMILY("Family", 4),
    PRESIDENTIAL_SUITE("Presidential Suite", 2);

    private String type;
    private int capacity;

    BedroomType(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public String getType(){
        return type;
    }

    public int getCapacity() {
        return capacity;
    }
}
