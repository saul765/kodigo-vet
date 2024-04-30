package sequence;

public class FacturaSequence {

    private static Integer idCounter = 0;

    public static Integer getNextId() {
        return ++idCounter;
    }
}
