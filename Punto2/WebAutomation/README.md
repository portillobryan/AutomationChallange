# Proyecto de Automatización con Screenplay 🎬  

![Java](https://img.shields.io/badge/Java-17-orange?logo=openjdk)  
![Maven](https://img.shields.io/badge/Maven-3.9-blue?logo=apache-maven)  
![SerenityBDD](https://img.shields.io/badge/SerenityBDD-Screenplay-green)  
![JUnit](https://img.shields.io/badge/JUnit-5-red?logo=junit5)  

Este proyecto implementa un framework de automatización de pruebas utilizando **Java 17**, **Maven 3.9** y el **patrón Screenplay** de Serenity BDD.  

---

## 🚀 Tecnologías utilizadas  
- **Java 17**  
- **Maven 3.9**  
- **Serenity BDD con Screenplay**  
- **JUnit / Cucumber** (dependiendo del runner configurado)  

---


---

## ⚙️ Configuración previa  
1. Verificar que tengas instalado:  
   - **Java 17**  
   - **Maven 3.9**  
   - **IDE** de preferencia (IntelliJ IDEA / Eclipse / VS Code con soporte para Java).  

2. Clonar el repositorio:  
```bash
git clone <URL_REPOSITORIO>
cd <NOMBRE_PROYECTO>
```

3. Compilar el proyecto y descargar dependencias:  
```bash
mvn clean install
```

---

## ▶️ Ejecución de pruebas  
Cada caso de prueba está asociado a un **runner** que corresponde a una funcionalidad.  

### Desde el IDE (IntelliJ o Eclipse):  
1. Abrir la clase del runner (ubicada en `com.co.proyecto.runners`).  
2. Dar clic derecho sobre la clase.  
3. Seleccionar **Run 'NombreDelRunner'**.  

---

## 📊 Reportes  
Al finalizar la ejecución se generará un reporte en:  
```bash
target/site/serenity/index.html
```
Abrir en un navegador para visualizar los resultados de la prueba.  

---