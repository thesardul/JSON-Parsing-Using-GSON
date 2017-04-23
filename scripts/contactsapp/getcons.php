 <?php  
 $db_name = "contactsdb";  
 $mysql_user = "root";  
 $mysql_pass = "";  
 $server_name = "localhost";  
 $con = mysqli_connect($server_name,$mysql_user,$mysql_pass,$db_name);  

if ($con) 
{

	$sql = "select * from contacts";
	$result = mysqli_query($con, $sql);
	$response = array ();
	while ($row = mysqli_fetch_array($result)) {
		array_push($response, array("id"=>$row['id'],"name"=>$row['name'],"email"=>$row['email']));
	}
	echo json_encode($response);

}
 mysqli_close($con);
 ?> 