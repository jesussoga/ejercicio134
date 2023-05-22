# En este ejercicio, crearemos un juego de Trivial. 

• Comenzaremos con el archivo "index.html", donde por el momento mostraremos dos opciones disponibles:     
  -Agregar una pregunta.   
  -Mostrar todas las preguntas existentes.    
  
• Acceder a los datos utilizando repositorios y utilizar servicios para interactuar con los repositorios.   

• No es necesario crear un script para crear la base de datos o la tabla en MySQL. Simplemente crea la base de datos manualmente y permite que JPA se encargue de crear la tabla de preguntas.  

• Cada pregunta constará de los siguientes campos:    
  -Id    
  -Pregunta    
  -Respuesta válida    
  -Respuesta de relleno 1    
  -Respuesta de relleno 2    
  -Respuesta de relleno 3    
  
• GET /api/preguntas: Devuelve todas las preguntas en formato JSON.   

• POST /api/preguntas/agregar: Permite agregar preguntas a la base de datos. Inicialmente, haremos esto mediante peticiones POST con Postman. En un futuro, cuando tengamos un frontend, utilizaremos un formulario para realizar estas solicitudes. Se enviará un objeto JSON con la pregunta y se agregará a la base de datos. El comportamiento final del método puede ser determinado por ti (por ejemplo, devolver la pregunta en formato JSON, devolver todas las preguntas o redirigir a "index.html").  

• DELETE /api/preguntas/{id}: Borra la pregunta con la id especificada.   

• GET /api/preguntas/{id}: Muestra la pregunta con la id recibida.    

• GET /api/preguntas/formulario: Muestra un formulario ("formulario.html") para agregar una pregunta. Los datos del formulario se enviarán a una URL definida en el siguiente punto. Se accede a este formulario a través de un botón en "index.html".    

• POST /api/preguntas/agregar: Agrega la pregunta enviada desde el formulario anterior.   

• Agrega un método al servicio de preguntas que valide una pregunta. Devuelve true si la pregunta es válida y false en caso contrario. Una pregunta se considera válida si tiene al menos una pregunta, una respuesta y una respuesta incorrecta. Si alguno de estos campos está vacío o es nulo, la pregunta no será válida.   
