# Proyecto de Pruebas de API con Karate

Este proyecto está basado en [Karate DSL](https://github.com/karatelabs/karate), un framework que permite la automatización de pruebas de **APIs REST** de manera sencilla y expresiva.

## 🎯 Objetivo del Proyecto
El objetivo de este proyecto es validar los endpoints de un API, incluyendo operaciones como:
- **Consultar productos**
- **Crear productos**
- **Actualizar productos**

Se utilizan **features de Karate** organizadas por funcionalidad, donde cada escenario está etiquetado (`@tags`) para permitir la ejecución selectiva de pruebas.

---

## ✅ Requisitos Previos
- [Java 8 o superior](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Maven](https://maven.apache.org/)

Verifica que estén instalados:
```bash
java -version
mvn -version
```

---

## ▶️ Ejecución de las pruebas

La ejecución se realiza con **Maven**, especificando:
- El **tag** (`@nombreTag`) que indica el escenario o conjunto de escenarios a ejecutar.
- La variable `-Durl.apiRest` que define la URL del servicio bajo prueba.

### Comando de ejecución:
```bash
mvn clean test "-Dkarate.options=--tags @actualizarProduct" "-Durl.apiRest=https://fakestoreapi.com"
```

### Parámetros:
- `--tags @<nombreTag>` → Indica qué escenario(s) ejecutar.  
  Ejemplo:
  - `@consultarProduct`
  - `@crearProduct`
  - `@actualizarProduct`

- `-Durl.apiRest=<URL>` → Dirección base del API a probar.  
  Ejemplo:
  ```bash
  -Durl.apiRest=https://fakestoreapi.com
  ```

---

## 🧪 Ejemplos de uso

- Ejecutar pruebas de **consulta**:
  ```bash
  mvn clean test "-Dkarate.options=--tags @actualizarProduct" "-Durl.apiRest=https://fakestoreapi.com"
  ```
---

## 📊 Reportes
Al finalizar la ejecución, Karate genera reportes en:
```
target/cucumber-html-reports/
```
Abre este archivo en un navegador para ver los resultados detallados.

---

## 📂 Estructura del proyecto
```
src
 └── test
     └── java
         └── com
              └── co
                   └── api
                       ├── Actualizar.feature
                       ├── Consultar.feature
                       └── Crear.feature
```

Cada archivo `.feature` contiene escenarios de prueba específicos con sus respectivos `@tags`.

---
