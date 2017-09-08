# Laboratorio 3 Programación Avanzada

### Carlos Andrés Cuéllar Velásquez 2497117

## a) Cuestionario


- ¿Qué es una interfaz?
 
Una interfaz es un conjunto de métodos abstractos y de constantes cuya funcionalidad es la de determinar el funcionamiento de una clase, es decir, funciona como un molde o como una plantilla. Al ser sus métodos abstractos estos no tiene funcionalidad alguna, sólo se definen su tipo, argumento y tipo de retorno.

- ¿Qué es una clase abstracta?

Es una clases que nos permiten crear método generales que recrean un comportamiento común, pero sin especificar cómo lo hacen. A nivel de  código tienen por particularidad que algunos de sus métodos no tienen cuerpo de declaración.

- ¿Qué diferencia hay entre interfaces y herencia?

La diferencia es que una

 1. Herencia: Tienes una jerarquía de clases. Que bien pueden heredar propiedades y métodos de una clase abstracta.
 y por otro lado 
 
 2. Interfaz: Es “obligar” a una clase a dar cuerpo a los métodos declarados en una interface, con el fin de que tu clase genere         objetos que sean del tipo de interface que implementan.

- ¿Qué diferencia hay entre pila, cola y lista? 

 1. Pila: Es un método de estructuración de datos usando la forma LIFO (ultimo en entrar, primero en salir).
       Tiene operaciones como: 
       
        - Push (Introduce elemento a la pila) 
        - POP (Elimina un elemento de la pila)
        - Vacia (Función booleana que indica si la pila esta vacia o no)

 2. Cola: Es un método de estructuración de datos usando la forma FIFO (Primero en entrar, primero en salir).
       Tiene operaciones como: 
       
        - Crear(Crea la cola vacia)
        - Encolar(Introduce elemento a la cola) 
        - Desencolar(Elimina el primer elemento de la cola)
        - Frente(Decuelce el elemento frontar de la cola, es decir, el primer elemento que entró)
        
  2. Lista: Es un tipo de dato autorefenciado porque contiene un puntero o link a otro dato del mismo tipo.
       Tiene operaciones como: 
        - Recorrer los elementos hacia adelante 
        - Recorrer los elementos hacia atras
        - Insertar un nuevo elemento al principio
        - Insertar un nuevo elemento al final
        - Insertar un nuevo elemento despues de otro 
        - Insertar un nuevo elemento antes de otro
        - Remover un elemento del principio
        - Remover un elemento del final
        - Remover un elemento que esta antes que otro
        - Remover un elemento que esta despues de otro
        

## b) Bitácora

1. Comprobar la version de Java disponible en el sistema 

    [Versión de Java](https://www.dropbox.com/home/Lab2_1?preview=Version.png)

2. Crear una cuenta en GitHub

    [Como crear cuenta Hub](https://www.dropbox.com/home/Lab2_1?preview=CGit.png)

3.  Crear cuenta y utilizarla en EclipseChe/Eclipse

    [Como crear cuenta EclipseCHE](https://www.dropbox.com/home/Lab2_1?preview=EcliCHE.png)

    [Entorno EclipseCHE](https://www.dropbox.com/home/Lab2_1?preview=EcliCHE2.png)

### Agregación
1. Crear la clase Main, la clase Point y la clase Line

[Clases](https://www.dropbox.com/home/Lab2_2?preview=Crear+clases.png)

2. Implementar lo siguiente en la clase Point

    2.1 Se crea la clase "Point" donde se declaran las variables private x & y 

    2.2 Se crea el constructor para obtener los valores de x & Y

    2.3 Se crean las funciones y procedimientos Gets y Sets para las variables x & y, junto con un arreglo de tamaño donde 
    la posicion 0 es x y la posicion 1 es y.

    2.4 Se escribe un to string para tener las variables en un dato alfanumérico

    2.5 Se crean las funciones para calcular las distancias entre los puntos. 

     [Imagen 1](https://www.dropbox.com/home/Lab2_2?preview=Captura+de+pantalla+(20).png)

     [Imagen 2](https://www.dropbox.com/home/Lab2_2?preview=Captura+de+pantalla+(21).png)

     [Imagen 3](https://www.dropbox.com/home/Lab2_2?preview=Captura+de+pantalla+(22).png)

     [Imagen 4](https://www.dropbox.com/home/Lab2_2?preview=Captura+de+pantalla+(23).png)

     [Imagen 5](https://www.dropbox.com/home/Lab2_2?preview=Captura+de+pantalla+(24).png)

     [Imagen 6](https://www.dropbox.com/home/Lab2_2?preview=Captura+de+pantalla+(25).png)

     [Imagen 7](https://www.dropbox.com/home/Lab2_2?preview=Captura+de+pantalla+(26).png)

     [Imagen 8](https://www.dropbox.com/home/Lab2_2?preview=Captura+de+pantalla+(27).png)

3. Implementar lo siguiente en la clase Line

    3.1 Se crea el objeto de punto inicial y objeto de punto final 

    3.2 Se crea el constructor para obtener los valores finales e iniciales de x & Y

    3.3 Crear el constructor que recopila la información de la distancia entre puntos y distancia entre los ejes. 

     [Imagen 1](https://www.dropbox.com/home/Lab2_3?preview=Captura+de+pantalla+(28).png)

     [Imagen 2](https://www.dropbox.com/home/Lab2_3?preview=Captura+de+pantalla+(29).png)

     [Imagen 3](https://www.dropbox.com/home/Lab2_3?preview=Captura+de+pantalla+(30).png)

### Herencia

1. Crear la clase Person con sus variables, constructor y sus métodos propios de la clase.

     [Imagen 1](https://www.dropbox.com/home/Lab2_4?preview=Captura+de+pantalla+(31).png).

2. Crear la clase Student la cual hereda los métodos de person, se realiza un constructor y los métodos propios de la subclase Student.
     
     [Imagen 1](https://www.dropbox.com/home/Lab2_4?preview=Captura+de+pantalla+(32).png).

     [Imagen 2](https://www.dropbox.com/home/Lab2_4?preview=Captura+de+pantalla+(33).png).

3. Crear la clase Teacher la cual hereda los métodos de person, se realiza un constructor y los métodos propios de la subclase Student.

     [Imagen 1](https://www.dropbox.com/home/Lab2_4?preview=Captura+de+pantalla+(34).png).

     [Imagen 2](https://www.dropbox.com/home/Lab2_4?preview=Captura+de+pantalla+(35).png).

### Ejecución

1. En la clase Main, se ejecutará los dos programas. Por un lado tenemos la ejecución de la distancias de los puntos que seria el proyecto de agregación y por el otro lado tenemos la ejecución de el proyecto de herencia en donde se daran todos los metodos que se les dio a las clases Student y Teacher.  

     [Imagen 1](https://www.dropbox.com/home/Lab2_5?preview=Captura+de+pantalla+(36).png).

     [Imagen 2](https://www.dropbox.com/home/Lab2_5?preview=Captura+de+pantalla+(37).png).
