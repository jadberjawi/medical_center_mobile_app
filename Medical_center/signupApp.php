<?php
session_start();

include("connectApp.php");

// $username = $_GET["username"];
// $pass = hash("sha256", $_GET["pass"]);
// $phone = $_GET["phone"];
// $city = $_GET["city"];
// $address = $_GET["address"];
// $floor = $_GET["floor"];

if(isset($_GET["username"]) && $_GET["username"] != ""){
	$username = $_GET["username"];
}else{
    die("[{\"access\":\"username feild empty\"}]");
}

if(isset($_GET["pass"]) && $_GET["pass"] != ""){
	$pass = hash("sha256", $_GET["pass"]);
}else{
    die("[{\"access\":\"password feild empty\"}]");

}
if(isset($_GET["phone"]) && $_GET["phone"] != ""){
	$phone = $_GET["phone"];
}else{
    die("[{\"access\":\"phone feild empty\"}]");
}

if(isset($_GET["city"]) && $_GET["city"] != ""){
	$city = $_GET["city"];
}else{
    die("[{\"access\":\"city feild empty\"}]");

}
if(isset($_GET["address"]) && $_GET["address"] != ""){
	$address = $_GET["address"];
}else{
    die("[{\"access\":\"address feild empty\"}]");
}

if(isset($_GET["floor"]) && $_GET["floor"] != ""){
	$floor = $_GET["floor"];
}else{
    die("[{\"access\":\"floor feild empty\"}]");

}
$mysql = $connection->prepare("INSERT INTO users(username,password,phone,city,address,floor) VALUES (?,?,?,?,?,?)");
	$mysql->bind_param("ssissi", $username,$pass,$phone,$city,$address,$floor);
	$mysql->execute();
	$s=$connection -> error;

if($s!=null){
$temp['access']=$s;

}
else{
	$temp['access']="YES";
	$_SESSION['logged_user']=$username;

}


$json = json_encode($temp);
$final="[".$json."]";
print $final;
?>