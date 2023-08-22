
enum IPK {
	None,
	CumLaude,
	MagnaCumLaude,
	SummaCumLaude,
	MaximaCumLaude;

	/**
	 * Dapatkan tipe cum laude dari ipk
	 *
	 * @param ipk float ipk
	 * @return enum ipk jika dapat cum laude, null jika tidak
	 */
	public static IPK ipkFromFloat(float ipk) {
		if (ipk >= 3.4f && ipk <= 3.59f) {
			return CumLaude;
		} else if (ipk >= 3.6f && ipk <= 3.79f) {
			return MagnaCumLaude;
		} else if (ipk >= 3.8f && ipk <= 3.99f) {
			return SummaCumLaude;
		} else if (ipk >= 4f) {
			return MaximaCumLaude;
		} else {
			return None;
		}
	}
}

public class IfDanSwitchStatement {

	public static void main(String[] args) {

		// ------------------------------------ if, else, else if ---------------------------

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

		// -----------------------------------------------------------------------



		// ------------------------------------ switch ---------------------------

		// Switch sama seperti if statement, bedanya jika if statement mengecek kondisi dengan boolean,
		// switch statement mengecek kondisi dengan membandingkan nilai dari suatu variable

		// Switch statement itu bertipe fall-through atau mengalir, jadi jika kita tidak menambahkan "break" disetiap casenya,
		// saat ada case yang cocok, blok kode di case tersebut dan case seterusnya akan di eksekusi

		// Contoh tanpa "break"
		int num = 2;

		switch (num) {
			case 1:
				System.out.println("1");
			case 2:
				System.out.println("2");
			case 3:
				System.out.println("3");
		}

		// Output code di atas adalah:
		// ```
		// 2
		// 3
		// ```
		// Karena nilai num "2", dan ada case yang cocok, yaitu case ke-2
		// tetapi karena di case ke-2 tidak ada "break", maka blok kode di case ke-3 juga akan di eksekusi.

		switch (num) {
			case 1:
				System.out.println("1");
				break;
			case 2:
				System.out.println("2");
				break;
			case 3:
				System.out.println("3");
				break;
		}

		// Output code di atas adalah:
		// ```
		// 2
		// ```
		// Cek case ke-1 => num == 1? => false, lanjut ke case berikutnya
		// Cek case ke-2 => num == 2? => true, eksekusi blok kode,
		// 								 karena ada "break" maka eksekusi dihentikan dan program keluar dari switch statement.

		String hari = "senin";

		switch (hari) {
			case "senin":
				System.out.println("Malas \uD83D\uDE05☝\uFE0F ");
				break;
			case "sabtu":
				System.out.println("malming");
				break;
			case "minggu":
				System.out.println("besok senen \uD83D\uDE2D ");
				break;
			default:
				System.out.println("hari lain");
		}

		// Switch statement dengan enum class
		switch (IPK.ipkFromFloat(3.54f)) {
			case CumLaude:
				System.out.println("Rentang ipk cum laude: 3.4 - 3.59");
				break;
			case MagnaCumLaude:
				System.out.println("Rentang ipk magna cum laude: 3.6 - 3.79");
				break;
			case SummaCumLaude:
				System.out.println("Rentang ipk summa cum laude: 3.8 - 3.99");
				break;
			case MaximaCumLaude:
				System.out.println("Rentang ipk maxima cum laude: 4");
				break;
			case None:
				System.out.println("ipk mu di bawah 3.4, ga dapet cum laude  \uD83D\uDE2D ");
				break;
		}

		// Penulisan lain switch statement
		switch (IPK.ipkFromFloat(2.5f)) {
			case CumLaude -> System.out.println("Rentang ipk cum laude: 3.4 - 3.59");
			case MagnaCumLaude -> System.out.println("Rentang ipk magna cum laude: 3.6 - 3.79");
			case SummaCumLaude -> System.out.println("Rentang ipk summa cum laude: 3.8 - 3.99");
			case MaximaCumLaude -> System.out.println("Rentang ipk maxima cum laude: 4");
			case None -> System.out.println("ipk mu di bawah 3.4, ga dapet cum laude \uD83D\uDE2D ");
		}
	}

	public static String cekIpk(float ipk) {
		// Contoh kita mempunyai variabel "ipk", dengan:
		// IPK: 3.4 - 3.59 => Cum laude
		// IPK: 3.6 - 3.79 => Magna cum laude
		// IPK: 3.8 - 3.99 => Summa cum laude
		// IPK: 4.0        => Maxima cum laude

		String result;

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
