# Curso de Programación Full Stack: Introducción a Java

Este repositorio contiene la resolución de los ejercicios prácticos del módulo de Introducción a Java. Los ejercicios abarcan desde la sintaxis básica hasta la manipulación de arreglos y creación de subprogramas.

## 📚 Fundamentos del Lenguaje Java

Java es un lenguaje de programación de alto nivel y tipado estático. Esto significa que todas las variables deben ser declaradas antes de ser utilizadas y no se puede cambiar su tipo de dato dinámicamente. A continuación, un resumen de los conceptos teóricos aplicados en estos ejercicios:

### Variables y Tipos de Datos
Las variables son espacios de memoria, similares a pequeñas cajas, que guardan información en su interior. 
* **Declaración:** Deben declararse indicando su tipo de dato seguido de su nombre (ej. `<tipo_de_dato> <nombre_variable>;`).
* **Tipos Primitivos:** Son aquellos predefinidos por el lenguaje. Incluyen `byte`, `short`, `int`, `long`, `float`, `double`, `boolean` y `char`.
* **Clase String:** Aunque técnicamente es un objeto inmutable, Java le da un soporte especial para manejar cadenas de caracteres como si fuera un tipo primitivo.

### Operadores
* **Aritméticos:** Suma (`+`), Resta (`-`), Multiplicación (`*`), División (`/`) y Módulo (`%`).
* **Relacionales:** Igualdad (`==`), Distinto (`!=`), Mayor que (`>`), Menor que (`<`), etc.
* **Lógicos:** AND (`&&`), OR (`||`) y Negación (`!`).

### Estructuras de Control
Las estructuras de control modifican el flujo de ejecución lineal del programa.

#### Condicionales
* **if / else:** Ejecuta un bloque de código si la condición lógica evaluada es verdadera (`true`); en caso contrario, puede ejecutar un bloque alternativo (`else`).
* **switch:** Evalúa el valor de una variable y ejecuta las sentencias del bloque `case` que coincida con dicho valor. Si no hay coincidencias, ejecuta el bloque `default`.

#### Repetitivas (Bucles)
* **while:** Ejecuta instrucciones mientras se cumpla una condición, la cual se evalúa *antes* de iniciar la iteración.
* **do/while:** Similar al `while`, pero evalúa la condición al *final* del bloque, garantizando que el código se ejecute al menos una vez.
* **for:** Utilizado cuando se conoce de antemano la cantidad exacta de veces que se repetirá un bloque de instrucciones. Posee inicialización, condición de terminación e incremento.

### Subprogramas
Se basan en la técnica de "divide y vencerás" para fragmentar un problema complejo en tareas más simples.
* **Funciones:** Bloques de código que reciben argumentos, realizan operaciones y *retornan* un valor específico mediante la instrucción `return`.
* **Procedimientos:** Son funciones que se ejecutan sin retornar ningún valor (su tipo de retorno es `void`).

### Arreglos: Vectores y Matrices
Contenedores de tamaño fijo que agrupan valores del mismo tipo de dato.
* **Vectores:** Arreglos unidimensionales.
* **Matrices:** Arreglos bidimensionales que requieren índices de fila y columna.
* Se instancian utilizando la palabra reservada `new`.

### Clases de Utilidad
* **Scanner:** Clase del paquete `java.util` empleada para leer la entrada de datos por teclado.
* **String:** Provee métodos fundamentales para manipular texto, tales como `length()`, `equals()`, `substring()` y `toUpperCase()`.
* **Math:** Ofrece herramientas matemáticas estáticas como `Math.random()` para generar números aleatorios y `Math.sqrt()` para raíces cuadradas.

## 💻 Sobre los Ejercicios

Los ejercicios resueltos en este repositorio cubren:
1.  Entrada y salida de datos por consola.
2.  Operaciones matemáticas condicionales y ciclos.
3.  Desarrollo de lógicas de validación (ej. dispositivos RS232).
4.  Creación y recorrido de matrices, incluyendo matrices transpuestas y comprobación de cuadrados mágicos.

## 💡 Nota sobre el Proceso

Este proyecto tiene un valor especial para mí. Todos los ejercicios fueron resueltos hace unos años, antes del auge de las herramientas de IA generativa. Mi proceso de aprendizaje fue 100% manual y autodidacta, apoyándome en:
* Análisis profundo de la documentación.
* Horas de investigación en foros de programación.
* Tutoriales técnicos y videos educativos de YouTube.

Resolver estos desafíos "a código puro" me permitió cimentar las bases de la lógica de programación que utilizo hoy en día.

## 🎓 Créditos

El material didáctico, la guía de estudio y los enunciados de los ejercicios pertenecen a **Egg**, la institución que brindó la base teórica para este módulo del curso de Programación Full Stack.

## Autor

**Lucas**
