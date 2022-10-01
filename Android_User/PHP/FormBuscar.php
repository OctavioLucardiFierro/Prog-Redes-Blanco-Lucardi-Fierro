<?php
    error_reporting(E_ERROR | E_PARSE);//evita mostrar errores por si ingresamos a la paguina sin haber iniciado sesion 

?>
<!DOCTYPE html>
<html lang="en">
<head>
    
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <link rel="stylesheet" href="../CSS/TABLA.css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Buscar</title>
</head>
    <body>

        <form method="post">
                            <main class="contenido">
                                <section>
                                        <form method="post" action="" name="signup-form">

                                        

                                            <div class="form-element">
                                                <label>Buscar usuario por ID</label>
                                                <br>
                                                <input type="text" name="id" required />
                                            </div>
                                                <br>
                                                
                                            <button type="submit" name="buscar" value="buscar">Buscar</button>
                                            
                                            <br>
                                        </form>
                                </section>
                            </main>
        </form>

        <a href="../index.html"><button>Volver</button></a>
                                    <?php
                                        include("buscar.php");
                                        include("MostrarTabla.php");
                                        include("MostrarTodasLasTablas.php");
                                    ?>
                                    
                                    
    </body>
</html>