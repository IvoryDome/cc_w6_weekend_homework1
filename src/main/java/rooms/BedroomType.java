package rooms;

public enum BedroomType {
    SINGLE(1),
    DOUBLE(2),
    FAMILY(4),
    PRESIDENTIAL_SUITE(2);

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
