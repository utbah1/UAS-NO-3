import java.util.ArrayList;
import java.util.Random;

public class UAS3 {
    public static void main(String[] args) {
        ArrayList<Integer> kecepatanKendaraan = new ArrayList<>();
        Random random = new Random();

        int counter = 0;
        while (counter < 200) {
            int kecepatan = random.nextInt(200) + 1; // Menghasilkan angka acak antara 1 hingga 200 km/jam
            kecepatanKendaraan.add(kecepatan);
            counter++;
        }

        System.out.println("Daftar kecepatan kendaraan:");
        for (int kecepatan : kecepatanKendaraan) {
            System.out.println(kecepatan + " km/jam");
        }

        System.out.println("\nKendaraan dengan kecepatan antara 80 hingga 100 km/jam:");
        for (int kecepatan : kecepatanKendaraan) {
            if (kecepatan >= 80 && kecepatan <= 100) {
                System.out.println(kecepatan + " km/jam");
            }
        }

        System.out.println("\nKendaraan dengan kecepatan di bawah 80 km/jam:");
        for (int kecepatan : kecepatanKendaraan) {
            if (kecepatan < 80) {
                System.out.println(kecepatan + " km/jam");
            }
        }
    }
}