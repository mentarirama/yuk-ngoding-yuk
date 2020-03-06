<!DOCTYPE html>
<html>
<head>
	<title>FORM CALEG</title>
</head>
<body>
	<h1>PROFILE CALEG</h1>
<form method = 'post' action= "action1.php">
<fieldset>
  <table>
   <tr>
    <td>Partai</td>
    <td>:</td>
    <td><input type="text" name="partai" placeholder="your partai name" required></td>
   </tr>
   <tr>
    <td>No Urut</td>
    <td>:</td>
    <td><input type="text" name="noUrut" placeholder="your number" required></td>
   </tr>
   <tr>
    <td>Daerah Pilihan</td>
    <td>:</td>
    <td><input type="text" name="dapil" placeholder="your dapil" required></td>
   </tr>
  </table><br>
 
  <table>
   <tr>
    <td style="color: blue">Data Keluarga</td>
   </tr>
   <tr>
    <td>Istri</td>
    <td>:</td>
    <td><input type="text" name="istri" placeholder="your wife's name" required></td>
   </tr>
   <tr>
    <td>Anak 1</td>
    <td>:</td>
    <td><input type="text" name="anak1" placeholder="your child's name" required></td>
   </tr>
   <tr>
   	<td>Anak 2</td>
    <td>:</td>	
    <td><input type="text" name="anak2" placeholder="your child's name" required></td>
   <tr>
   	<td>
   	<input type="submit" name="submit" value="ENTER" />
   	</td>
   </tr>
  </table>  
 </fieldset>
</form>
</body>
</html>