<?php


$server = "localhost";
$username = "root";
$password = "";
$dbname = "Mobile_project_final";

$connection = new mysqli($server, $username, $password, $dbname);

if($connection->connect_error){
	die("Failed");
}


//echo "here";
//$data="ali";


//$sql="INSERT INTO names(First_Name) VALUES ('$data')";
//if(mysqli_query($connection,$sql)){
//	echo "sucess";
//}
?>

