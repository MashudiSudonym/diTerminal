---
layout: post
title:  "Setelah Install ElementaryOS 0.3 Freya di Acer Asphire 4738z"
date:   2015-04-23 21:24:51
categories: linux open source
comments: true
---
Baru kali ini bikin catatan yang spesifik sampai sebut merk dan tipe mesin tempur. :LoL .. Yah, ya udah, udah terlanjur juga, terus karena alasan **_Error pada setiap distro pasti berbeda pada setiap mesin (PC, laptop, dan lain sebagainnya)_**. Oke, catatan ini terkait dengan distro yang baru rilis pertengahan April 2015 :tada: , yang jadwal rilisnya tidak bisa ditunggu atau diprediksi baik itu oleh para pengamat, maupun dunia perdukunan xD Yap, itu adalah **_ElementaryOS Freya_**. Distro penerus dari versi sebelumnya si Luna, informasi tentang distro ini silahkan dibaca di web mereka _[http://elementary.io/](elementary.io)_.

![tampilan ElementaryOS Freya di mesin Saya](/images/5.png)

Kalau di mesin Saya, yang perlu dilakukan untuk distro ini adalah :

## 1. **Memperbaiki Driver VGA**

Kebetulan mesin Saya pakai Intel VGA-nya, 


	sudonym@sudonym-Aspire-4738Z:~$ sudo lshw -c video
	[sudo] password for sudonym: 
  	*-display               
   	    description: VGA compatible controller
   	    product: Core Processor Integrated Graphics Controller
   	    vendor: Intel Corporation
   	    physical id: 2
   	    bus info: pci@0000:00:02.0
   	    version: 18
   	    width: 64 bits
   	    clock: 33MHz
   	    capabilities: msi pm vga_controller bus_master cap_list rom
   	    configuration: driver=i915 latency=0
   	    resources: irq:40 memory:90000000-903fffff memory:80000000-8fffffff ioport:3050(size=8)
	sudonym@sudonym-Aspire-4738Z:~$


Error yang ditemui adalah saat perpindahan jendela dengan _alt+tab_ atau saat _multitasking view_ dan _saat drag and drop file_ yang kursor akan berubah menjadi dua. Untuk cara mengatasinya adalah menginstall paket berikut ini :

> sudo apt-get install xserver-xorg-video-intel xserver-xorg-core

## 2. **Install TLP dan Thermald**

Ini untuk apa sih ? hem, beneran deh, kalau ga pakai mereka baterai bisa cepet habis, dan suhu pasti di atas 70c. Cara installnya gimana ? ya gini :

> sudo add-apt-repository ppa:linrunner/tlp

> sudo apt-get update

> sudo apt-get install tlp tlp-rdw thermald

kalau udah keinstall dilanjut dengan perintah ini :

> sudo tlp start

_**Tambahan**_ : untuk mengecek suhu install paket ``lm-sensors`` dengan cara 

> sudo apt-get install lm-sensors

dan lakukan pengecekkan dengan mengetik ``sensors`` pada terminal.

## 3. **Install Aplikasi Pendukung**

Langkah memperbaiki error sudah dilakukan, sekarang install aplikasi pendukung tentunya untuk mendukung kegiatan komputasi. Berikut adalah PPA dan nama aplikasinya : 

_copy-paste baris-perbaris maka Anda tidak akan menemui kendala_

> sudo add-apt-repository -y ppa:mpstark/elementary-tweaks-daily

> sudo add-apt-repository -y ppa:maarten-baert/simplescreenrecorder

> sudo apt-add-repository -y ppa:teejee2008/ppa

> sudo add-apt-repository -y ppa:libreoffice/ppa

> sudo add-apt-repository -y ppa:elementary-os/unstable-upstream

> sudo add-apt-repository -y ppa:inkscape.dev/stable

> sudo add-apt-repository -y ppa:webupd8team/sublime-text-2

> sudo apt-get update

> sudo apt-get install ubuntu-restricted-extras flashplugin-installer pidgin libreoffice libreoffice-style-sifr inkscape gimp gimp-gmic build-essential rhythmbox sublime-text elementary-tweaks vlc transmission rar icedtea-7-plugin openjdk-7-jre acpi indicator-synapse conky conky-all conky-manager simplescreenrecorder simplescreenrecorder-lib:i386

Untuk web-browser bisa menggunakan Google Chrome, bisa menunduh di website Google Chrome.

Sudah, cukup begitu hal yang Saya lakukan setelah install ElementaryOS 0.3 Freya di Laptop Acer 4738z. :octocat: