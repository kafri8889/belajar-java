public class Function {

	// Function adalah blok kode yang dapat di panggil (dengan nama function tersebut),
	// function dapat mengambil input atau yang di sebut dengan "parameter",
	// dan dapat mengembalikan output juga

	// Bagian bagian function di java
	// 1) visibility (opsional): public, private, protected.
	// 2) modifier (opsional): final, abstract, static, synchronized, native, dan strictfp.
	// 3) return type: Return tipe dari objek tersebut, bisa class, interface, enum, void, atau tipe data lainnya.
	// 4) nama function
	// 5) parameter (opsional)

	// Penulisan function
	// [visibility] [modifier] [return type] namaFunction([param1], [param2], dst) { blok kode }

	// Contoh 1
	public static int sum(int a, int b) { return a + b; }

	// Contoh 2
	private void printNama(String nama) {
		System.out.println("Nama gwejh " + nama);
	}

}
