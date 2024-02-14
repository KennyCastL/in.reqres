#language: es

Característica: Operaciones con el usuario


  @GetUser
  Escenario: Consulta exitosa del usuario
    Cuando el usuario consume el endpoint
    Entonces el usuario podra ver el status code 200

  @PostUser
  Escenario: Crear usuario exitoso
    Cuando el usuario consume el endpoint se envia la informacion
    Entonces responde status code 201

  @PutUser
  Escenario: Actualizar usuario exitoso
    Cuando el usuario consume el endpoint  se envia la informacion para actualizar
    Entonces el servidor responde status code 200

  @DelUser
  Escenario: Eliminar usuario exitoso
    Cuando el usuario consume el endpoint  se envia el usuario a eliminar
    Entonces el servidor debe responder status code 204