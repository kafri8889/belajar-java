public class CATATAN {

	// visibility => public   : dapat diakses di mana saja (class, package yg sama, bahkan package lain)
	// 				 private  : Hanya dapat diakses dari class itu sendiri
	// 				 protected: Hanya dapat diakses dari class yang sama dan class turunan dari class tersebut
	// 				 public > protected > private

	// modifier => final        => variable: mencegah perubahan nilai dari variable tersebut
	// 						       function: mencegah agar function tidak bisa di override oleh subclass.
	// 			   abstract     => class atau function yang memakai modifier ini, tidak akan bisa di implementasi,
	// 						       implementasi hanya bisa dilakukan oleh subclass/kelas turunan.
	// 			   static       => variable, function: membuat variable/function tersebut menjadi bagian dari CLASS,
	// 						       bukan bagian dari OBJEK CLASS, jadi, variable/function tersebut bisa di panggil
	// 						       TANPA MEMBUAT objek/instance dari class tersebut.
	// 			   synchronized => digunakan untuk membuat function bersifat thread-safe,
	// 							   maksudnya hanya satu thread yang dapat menjalankan function tersebut pada satu waktu.
	// 			   native       => implementasi function ada di luar java, harus di hubungkan lewat JNI (Java Native Interface),
	// 							   kayaknya implementasinya yg pake C++.
	// 			   strictfp     => mengatur perhitungan floating point dalam function untuk menggunakan presisi yang ditentukan oleh standar IEEE 754.

	// looping => break   : menghentikan iterasi/perulangan
	// 			  continue: skip iterasi saat ini, dan melanjutkan ke iterasi selanjutnya

}
