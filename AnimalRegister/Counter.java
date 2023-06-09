package AnimalRegister;

public class Counter implements AutoCloseable {
    private int count;

    public Counter() {
        count = 1;
    }

    public void add() {
        count++;
    }

    @Override
    public void close() throws Exception {
        count--;
        if (count > 0) {
            throw new IllegalStateException("Ресурс не был закрыт или использован не в блоке try-with-resources.");
        }
    }
}

