public class Looping {

    public static void main(String[] args) {

        // ------------------------------- For loop --------------------------------

        // Misal kita ingin iterasi angka 0 sampai 9
        // Penjelasan:
        // Bagian 1 ("int index = 0") => Pertama kita mempunyai variable "index" dengan nilai awal yaitu "0".
        // Bagian 2 ("index < 10")    => Kedua kita mempunyai kondisi, yaitu "index < 10" (index lebih kecil dari 10),
        //                               kondisi ini akan di cek di setiap iterasi, jika kondisi menghasilkan "true",
        //                               iterasi akan dilanjutkan, jika "false", maka iterasi akan dihentikan.
        // Bagian 3 ("index++")       => Di bagian ini kita akan menjumlahkan nilai index sebesar "1", misal
        //                               sekarang index ke-3, karena "index++" maka nilai index akan bertambah 1, jadi
        //                               "3 + 1 = 4", index ke-4.
        //                               Selain "index++" kita juga bisa menambhakan nilai lain seperti "index--",
        //                               "index += 2", "index -= 5", dll.

        // Iterasi dari 0 sampai 9
        // i ke-0 => "index ke-0"
        // i ke-1 => "index ke-1"
        // i ke-2 => "index ke-2", dst
        for (int index = 0; index < 10; index++) {
            System.out.println("index ke-" + index);
        }

        // Iterasi dari 0 sampai 9, dengan 2 step/langkah
        // i ke-0 => "index ke-0"
        // i ke-2 => "index ke-2"
        // i ke-4 => "index ke-4", dst
        //
        // Python equivalent:
        // ```
        // for index in range(0, 10, 2):
        //    print("index ke-" + str(index))
        // ```
        for (int index = 0; index < 10; index += 2) {
            System.out.println("index ke-" + index);
        }

        // Kita juga bisa menggunakan "continue" (untuk lanjut ke iterasi selanjutnya)
        // dan "break" untuk menghentikan iterasi
        // Output:
        // i ke-0 => di skip
        // i ke-1 => print "index ke-1"
        // i ke-2 => di skip
        // i ke-3 => print "index ke-3"
        // i ke-4 => di skip
        // i ke-5 => print "index ke-5"
        // i ke-6 => di skip
        // i ke-7 => karena index lebih besar dari 6, maka iterasi dihentikan
        for (int index = 0; index < 10; index++) {
            // Jika index bilangan genap, skip iterasi saat ini
            if (index % 2 == 0) continue;
            // Jika index lebih besar dari 6, hentikan iterasi
            if (index > 6) break;
            System.out.println("index ke-" + index);
        }

        // For loop dengan label
        // Output:
        // i ke-0 => j ke-0 dan seterusnya sampai j ke-5
        // i ke-1 => j ke-0 dan seterusnya sampai j ke-5
        // i ke-2 => j ke-0
        //           j ke-1
        //           j ke-2
        //           j ke-3
        //           j ke-4
        // Iterasi dihentikan di index "i" = 2, dan index "j" = 5
        // Karena value dari "i" adalah "2", dan value dari "j" adalah "5"
        // i + j => 2 + 5 = 7
        // karena memenuhi kondisi "i + j > 6", maka iterasi loop1 dihentikan
        loop1:
        for (int i = 0; i < 6; i++) {
            System.out.println("i ke-" + i);
            for (int j = 0; j < 6; j++) {
                // Jika nilai i + j lebih besar dari 6, hentikan iterasi loop1
                if (i + j > 6) break loop1;

                System.out.println("j ke-" + j);
            }
        }

        // For each loop
        // for each loop sama seperti for loop, bedanya for each loop digunakan untuk looping elemen-elemen di dalam collection/array

        // Contoh kita mempunyai array seperti dibawah, dan kita ingin print nama tersebut di console
        String[] names = new String[]{"Kazuha", "Hanni", "Pharita"};

        // dengan for loop biasa
        for (int i = 0; i < names.length; i++) {
            System.out.println("nama: " + names[i]); // Get nama dengan index ke-i
        }

        // dengan for each loop
        for (String name : names) {
            System.out.println("nama: " + name);
        }

        // Kedua kode di atas mempunyai output yang sama
        // Output:
        // 1) nama: Kazuha
        // 2) nama: Hanni
        // 3) nama: Pharita

        // ---------------------------------------------------------------------------



        // ------------------------------- While loop --------------------------------

        // While loop berbeda dengan for loop
        // For loop digunakan ketika kita tau berapa kali pengulangan harus di lakukan,
        // contoh diatas tadi iterasi dari 0 sampai 9, iterasi nama di dalam array, dsb.
        // While loop digunakan ketika kita tidak tau berapa kali pengulangan harus di lakukan,
        // jadi while loop akan terus mengulang/looping jika suatu kondisi terpenuhi (true),
        // tetapi jika kondisi tersebut tidak terpenuhi (false), maka iterasi akan dihentikan,
        // kita juga bisa menggunakan "continue" dan "break" di dalam while loop.

        // Penulisan:
        // while (kondisi) {
        //     // Blok kode
        // }

        // Flow:
        // Cek kondisi: true  => eksekusi blok kode dan ulangi
        //              false => hentikan iterasi

        // Contoh kita mempunyai variabel "num" dengan value "2", dan variable "sum" dengan nilai awal "0"
        // Kita akan menjumlahkan nilai "sum" dengan "num" sampai nilai "sum" lebih besar dari 100,
        // jadi jika nilai "sum" lebih kecil dari 100, kita akan menambahkan nilai "sum" dengan "num"

        final int num = 2;
        int sum = 0;

        // Cek apakah nilai "sum" lebih kecil dari 100?
        // jika true, lanjutkan iterasi, jika false hentikan iterasi
        while (sum < 100) {
            sum += num;
        }

        System.out.println("nilai akhir sum adalah: " + sum); // nilai akhir sum adalah: 100

        // Note: Pastikan saat menggunakan while loop, kamu harus menentukan kondisi yang akan menjadi
        // "salah"/"false" agar loop dapat berhenti. Jika kamu menggunakan "while (true)", pastikan kamu juga menyediakan
        // kondisi yang bisa digunakan untuk menghentikan perulangan dengan menggunakan "break".



        // Do while loop
        // Do while loop sama seperti while loop, bedanya, jika while loop mengecek kondisinya dulu
        // dan jika kondisi terpenuhi akan mengeksekusi blok kode dan jika kondisi tidak terpenuhi akan menghentikan iterasi,
        // do while loop mengeksekusi blok kode dulu, setelah itu baru mengecek kondisi

        // Flow:
        // Eksekusi blok kode => Cek kondisi: true  => eksekusi blok kode dan ulangi
        //                                    false => hentikan iterasi

        sum = num; // Ubah nilai "sum" dengan nilai "num" => sum: 2, num: 2
        do {
            // Jumlahkan nilai sum
            // 2 + 2 = 4
            sum += num;
        } while (sum < 2); // Karena sum lebih dari 2, hentikan iterasi

        System.out.println("nilai akhir sum adalah: " + sum); // nilai akhir sum adalah: 4

        sum = num; // Ubah nilai "sum" dengan nilai "num" => sum: 2, num: 2
        // Karena nilai sum sama dengan 2, dan kondisi meminta sum lebih kecil dari 2, hentikan iterasi
        while (sum < 2) {
            sum += num;
        }

        System.out.println("nilai akhir sum adalah: " + sum); // nilai akhir sum adalah: 2

        // Bisa dilihat perbedaan hasil dari nilai "sum", jika kita menggunakan do while loop akan mendapatkan "4",
        // dan jika kita menggunakan while loop akan mendapatkan "2".

    }

}
