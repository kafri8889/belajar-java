public class StrukturKontrol {

	public static void main(String[] args) {

		// ------------------------------------if, else, else if ---------------------------

		// "if" digunakan untuk mengecek kondisi tertentu, jika kondisi terpenuhi (true) blok kode akan dieksekusi.
		// if (kondisi) {
		//     // Blok kode
		// }
		//
		// "else if" digunakan setelah "if", jika kondisi "if" tidak terpenuhi dan kamu menambahkan "else if",
		// maka "else if" akan mengecek kondisi yang diberikan, jika kondisi "true" maka akan mengeksekusi blok codenya,
		// jika false lanjut ke "else if" selanjutnya jika ada, jika tidak akan lanjut ke "else"
		// if (kondisi) {
		//     // Blok kode
		// } else if(kondisi) {
		//     // Blok kode
		// } else {}
		//
		// "else" akan dipanggil jika kondisi "if" atau "else if" tidak terpenuhi.
		// if (kondisi) {
		//     // Blok kode
		// } else if(kondisi) {
		//     // Blok kode
		// } else {
		//     // Blok kode
		// }

		System.out.println(cekIpk(2.5f)); // Kamu ga dapet cum laude :(
		System.out.println(cekIpk(3.54f)); // Kamu dapet cum laude :)
		System.out.println(cekIpk(3.6f)); // Kamu dapet magna cum laude :D
		System.out.println(cekIpk(3.88f)); // Kamu dapet summa cum laude :P
		System.out.println(cekIpk(4f)); // Kamu dapet maxima cum laude :O

	}

	public static String cekIpk(float ipk) {
		// Contoh kita mempunyai variabel "ipk", dengan:
		// IPK: 3.4 - 3.59 => Cum laude
		// IPK: 3.6 - 3.79 => Magna cum laude
		// IPK: 3.8 - 3.99 => Summa cum laude
		// IPK: 4.0        => Maxima cum laude

		String result = "";

		// Jika ipk lebih besar atau sama dengan 3.4 DAN ipk lebih kecil atau sama dengan 3.59
		if (ipk >= 3.4f && ipk <= 3.59f) {
			result = "Kamu dapat cum laude :)";
		} else if (ipk >= 3.6f && ipk <= 3.79f) { // Jika ipk lebih besar atau sama dengan 3.6 DAN ipk lebih kecil atau sama dengan 3.79
			result = "Kamu dapat magna cum laude :D";
		} else if (ipk >= 3.8f && ipk <= 3.99f) { // Jika ipk lebih besar atau sama dengan 3.8 DAN ipk lebih kecil atau sama dengan 3.99
			result = "Kamu dapat summa cum laude :P";
		} else if (ipk >= 4f) { // Jika ipk lebih besar atau sama dengan 4
			result = "Kamu dapat maxima cum laude :O";
		} else { // Jika semua kondisi di atas tidak terpenuhi (ipk lebih kecil dari 3.4), maka blok else ini akan dieksekusi
			result = "Kamu ga dapet cum laude :(";
		}

		return result;
	}

}
