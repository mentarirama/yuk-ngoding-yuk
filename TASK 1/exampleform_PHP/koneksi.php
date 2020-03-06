<?php
	$host = 'localhost';
	$username = 'root';
	$password = '';
	$db_name = 'exform';

	$kon = mysqli_connect($host, $username, $password, $db_name);
	if ($kon){

	}else 
	echo "Gagal";
?>