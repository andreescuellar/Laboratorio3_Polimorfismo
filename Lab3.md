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


1. Crear la clase Shape
   1.1 Se indica que es una interface y no una clase.
   1.2 Se declara los dos parametros que deben tener las otras dos sub clases que posteriormente se realizaran.

 [Shape](Shape.png)
 ![GitHub Logo](/images/Shape.png)
 ![](/Laboratorio3_Polimorfismo/Shape.png)
2. Crear la clase Rectangulo

    2.1 Se declaran las variables de la clase Rectangulo que seria altura y largo.

    2.2 Se crea el constructor que obtendra los valores de las variables. 

    2.3 Se crea el metodo que obtendra el area del rectangulo, por medio de la multiplicacion de la altura y el largo. 

    2.4 Se escribe un to string para obtener el valor de todos los datos y organizarlos en una cadena alfanumerica. 


     ![Shape](Rectangulo.jpg)


3. Crear la clase Triangulo

    3.1 Se declaran las variables de la clase Triangulo que seria base y altura.

    3.2 Se crea el constructor que obtendra los valores de las variables. 

    3.3 Se crea el metodo que obtendra el area del triangulo, por medio de la multiplicacion de la base y la altura y el resultado de la multiplicación sera dividido por 2. 

    3.4 Se escribe un to string para obtener el valor de todos los datos y organizarlos en una cadena alfanumerica. 
 

     [Triangulo](Triangulo.png)

4. Crear la clase Main

    4.1 Se declaran los objetos de la clase Main.

    4.2 Se les da forma a los objetos anteriormente creados, dandole valores a los parametros. 

    4.3 Se imprimen llamando al metodo ToString, ejemplo: System.out.println("nombre del objeto".toString());




