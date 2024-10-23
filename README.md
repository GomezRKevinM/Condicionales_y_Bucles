# Condicionales y Bucles

>[!NOTE]
>Material empleado en la transmisión de la clase enfocada en el uso, estructura y funcionalidad de los condicionales y los Bucles.

<h2>Condicionales</h2>

`if` `else if` `else` `switch` `?:`
<ol>
  <li> <h3>¿Qué es?</h3><p>Un Condicional es una estructura de control de flujo, es decir se encarga de darle una dirección a los datos o variables según el resultado de una condición</p></li>
  
  ## if

```java
if(condición){
  // Código a ejecutar sí se cumple la condición
}
```
 ## else if
```java
if(condición){
    //Código
  }
else if(condición2){
// Sí no se cumple la primera condición pero se cumple una segunda
}
```

 ## else
 ```java
if(condición){
    //Código
  }
else if(condición2){
// Sí no se cumple la primera condición pero se cumple una segunda
}
else{
// Ejecuta Sí no se cumple ninguna condición
}
```

<h2>Condicionales Avanzadas</h2>

## switch
 ```java
switch(variable){
  case x:
     // condición de cuando la variable vale x
    break; //Cierre de ese caso.
  default:
    // cuando no se cumple ningun caso.
    break;
}
```

## ?: Operador ternario

 ```java
<tipo de variable a recibir> nombre = condicion ? retorno si la condición se cumple : retorno si no se cumple;
//el operador ternario siempre debe recibir un valor, ya sea entero, booleano o de String.
```
  
</ol>

<h2>Bucles</h2>
<ol>
<li><h3>¿Qué es?</h3><p>Un bucle es un bloque de código que se ejecuta reiteradas veces, mientras su condición sea verdadera.</p></li>
  <li>for</li>
  <li>while</li>
  <li>do-while</li>
</ol>

>[!IMPORTANT]
>Link de la clase: <a href="https://kick.com/kenuelg/videos/5954ec01-74c2-4a2b-8761-38ab88f7fff8?t=3097" target="_blank">Click Aquí</a>

