<?php
    $mysql = new mysqli("localhost", "root","", "android_user");

    if ($mysql -> connect_error)
    {
        die("Fallo de conexion");
    }
   