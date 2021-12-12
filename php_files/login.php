<?php
session_start();

include("connectApp.php");
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



$mysql = $connection->prepare("SELECT username,password FROM users WHERE username= ?");
$mysql->bind_param("s", $username);
	$mysql->execute();
    $results = $mysql->get_result();
    $temp['access']="Password or username are Incorrect";

    while($data = $results->fetch_assoc()){

        if($data['password']==$pass){
         $temp['access']="YES";
         $_SESSION['logged_user']=$username;


        }

    }


$json = json_encode($temp);
$final="[".$json."]";
print $final;

?>