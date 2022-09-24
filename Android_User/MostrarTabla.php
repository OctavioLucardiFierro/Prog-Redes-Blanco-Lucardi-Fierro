<!DOCTYPE html>
<html lang="en">
<head>	
</head>
<body>
<?php
$inc = include("db.php");

if ($inc) {
    $id     = trim($_POST['id']);
	$consulta = "SELECT * FROM `user` WHERE  ID = '$id'";
	$resultado = mysqli_query($mysql,$consulta);
}


     ?>
     <br>
		 <table class = "tabla2" >
			 <thead>

                 <th class = "col-id">Id</th>
				 <th class = "col">Nombre</th>
				 <th class = "col">Email</th>
                 <th class = "col">created_ad</th>
				 <th class = "col">ureated_ad</th>

			 </thead>
				 <tbody>
				 <?php while($row = $resultado->fetch_assoc()){    ?>
					 <tr>
						 <td class = "fil"><?php  echo $row['ID'] ?></td>
						 <td class = "fil"><?php  echo $row['Usuario'] ?></td>
                         <td class = "fil"><?php  echo $row['Mail'] ?></td>
						 <td class = "fil"><?php  echo $row['created_at'] ?></td>
                         <td class = "fil"><?php  echo $row['updated_at'] ?></td>
				 <?php }?>
				 </tbody>
		 </table>



</body>
</html>