# Entrevista-tecnica-Pigmalion

# Ejercicio Técnico – Validación de Suma de Elementos en una Lista

Este proyecto contiene una solución al problema técnico solicitado, implementado en Java.  
La funcionalidad principal consiste en verificar si dos elementos de una lista de enteros suman un valor esperado.

## 🛠 Tecnologías utilizadas

- **Lenguaje**: Java 17  
- **IDE**: IntelliJ IDEA (JetBrains)  
- **Versión de Java**: `17.0.8`  
- **Sistema de compilación**: No se utilizó ningún sistema como Maven o Gradle; el proyecto es simple.

## 📄 Contenido

El proyecto incluye dos métodos con diferentes enfoques:

1. `hasPairWithSumOptimized(List<Integer> numbers, int expectedSum)`  
   Utiliza una estructura `HashSet` para lograr una solución eficiente con complejidad **O(n)**.

2. `hasPairWithSumBruteForce(List<Integer> numbers, int expectedSum)`  
   Utiliza dos bucles anidados para verificar todas las combinaciones posibles, con complejidad **O(n²)**.

## 🚀 Cómo ejecutar

 Cloná el repositorio:
   ```bash
   git clone https://github.com/Javier20001/Entrevista-tecnica-Pigmalion.git
