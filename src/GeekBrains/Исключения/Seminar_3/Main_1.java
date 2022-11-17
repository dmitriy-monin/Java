package GeekBrains.Исключения.Seminar_3;

public class Main_1 implements AutoCloseable{
    private int iterator;

    public int add() {
        return iterator++;
    }

    @Override
    public void close() throws Exception {

    }

    public static void main(String[] args) {
        try(Main_1 main_1 = new Main_1()) {
            main_1.add();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
