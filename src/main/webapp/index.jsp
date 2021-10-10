
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Registro de Usuarios</h1>
        <form action="ProcesaServlet" method="post">
            <label>Nombre : </label>
            <input type="text" name="nombre" value="">
            <br>
            <label>Apellido :</label>
            <input type="text" name="apellido" value="" />
            <br>
            <label>Correo : </label>
            <input type="text" name="correo" value="" />
            <br>
            <label>Contraseña : </label>
            <input type="password" name="contrasena" value="" />
            <br>
            <input type="submit" value="Enviar" />
            
        </form>
    </body>
</html>
