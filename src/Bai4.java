public class Bai4 {
    public static void main(String[] args) {
        String initialString = "abcdefghij".repeat(100000);

        System.out.println("So sanh thoi gian thuc thi giua StringBuilder va StringBuffer:");

        long startTime, endTime;

        StringBuilder sb = new StringBuilder(initialString);
        StringBuffer sf = new StringBuffer(initialString);

        startTime = System.nanoTime();
        sb.reverse();
        endTime = System.nanoTime();
        System.out.println("StringBuilder - Dao nguoc chuoi: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        sf.reverse();
        endTime = System.nanoTime();
        System.out.println("StringBuffer - Dao nguoc chuoi: " + (endTime - startTime) + " ns");

        sb = new StringBuilder(initialString);
        sf = new StringBuffer(initialString);

        startTime = System.nanoTime();
        sb.insert(500000, "INSERTED");
        endTime = System.nanoTime();
        System.out.println("StringBuilder - Chen chuoi: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        sf.insert(500000, "INSERTED");
        endTime = System.nanoTime();
        System.out.println("StringBuffer - Chen chuoi: " + (endTime - startTime) + " ns");

        sb = new StringBuilder(initialString);
        sf = new StringBuffer(initialString);

        startTime = System.nanoTime();
        sb.delete(200000, 200010);
        endTime = System.nanoTime();
        System.out.println("StringBuilder - Xoa chuoi: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        sf.delete(200000, 200010);
        endTime = System.nanoTime();
        System.out.println("StringBuffer - Xoa chuoi: " + (endTime - startTime) + " ns");

        sb = new StringBuilder(initialString);
        sf = new StringBuffer(initialString);

        startTime = System.nanoTime();
        sb.replace(100000, 100010, "REPLACED");
        endTime = System.nanoTime();
        System.out.println("StringBuilder - Thay the chuoi: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        sf.replace(100000, 100010, "REPLACED");
        endTime = System.nanoTime();
        System.out.println("StringBuffer - Thay the chuoi: " + (endTime - startTime) + " ns");
    }
}
