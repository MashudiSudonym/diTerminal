---
layout: post
title:  "Tugas ~ Proses dan Managemen Proses"
date:   2015-04-20 16:57:51
categories: tugas linux open source
comments: true
---
# 1. **Konsep Proses Pada Sistem Operasi Linux**

Proses adalah program yang sedang dieksekusi. Setiap kali menggunakan utilitas sistem atau program aplikasi dari shell, satu atau lebih proses _**child**_ akan dibuat oleh shell sesuai perintah yang diberikan. Setiap kali instruksi diberikan pada Linux shell, maka kernel akan menciptakan sebuah _**proses-id**_. Proses ini disebut juga dengan terminilogy Unix sebagai sebuah _**Job**_. Proses Id (_PID_) dimulai dari 0, yaitu proses _**INIT**_, kemudian diikuti oleh proses berikutnya (terdaftar pada _**``/etc/inittab``**_).

Ada 3 tipe proses, antara lain :

* **Foreground**

Proses yang diciptakan oleh pemakai pada terlinal (interaktif, dialog).

* **Batch**

Proses yang dikumpulkan dan dijalankan secara sekuensial (satu persatu). Proses Batch tidak diasosiasikan (berinteraksi) dengan terminal.

* **Daemon**

Proses yang menunggu permintaan (request) dari proses lainnya dan menjalankan tugas sesuai dengan permintaan tersebut. Bila tidak ada request, maka program ini akan berada dalam kondisi _**idle**_ dan tidak menggunakan waktu hitung CPU. Umumnya nama proses daemon di Unix berakhiran d, misalnya _**``inetd, named, popd``**_, dll.

# 2. **Sinyal**

Proses dapat mengirim dan menerima sinyal dari dan ke proses lainnya. Proses mengirim sinyal melalui instruksi _**``kill``**_ dengan format 

	kill [-nomor sinyal] PID

Nomor sinyal 1 sampai dengan maksimum nomor sinyal yang didefinisikan system. Dan standar nomor sinyal yang terpenting adalah :

![Gambar1](/images/4.png)

# 3. **Mengirim Sinyal**

Mengirim sinyal adalah satu alat komunikasi antar proses, yaitu memberitahukan proses yang sedang berjalan bahwa ada sesuatu yang harus dikendalikan. Berdasarkan sinyal yang dikirim ini proses dapat bereaksi dan administrator/programmer dapat menentukan reaksi tersebut. Mengirim sinyal menggunakan instruksi

	kill [-nomor sinyal] PID

Sebelum mengirim sinyal PID proses yang akan dikirim harus diketahui terlebih dahulu.

# 4. **Mengontrol Proses Pada Shell**

Shell menyediakan fasilitas _job control_ yang memungkinkan mengontrol beberapa job atau proses yang sedang berjalan pada waktu yang sama. Misalnya bila melakukan pengeditan file teks dan ingin melakukan interrupt pengeditan untuk mengerjakan hal lainnya. Bila selesai, dapat kembali (_switch_) ke editor dan melakukan pengeditan file teks kembali.

Job bekerja pada _**foreground**_ atau _**background**_. pada _foreground_ hanya diperuntukan untuk satu job pada satu waktu. Job pada _foreground_ akan mengontrol shell - menerima input dari keyboard dan mengirim output ke layar. Job pada _background_ tidak menerima input dari terminal, biasanya berjalan tanpa memerlukan interaksi.

Job pada _foreground_ kemungkinan dihentikan sementara (_suspend_), dengan menekan _**ctrl + Z**_. Job yang dihentikan sementara dapat dijalankan kembali pada _foreground_ atau _background_ sesuai keperluan dengan menekan _**fg**_ atau _**bg**_. Sebagai catatan, menghentikan job sementara sangat berbeda dengan melakukan interrupt job (biasanya menggunakan _**ctrl + C**_), dimana job yang diinterrupt akan dimatikan secara permanen dan tidak dapat dijalankan lagi.

# 5. **Mengontrol Proses Lain**

Perintah _**ps**_ dapat digunakan untuk menunjukkan semua proses yang sedang berjalan pada mesin (bukan hanya proses pada shell saat ini) dengan format :

	ps -fae

atau

	ps -aux

Beberapa versi Unix mempunyai utilitas sistem yang disebut _**top**_ yang menyediakan cara interaktif untuk memonitor aktifitas sistem. Statistik secara detail dengan proses yang berjalan ditampilkan dan secara terus-menerus di-_refresh_. Proses ditampilkan secara terurut dari utilitas CPU. Kunci yang berguna pada _**top**_ adalah

_**s**_ - set update frequency
_**u**_ - display proses dari satu user
_**k**_ - kill proses (dengan PID)
_**q**_ - quit

Utilitas untuk melakukan pengontrolan proses dapat ditemukan pada sistem Unix adalah perintah _**``killall``**_. Perintah ini akan menghentikan proses sesuai PID atau job number proses.