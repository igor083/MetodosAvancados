package helpers;

public class Uuid {
    private int count = 1111111;

    public int createUuid() {
        this.count += 1;

        return count;
    }
}
