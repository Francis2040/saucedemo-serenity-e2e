# 🧪 Saucedemo Serenity E2E 🚀

Proyecto de automatización de pruebas **End-to-End (E2E)** para la aplicación [**SauceDemo**](https://www.saucedemo.com/), desarrollado con **Serenity BDD**, **Gradle** y **Selenium WebDriver**.  

Este proyecto simula flujos reales de un usuario dentro del sitio web, validando las funcionalidades principales del proceso de compra y mostrando reportes detallados de ejecución con evidencias visuales.

---

## 🧩 Estructura del proyecto

📁 saucedemo-serenity-e2e
├── 📂 src
│ ├── 📂 main/java/... # Clases base, Pages y Steps
│ ├── 📂 test/java/... # Casos de prueba (features)
├── 📁 target/site/serenity # Reportes generados automáticamente
├── 🧾 build.gradle # Configuración de dependencias
├── ⚙️ gradlew / gradlew.bat # Ejecución de Gradle
├── 🗒️ README.md # Documentación del proyecto
└── 🧾 conclusiones.txt # Observaciones y aprendizajes

---

## ⚙️ Prerrequisitos

Asegúrate de tener instalados los siguientes componentes antes de ejecutar el proyecto:

- ☕ **Java JDK 11 o superior**
- 🧰 **Gradle 7+**
- 🌐 **Google Chrome** y **ChromeDriver** compatibles
- 🐙 **Git** (para clonar el repositorio)

---

## 🚀 Instalación y ejecución

1. **Clona el repositorio**
   ```bash
   git clone https://github.com/Francis2040/saucedemo-serenity-e2e.git
   cd saucedemo-serenity-e2e
2. Ejecuta las pruebas
  ./gradlew clean test
3.  Genera el reporte Serenity
   ./gradlew aggregate
4. Abre el reporte
   start target/site/serenity/index.html

   ### 🧪 Casos de prueba cubiertos
   
| Módulo        | Caso de prueba                          | Descripción                        |
| ------------- | --------------------------------------- | ---------------------------------- |
| **Login**     | Validar inicio de sesión exitoso        | Verifica credenciales válidas      |
| **Login**     | Validar error de credenciales inválidas | Muestra mensaje de error           |
| **Productos** | Agregar productos al carrito            | Añade uno o más ítems              |
| **Carrito**   | Verificar contenido del carrito         | Valida nombre, precio y cantidad   |
| **Checkout**  | Completar proceso de compra             | Simula una compra completa exitosa |

#### 📊 Reportes Serenity
📍 Ubicación:
target/site/serenity/index.html
Los reportes incluyen:

Estado de ejecución (Passed / Failed)

Detalle paso a paso de cada test

Capturas de pantalla automáticas

Resumen de historias y features ejecutadas

##### 🧠 Conclusiones

Durante el desarrollo de este proyecto se logró:

Aprender a estructurar un framework de automatización con Serenity BDD

Implementar flujos E2E reutilizables y legibles

Generar reportes visuales con evidencia automática

Comprender el ciclo completo de pruebas de una aplicación web

###### 🧰 Tecnologías utilizadas
Herramienta	Uso principal
🧱 Serenity BDD	Framework para pruebas automatizadas con reportes detallados
🕸️ Selenium WebDriver	Interacción con el navegador
⚙️ Gradle	Compilación y gestión de dependencias
🧪 JUnit / Cucumber	Definición y ejecución de casos de prueba
💻 Java	Lenguaje principal del proyecto

####### 👩‍💻 Autor

Francis Anahole
QA Automation Engineer

📧 anaholef@gmail.com

🔗 LinkedIn

💻 GitHub
