#Belajar Aplikasi Java#
Belajar Java bareng:
- Benny Wahyudi
- Mr. Yudi

Aplikasi ini kami buat belajar pada saat kunjungan saya di Palembang tanggal 13-Nov-2013

1. Tambahkan script berikut: 
create table test_insert(
	kode_barang varchar(12), 
	nama_barang varchar(255), 
	time_ins timestamp without time zone default now(), 
	user_ins varchar(30) default current_user, 
	id bigserial primary key
);

select * from test_insert