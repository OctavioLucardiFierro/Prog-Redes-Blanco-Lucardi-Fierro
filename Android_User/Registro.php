<!DOCTYPE html>
<html>
<head>
    <link rel = "stylesheet" href = "CSS/reister.css">
    <title>Formulario INSERT</title>
</head>
<body>

                <form method="post">
                    <main class="contenido">
                        <section>
                                <form method="post" action="" name="signup-form">

                                    <div class="form-element">
                                        <label>Usuario</label>
                                        <input type="text" name="Usuario"  required />
                                    </div>

                                    <div class="form-element">
                                        <label>Email</label>
                                        <input type="email" name="Mail" required />
                                    </div>

                                    <div class="form-element">
                                        <label>Contraseña</label>
                                        <input type="password" name="Contraseña" required />
                                    </div>

                                    <button type="submit" name="register" value="register">Registrar</button>
                                </form>

                                
                                        <?php
                                        include("insert.php");
                                        ?>
                        </section>
                    </main>
                    <br>
                                <br>
                                <a href="../index.html"><button>Volver</button></a>
                </form>
                                
</body>
</html>