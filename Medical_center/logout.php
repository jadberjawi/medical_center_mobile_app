<?php

session_start();

unset($_SESSION["logged_user"]);

	$temp['logged_out']="YES";
	
$json = json_encode($temp);
$final=$json;
print $final;

?>