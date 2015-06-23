---
layout: post
title:  "Install miniDLNA Ubuntu Server 14.04"
date:   2015-06-10 19:52:51
categories: video
comments: true
---
Tutorial cara install dan kofigurasi miniDLNA di ubuntu server 14.04, serta panduan tes melalui perangkat atau aplikasi.

[![Coba](http://img.youtube.com/vi/ZGkfC_e84aA/0.jpg)](https://www.youtube.com/watch?v=ZGkfC_e84aA)

## 1. Install software-properties-common python-software-properties

> sudo apt-get install software-properties-common python-software-properties

## 2. Install Minidlna

> sudo apt-get install minidlna

## 3. Buat Folder Music, Video, Pictures di Direktori Home

> mkdir Music Video Pictures

## 4. Backup dan Buat File Konfigurasi Minidlna

> sudo mv /etc/minidlna.conf /etc/minidlna.conf.bak && sudo nano /etc/minidlna.conf

Isi dengan skrip ini

	network_interface=eth0
	media_dir=A,/home/user/Music
	media_dir=P,/home/user/Pictures
	media_dir=V,/home/user/Videos
	friendly_name=Media Server
	inotify=yes
	presentation_url=http://0.0.0.0:8200

**Catatan :**

Network interface sesuaikan dengan jalur koneksi yang digunakan.

Pada ``/home/user/`` ubah _user_ sesuai dengan username sistem Anda.

## 5. Restart Service Minidlna

> sudo service minidlna restart

## 6. Test

Tes dapat menggunakan VLC Player, atau dengan media player lainnya yang memiliki fitur _**UPnP**_

_**Referensi :**_

_[https://wiki.archlinux.org/index.php/ReadyMedia](https://wiki.archlinux.org/index.php/ReadyMedia)_