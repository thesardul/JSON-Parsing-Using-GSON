# JSON-Parsing-Using-GSON
Android App For JSON Parsing Using GSON

With the help of RECYCLER VIEW and Card View.
This App fetches data Form Server and Returns the result



# Dependencies Used

    compile 'com.android.support:appcompat-v7:25.3.1'
# For Recycler View
    compile 'com.android.support:recyclerview-v7:25.3.1'
# Card View
    compile 'com.android.support:cardview-v7:25.3.1'
# Volley
    compile 'com.android.volley:volley:1.0.0'
# GSON
    compile 'com.google.code.gson:gson:2.8.0'
# Extras

I used Wamp Server and the code for server side scripting can be found in the Script folder.

# The SCRIPT

<?php  
 $db_name = "contactsdb";  
 $mysql_user = "root";  
 $mysql_pass = "12345";  
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
 
 The Contacts table have 3 Columns
 1. ID  Int
 2. Name Varchar(50)
 3. Email Varchar(50)
