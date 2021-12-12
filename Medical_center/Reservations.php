<?php
// session_start();
include("connectApp.php");


$query = "SELECT * FROM Reservations";
$stmt = $connection->prepare($query);
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