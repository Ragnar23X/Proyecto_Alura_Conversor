
---

# Alura Proyecto - Conversor de Monedas

Este es un simple conversor de monedas desarrollado en Java que utiliza la API de ExchangeRate-API para obtener tasas de cambio en tiempo real. Permite a los usuarios convertir montos de una divisa a otra de manera rápida y sencilla.

## Características

- Conversión entre diferentes monedas basadas en las tasas de cambio actuales.
- Interfaz de usuario simple y fácil de usar.
- Actualización automática de las tasas de cambio al realizar una conversión.

## Uso

1. Clona este repositorio en tu máquina local.
2. Abre el proyecto en tu IDE de Java favorito.
3. Ejecuta la clase `conversor.java`.
4. Se mostrará un menú con las siguientes opciones:
   - (1) Conversar Divisa
   - (2) Salir
5. Si seleccionas la opción 1, se mostrará un listado de las iniciales de las divisas disponibles y sus nombres.
6. Ingresa las iniciales de la divisa base que deseas convertir.
7. Ingresa las iniciales de la divisa a la que deseas convertir la divisa base.
8. Ingresa la cantidad de la divisa base que deseas convertir.
9. El programa realizará la conversión y mostrará el resultado redondeado a dos decimales.
10. Puedes realizar más conversiones seleccionando nuevamente la opción 1. Para salir, selecciona la opción 2.

## Ejemplo

```
******************************
Bienvenido al conversor de divisas

(1)- Conversar Divisa
(2)- Salir
*******************************

1

*****************************
                        
ARS - Peso Argentino                      
BOB - Boliviano Boliviano                       
BRL - Real Brasileño                      
CLP - Peso Chileno                       
COP - Peso Colombiano                      
USD - Dólar Estadounidense                    
CRC - Colón Costarricense                   
******************************

Digite las iniciales de la divisa base que desea conversar: 
USD
Ahora digite la divisa en la que desea convertir el USD: 
EUR
Por favor digite la cantidad de USD que desea convertir a --> EUR
100

El resultado de convertir 100.0 USD es 89.74 EUR
```

¡Disfruta convirtiendo monedas con nuestro conversor!

---
