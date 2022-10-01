<!DOCTYPE html>
<html lang="en">
<head>	
</head>
<body>
    <?php
            $inc2 = include("db.php");

            if ($inc2) {
                $consulta2 = "SELECT * FROM `user`";
                $resultado2 = mysqli_query($mysql,$consulta2);
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
				 <?php while($row2 = $resultado2->fetch_assoc()){    ?>
					 <tr>
						 <td class = "fil"><?php  echo $row2['ID'] ?></td>
						 <td class = "fil"><?php  echo $row2['Usuario'] ?></td>
                         <td class = "fil"><?php  echo $row2['Mail'] ?></td>
						 <td class = "fil"><?php  echo $row2['created_at'] ?></td>
                         <td class = "fil"><?php  echo $row2['updated_at'] ?></td>
				 <?php }?>
				 </tbody>
		 </table>

</body>
</html>