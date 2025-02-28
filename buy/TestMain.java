package buy;

public class TestMain {
    public static void main(String[] args) {
        Store store = new Store();

        Thread quancap = new Thread(new nhacap(store));
        Thread khachang = new Thread(new khach(store));

        quancap.start();
        khachang.start();
    }
}
