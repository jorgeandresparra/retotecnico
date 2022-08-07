#language:es
  # Autor: Jorge Andres Parra
  @stories
  Característica: Pagina Utest
    Como un usuario,Yo quiero registrarme en la pagina Utest para aprender nuevas habilidades
  @scenario1
  Escenario: Registro para aprender nuevas habilidades
    Dado que Andres quiera registrarse en la página Utest
    | strNombre  | strApellido | strCorreo        | strCiudad     | strZip | strPais  | strPassword |
    | Andres     | Parra       | japc32@gmail.com | Bogota,Bogota | 110111 | Colombia | Mirions4636 |
    Cuando el intente crear su usuario y acepte los terminos y condiciones
    | boolTerms | boolPolicy |
    | true      | true       |
    Entonces el creara su usuario con exito
    | strRespuesta                                                            |
    | Welcome to the world's largest community of freelance software testers! |