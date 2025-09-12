# Parcial-Corte-1-CVDS-DOSW
Parcial del Corte 1

## Integrantes:
- juan Pablo Nieto Cortes

---

## maven corriendo bien

![img.png](docs/imagenes/img.png)

## Maven Test

![img.png](docs/imagenes/img.png)

---
## Punto del Parcial:

### Punto 1

1. Identifique por medio de un diagrama de contexto las generalidades de su
sistema.

![img.png](docs/imagenes/img.png)

entonces la enpresa necesita enviar notificaciones por distintos medios a preferencia del cliente y si es critico o no

---

### Punto 2

2. Establezca las funcionalidades presentes en el caso de estudio y desarrolle
un diagrama de casos de uso.

![img_1.png](docs/imagenes/img_1.png)

- la empresa quiere crear notificaciones de alerta para poder notificar a sus clientes 
- la empresa quiere ver las preferencias de envio de sus clientes para poder enviar las notificasiones de alerta
- el cliente quiere crear una preferencia de envio para poder que la empresa le envie sus notificaciones de alerta

---

### punto 3

3. Realice un diagrama de clases que permita entender su solución, adicional
mencione que principios SOLID está aplicando, en que componentes y
como.


### punto 4

los dos patrones son 
1. Strategy
2. Factory Method

Usamos el patrón Factory Method para tener una fábrica flexible que cree diferentes tipos de notificaciones email, SMS, push sin que el sistema principal tenga que saber los detalles de cómo se construye cada una, y el patrón Strategy para tratar cada método de envío como una estrategia intercambiable, permitiendo que el sistema elija dinámicamente cómo enviar el mensaje según las preferencias del cliente o la urgencia sin tener que modificar su código central cada vez que añadamos un nuevo canal como WhatsApp en el futuro.

![Diagrama en blanco.png](docs/imagenes/Diagrama%20en%20blanco.png)

- una unica responsabilidad por que las notificacion hasta el cliente tienen una sola responsabilidad
- tiene open source por que puedo crear mas medios y tipos de 
- liskof

---



---
### jacoco sirve

![img_3.png](docs/imagenes/img_3.png)
![img_4.png](docs/imagenes/img_4.png)
![img_5.png](docs/imagenes/img_5.png)


