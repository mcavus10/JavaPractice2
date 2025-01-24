public class HeapAndStackExample {
    static class HeapObject {
        int id;

        HeapObject(int id) {
            this.id = id;
        }
    }

    public static void main(String[] args) {
        int stackVar = 10; // Stack'te tutulur
        HeapObject heapObject = new HeapObject(20); // Heap'te tutulur

        System.out.println("Stack değişkeni: " + stackVar);
        System.out.println("Heap nesnesinin id'si: " + heapObject.id);

        modifyStackAndHeap(stackVar, heapObject);

        System.out.println("Stack değişkeni (çağrıdan sonra): " + stackVar);
        System.out.println("Heap nesnesinin id'si (çağrıdan sonra): " + heapObject.id);
    }

    public static void modifyStackAndHeap(int stackVar, HeapObject heapObject) {
        stackVar = 50; // Stack değişkeni sadece bu metodun içinde değişir
        heapObject.id = 100; // Heap nesnesinin id'si tüm referanslar için değişir
    }
}
