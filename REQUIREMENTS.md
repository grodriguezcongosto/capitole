SCM-GIT

•             Uso de github para presentar el código 

•             Usar numerosos commits para poder seguir la evolución del código, así como comentarios significativos en ellos


Tooling

•             Inclusión de Maven wrapper

•             Buena definición del POM

•             Uso de Flyway para migraciones de bases de datos.


Java

•             Usar últimas versiones y aplicar al máximo las opciones del lenguaje.

o            P.e.: si usas java8… usar streams, optionals y localdatetime


Spring

•             Usar correctamente los archivos de recursos (definición del datasource e inicialización de la base de datos)

•             Uso de advice para manejo de excepciones


CleanCode

•             Nombrado de métodos y variables de manera clara

•             Inyección de dependencias por constructor

•             Usar builders o constructores en lugar de setters (apreciable en RestExcepctionAdvice)

•             Definir bien métodos y clases

•             Que no haya acoplamiento en el diseño; no depender siempre de clases concretas y utilizar interfaces

o            Buen diseño con bajo acoplamiento mediante el uso de interfaces y modelo diferente de base de datos y de API.

 

Testing

•             Tests de sistema con diferentes casuísticas y claros

•             Aplicar testing unitarios

•             Comprobar que pasen todos los tests