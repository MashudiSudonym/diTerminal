---
layout: post
title:  "Konfigurasi VoIP Server Pemula"
date:   2015-05-01 20:21:51
categories: catatan
comments: true
---
VoIP atau Voice over Internet Protocol adalah Internet Telepon atau telepon di atas Internet.

Catatan ini adalah menginstall dan konfigurasi server VoIP untuk pemula, Saya menggunakan Ubuntu Server sebagai sistem operasinya dan untuk aplikasi Saya menggunakan Asterisk serta untuk mempermudah konfigurasi Saya juga memasang Asterisk GUI.

* Pertama install asterisk dengan perintah 

	> sudo apt-get install asterisk

* Selanjutnya install komponen berikut untuk komponen pendukung dari asterisk-gui :

	> sudo apt-get install build-essential subversion

* Setelah subversion dan build-essential terpasang, langkah selanjutnya adalah mengunduh paket asterisk-gui dengan perintah ini :

	> svn checkout http://svn.digium.com/svn/asterisk-gui/trunk asterisk-gui

* Masuk pada direktori asterisk-gui dan lakukan installasi dengan perintah :

	> cd asterisk-gui

	> sudo ./configure

	> sudo make

	> sudo make install

* Selanjutnya konfigurasi pada file http.conf dan manager.conf

	> sudo mv /etc/asterisk/http.conf /etc/asterisk/http.conf.bak

	> sudo mv /etc/asterisk/manager.conf /etc/asterisk/manager.conf.bak

	Konfigurasi pertama pada file http.conf

	> sudo nano /etc/asterisk/http.conf

	Tambahkan baris berikut ini :

		[general]
		enabled=yes
		enablestatic=yes
		bindaddr=0.0.0.0 # allow GUI to be accessible from all IP addresses.
		#bindaddr=127.0.0.1 # require access from the machine Asterisk is running on
		bindport=8088

	Konfigurasi selanjutnya pada file manager.conf

	> sudo nano /etc/asterisk/manager.conf

	Tambahkan baris berikut ini :

		[general]
		enabled = yes
		webenabled = yes

	Masih di manager.conf tambahkan juga baris ini untuk akun admin :

		[admin]
		secret = ini_diganti_dengan_password_yang_digunakan_untuk_login
		read = system,call,log,verbose,command,agent,config,read,write,originate
		write = system,call,log,verbose,command,agent,config,read,write,originate

* Setelah semua itu Saya harap masih Anda masih di directory asteric-gui dan ketikkan perintah :

	> sudo make checkconfig

	Jika mendapat tampilan seperti ini maka konfigurasi berjalan lancar

	![lancar](/images/6.jpg)

* Restart asterisk

	> sudo service asterisk restart

* Akses melalui web browser

	> http://ip_anda:8088/static/config/index.html

	Ganti _ip_anda_ dengan IP server VoIP Anda.

Sekian, kemungkinan error yang terjadi pada saat akses asterisk GUI adalah **_404 not found_** dan **_Access Denied_**. Silahkan pergunakan Google untuk mencari penyelesaian masalah tersebut. Saya tidak akan menulis hal itu di sini.

_**Referensi :**_

_[http://opensource.telkomspeedy.com/wiki/index.php/Voice_over_Internet_Protocol](http://opensource.telkomspeedy.com/wiki/index.php/Voice_over_Internet_Protocol)_

_[https://khanifzyen.wordpress.com/category/voip/](https://khanifzyen.wordpress.com/category/voip/)_

_[https://wiki.asterisk.org/wiki/display/AST/Asterisk+GUI#AsteriskGUI-Access](https://wiki.asterisk.org/wiki/display/AST/Asterisk+GUI#AsteriskGUI-Access)_

_[https://www.howtoforge.com/asterisk_pbx_linux_p2](https://www.howtoforge.com/asterisk_pbx_linux_p2)_

_[http://www.asteriskguru.com/tutorials/asterisk_gui.html](http://www.asteriskguru.com/tutorials/asterisk_gui.html)_