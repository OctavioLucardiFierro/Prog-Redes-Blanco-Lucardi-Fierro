<?php
include ("db.php");

    if (isset($_POST['register']))
        {
                    $Usuario          =trim($_POST['Usuario']);
                    $Mail             =trim($_POST['Mail']);
                    $Contraseña       =trim($_POST['Contraseña']);
                    $updated_at       = date('m-d-Y h:i:s a', time());
                    $created_at       = date('m-d-Y h:i:s a', time());

                    //"INSERT INTO persona(Nombre,Email, DNI, FechaDeNacimiento, Edad, num_celular, Apellido, Estado,Contraseña) VALUES ('$Nombre','$Email','$DNI','$FechadeNacimiento','$Edad','$Telefono','$Apellido','Cliente','$Contraseña')";
                    $consulta = "INSERT INTO `user`(`ID`, `Usuario`, `Mail`, `Contraseña`, `created_at`, `updated_at`) VALUES (NULL,'$Usuario','$Mail','$Contraseña',NOW(),NOW())";
                    
                    $resultado = mysqli_query($mysql,$consulta);
    
                    
                if ($resultado) {
                    ?>
                    <h3 class="ok">¡Te has inscripto correctamente!</h3>
                <?php
                }
    }
?>