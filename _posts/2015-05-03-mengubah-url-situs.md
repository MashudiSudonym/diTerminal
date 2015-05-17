---
layout: post
title:  "Mengubah URL Situs Wordpress"
date:   2015-05-03 12:09:51
categories: catatan
comments: true
---
Catatan ini dibuat berdasarkan hasil belajar minggu ini, minggu ini sengaja coba buat web server terus dikasih cms wordpress di virtualbox, itung-itung ngetes kemampuan laptop kesayangan apa masih kuat diajak kerja keras. :LoL

Langsung ke masalah, karena Saya hobi mencari masalah itu web server yang udah kelar semua termasuk wordpressnya sengaja coba akses lewat jaringan wifi hasil tethering dari hape android pinjeman. Nah, itukan otomatis berubah ya IP-nya, disitulah masalah dimulai. Saat proses install kita menggunakan IP dari modem yang beralamat pada **_192.168.1.101_**, pada saat tidak menggunakan modem tersebut, semisal menggunakan wi-fi atau modem dengan IP default yang berbeda maka web server kita juga akan mengikuti IP yang berubah tersebut. Pada keadaan tersebut kita masih bisa mengakses tampilan wordpress kita. Namun, kita tidak dapat masuk ke halaman wp-admin.

Ini gambar kira-kira seperti ini.

![berubah](/images/7.png)

Nah, cara memperbaikinya kita masuk ke pengaturan wordpress, ini bertujuan untuk mengenalkan IP baru ini kepada wordpress. Caranya ketik _**sudo nano /var/www/html/wp-config.php**_ dan tambahkan baris code berikut ini pada baris paling akhir.

	define('WP_HOME','http://example.com');
	define('WP_SITEURL','http://example.com');

Ganti bagian _**http://example.com**_ dengan IP yang baru tadi, simpan dengan cara menekan kombinasi _**ctrl + o**_, dan _**ctrl + x**_ untuk keluar dari teks editor nano.

Setelah itu cek pada web browser di OS Host, dengan membuka IP yang baru tadi, dan coba login ke wp-admin, kalau tidak mengalami error berarti berhasil.

_**Catatan**_ : jika kita kembali menggunakan IP yang sama seperti saat kita melakukan installasi pertama kali, maka pengaturan network virtual server sama seperti cara di atas, dan untuk pengaturan pada **_wp-config.php_** yang kita tambahkan tadi kita cukup memberi tanda komentar pada baris tersebut, seperti ini dan simpan _**ctrl + o**_, dan _**ctrl + x**_ untuk keluar dari teks editor nano.

	/**
	define('WP_HOME','http://example.com');
	define('WP_SITEURL','http://example.com');
	*/

Ada masalah lagi, setelah berhasil masuk ke wp-admin, namun saat mengakses situs, tema menjadi tidak dapat diakses (load). Untuk masalah tema tidak dapat ter-load, bisa ditambahkan baris ini pada baris paling bawah sebelum _**"?>"**_ pada file bernama _**functions.php**_ dari tema yang digunakan, file tersebut terletak pada _**/var/www/html/wp-content/themes/twentyfifteen/**_ tema yang Saya gunakan adalah  _**twentyfifteen**_ jadi ini menyesuaikan saja, ganti **_example.com_** dengan ip baru.

	update_option('siteurl','http://example.com');
	update_option('home','http://example.com');

 Atau bisa juga mengganti tema pada **_dasboard wordpress, appearance > Themes > pilih tema baru_** dan situs telah dapat terakses dengan normal kembali.

 **_Referensi :_**

 _[https://codex.wordpress.org/Changing_The_Site_URL](https://codex.wordpress.org/Changing_The_Site_URL)_