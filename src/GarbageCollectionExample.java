import java.util.ArrayList;
import java.util.List;

public class GarbageCollectionExample {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();

        for (int i = 0; i < 10_000; i++) {
            list.add(new byte[1024 * 1024]); // 1 MB boyutunda nesneler
            if (i % 100 == 0) {
                list.clear(); // Listeyi temizleyerek garbage collection'u tetikliyoruz
            }
        }

        System.out.println("Program tamamlandı!");
    }
}
