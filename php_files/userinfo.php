<?php
 session_start();
include("connectApp.php");

 $username=$_GET['username'];
// $username="jad";

$query = "SELECT * FROM users WHERE username= ?";
$stmt = $connection->prepare($query);
$stmt->bind_param("s", $username);
$stmt->execute();
$results = $stmt->get_result();

$temp_array = [];

while($row = $results->fetch_assoc()){
	$temp_array[] = $row;
	// $temp_array[] = $row['reserv_time'];
}

$json = json_encode($temp_array);
print $json;

?>