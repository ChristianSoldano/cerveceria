# TP cerveceria  
-Realizar un sistema Produtor/Consumidor  
-Como mínimo se deben tener 3 clases más nuestro main, BeerProducer, BeerConsumer, BeerHouse.  
-La capacidad de la cervecería(BeerHouse) es de 100 unidades, una vez alcanzado este tope, el productor deberá esperar.  
-El consumidor no tiene tope de consumo.  
-El sistema deberá parar cuando el stock sea 0.  

# Análisis

**¿Cuántos consumidores se necesitan para que el stock llegue a 0?**  
Dependerá de cuan rapido los consumidores consuman y de de cuan rapido el productor poduzca.  
Si los consumidores consumen más rapido de lo que produce el productor el proceso va a finalizar, en caso contrario no va a finalizar nunca.

**Bloques synchronized, ¿Por qué deben serlos?**  
Se utiliza el bloque synchronized para que dos hilos no intenten modificar el recurso compartido al mismo tiempo.  

**Explicar el recurso compartido**  
Es una variable que va a ser leida y/o modificada por varios hilos a la vez.  

**Explicar las 3 formas de instanciar un Thread**  
-Hacer un extends de Thread  
-Implementación de la Interfaz Runnable  
-Thread thread = new Thread()  
