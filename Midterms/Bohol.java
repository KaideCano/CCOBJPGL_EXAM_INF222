public class Bohol implements Location {

    static int airFare = 150;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}