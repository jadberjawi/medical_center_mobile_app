<?php

include("connectApp.php");


$username = $_GET["username"];
$pass = hash("sha256", $_GET["pass"]);


$query = "SELECT * FROM users ";
$stmt = $connection->prepare($query);
$stmt->execute();
$results = $stmt->get_result();
while($data = $results->fetch_assoc()){
	if($data['username']==$username && $data['password']==$pass ){
       $temp['access']="OK";
        $json = json_encode($temp);
        print $json;
        return;
    }
    
}

$json = json_encode("NO");
        print $json;


?>