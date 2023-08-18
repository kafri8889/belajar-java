import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

public class TipeData {

    public static void main(String[] args) {

        // ---------------------- Tipe data primitive ----------------------------------------

        // NOTE: penggunaan memori = size/ukuran di dalam memori

        // Byte: bilangan bulat
        // Memiliki ukuran 1 byte (8 bit)
        byte b = 8;

        // Short sama seperti byte, bedanya memiliki nilai maksumum, minimum, dan
        // penggunaan memori yang sedikit lebih besar/
        // Nilai minumum: -32_768
        // Nilai maksimum: 32_767
        short s = 6;

        // Integer sama seperti short (bilangan bulat juga), bedanya integer memiliki nilai maksimum
        // dan minimum yang sedikit lebih besar, dan penggunaan memorinya juga/
        // Nilai minimum yaitu: -2_147_483_648
        // Nilai maksimum yaitu: 2_147_483_647
        int i = -123456789;

        // Long sama seperti integer (bilangan bulat juga), bedanya long memiliki nilai maksimum
        // dan minimum yang lebih panjang, tetapi penggunaan memorinya juga lebih besar.
        // Jika kamu ingin menggunakan tipe data long, kamu harus menambahkan karakter "L" di akhir bilangan,
        // Jika tidak, compiler akan mengira tipe data tersebut adalah Integer
        // Nilai minimum: -9_223_372_036_854_775_808
        // Nilai maksimum: 9_223_372_036_854_775_807
        long l = 123456789101112L;

        // Kesimpulan
        // Byte, Short, Integer, Long adalah tipe data bilangan bulat
        // Byte < Short < Integer < Long
        //
        // Byte  => min: -128
        //          max: 127
        //          penggunaan memori => sistem 32-bit: 1 byte
        //                               sistem 64-bit: 1 byte
        //
        // Short => min: -2^15
        //          max: 2^15 - 1
        //          penggunaan memori => sistem 32-bit: 2 bytes
        //                               sistem 64-bit: 2 bytes
        //
        // Integer => min: -2^31
        //          max: 2^31 - 1
        //          penggunaan memori => sistem 32-bit: 4 bytes
        //                               sistem 64-bit: 4 bytes
        //
        // Long => min: -2^63
        //          max: 2^63 - 1
        //          penggunaan memori => sistem 32-bit: 4 bytes
        //                               sistem 64-bit: 8 bytes



        // Float: bilangan desimal.
        // Float memiliki presisi/ketelitian sampai 7 angka di belakang koma.
        // Jika ingin memakai float, kamu farus menambahkan karakter "f" di akhir angka,
        // jika tidak compiler akan mengira itu adalah integer (jika tidak ada nilai dibelakang koma) dan
        // double (jika ada nilai dibelakang koma)
        float f1 = 7f;
        float f2 = 7.9825223f;

        // Double: bilangan desimal.
        // Double memiliki presisi/ketelitian sampai 15 angka di belakang koma.
        double d1 = 7;
        double d2 = 7.0;
        double d3 = 7.98252234397801478;
        // Nilai dibawah adalah float,
        // tetapi karena kita memakai "double untuk tipe datanya,
        // maka compiler akan menganggap nilai dibawah adalah double
        double d4 = 7.317836f;

        // Kesimpulan
        // Float dan Double adalah bilangan desimal.
        // Jika kamu ingin memakai nilai desimal yang ketelitiannya agak kecil, bisa memakai float,
        // tetapi jika ingin ketelitiannya lebih besar, bisa pakai double.
        // Float < Double
        //
        // Float  => presisi/ketelitian: 7 angka dibelakang koma
        //           penggunaan memori => sistem 32-bit: 4 byte
        //                                sistem 64-bit: 4 byte
        //
        // Double => presisi/ketelitian: 15 angka dibelakang koma
        //           penggunaan memori => sistem 32-bit: 8 bytes
        //                                sistem 64-bit: 8 bytes
        //



        // Untuk tipe data karakter, harus memakai single quote => '' <=
        // Jika memakai double quote, maka compiler akan menganggap itu adalah String
        // penggunaan memori => sistem 32-bit: 1 byte
        //                      sistem 64-bit: 1 byte
        char c = 'a';



        // Boolean adalah data tipe yang hanya memiliki 2 data tipe
        // yaitu "true" dan "false".
        // boolean memiliki penggunaan memori yang lebih kecil, yaitu 1 bit.
        // Ingat, 1 byte = 8 bit
        // dalam bit: true => 1
        //            false => 0
        boolean bool = true;

        // -----------------------------------------------------------------------------------



        // ---------------------- Tipe data dalam bentuk class ----------------------------------------

        // "Object" adalah superclass di java, semua class atau tipe data, pasti anakan/children dari class "Object"
        Object o = new Object();

        // Contoh
        Object objectAsString = "string ini adalah objek";
        Object objectAsInt = 5; // integer ini juga objek
        Object[] objectArrayAsFloatArray = {0.4f, 6f}; // float array ini juga objek
        Object[] campuran = {0.4f, 6.0, 9, "campuran"}; // objek array yang berisi campuran tipe data

        // String adalah class atau tipe data yang mempresentasikan/mewakili char array.
        // Jadi string ini sebenarnya array yang berisi karakter.
        // Untuk menggunakan string, harus memakai double quote => "" <=
        // Jika memakai single quote maka compiler akan mengira nilai tersebut adalah karakter
        String string = "Java<3";
        // Ubah string menjadi char array
        char[] stringArr = string.toCharArray(); // ['j', 'a', 'v', 'a', '<', '3']
        // Ubah char array menjadi string
        String stringFromArr = String.valueOf(stringArr); // "Java<3"

        // Sama seperti byte di tipe primitive, tetapi class Byte memiliki beberapa fungsi,
        // seperti konversi ke integer, long, dll.
        Byte bclass = 4;
        int integerFromByte = bclass.intValue();
        long longFromByte = bclass.longValue();

        // Sama seperti short di tipe primitive, tetapi class Short memiliki beberapa fungsi,
        // seperti konversi ke float, integer, long, dll.
        Short sclass = 8273;
        double doubleFromShort = sclass.doubleValue();

        // Sama seperti integer di tipe primitive, tetapi class Integer memiliki beberapa fungsi,
        // seperti konversi ke float, short, long, dll.
        Integer iclass = 48273;
        float floatFromInteger = iclass.floatValue();

        // Sama seperti long di tipe primitive, tetapi class Long memiliki beberapa fungsi,
        // seperti konversi ke float, short, double, dll.
        // Note: jika kamu mengkonvert nilai long (yang lebih besar dari Integer.MAX_VALUE) ke integer,
        //       mungkin akan terjadi perbedaan nilai
        Long lclass = 48225634673L;
        long integerFromLong = lclass.intValue();

        // Big integer adalah class untuk mengkalkulasi integer dengan nilai yang melewati batas limit.
        // Contoh nilai dibawah lebih besar dari Long.MAX_VALUE
        BigInteger bigInteger1 = new BigInteger("922337242978482036854775807");
        BigInteger bigInteger2 = new BigInteger("3468568678697854775807");
        BigInteger penjumlahanInt = bigInteger1.add(bigInteger2);
        BigInteger perkalianInt = bigInteger1.multiply(bigInteger2);

        // Big decimal adalah class untuk mengkalkulasi angka desimal dengan tingkat ketelitian/presisi yang lebih besar.
        // Contoh nilai dibawah lebih besar dari Long.MAX_VALUE
        BigDecimal bigDecimal1 = new BigDecimal("9223372429784.8203685477580743947387");
        BigDecimal bigDecimal2 = new BigDecimal("3468.25353543534568678697854775807");
        BigDecimal penjumlahanDec = bigDecimal1.add(bigDecimal2);
        BigDecimal perkalianDec = bigDecimal1.multiply(bigDecimal2);

        // -----------------------------------------------------------------------------------



        // ---------------------- Tipe data array ----------------------------------------

        // Membuat char array dengan size 5
        char[] carr1 = new char[5];
        // Membuat char array dengan nilai yang diberikan
        char[] carr3 = {'a', 'b'};
        // Mengisi array dengan index
        carr1[0] = 'a';
        // Mengisi array dengan class Arrays
        Arrays.fill(carr1, 'a'); // ['a', 'a', 'a', 'a', 'a']

        // Array lain
        // byte, short, int, dan semua tipe data primitive

        // -----------------------------------------------------------------------------------
    }



}
