<?php
 $nama = $_POST['name'];
 $hp = $_POST['hp'];
 $jk = $_POST['jk'];
 $dob = $_POST['dob'];
 $address = $_POST['address'];

echo "Selamat $nama, Anda sebagai PEKERJA telah berhasil membuat form<br>";
echo "Berikut data diri Anda : <br><br>";

echo "Nama 			= $nama <br>";
echo "Handphone 	= $hp <br>";
echo "Gender 		= $jk <br>";
echo "Date of Birth = $dob <br>";
echo "Address 		= $address";

?>
