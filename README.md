# Proyecto Orientado a Objetos: Clase Políticos

Este repositorio contiene la implementación en Java de un sistema orientado a objetos para modelar la entidad **Políticos**, cumpliendo con la definición de atributos, acciones, instanciación de objetos y su organización en una estructura tabular para su despliegue en consola.

---

## 👨‍🎓 Datos del Alumno
* **Alumno:** José Fidel Ponce Cerecero
* **Tema Seleccionado:** Políticos
* **Modalidad:** Individual

---

## 📌 Descripción del Proyecto
El objetivo del programa es representar la entidad `Politico` mediante el paradigma de Programación Orientada a Objetos (POO). El sistema permite:
1. Instanciar objetos con atributos específicos.
2. Ejecutar métodos/acciones asociadas a la entidad.
3. Almacenar los objetos en una clase gestora encargada de organizar la información.
4. Mostrar una tabla formateada en la consola con los atributos de cada uno de los 10 objetos creados.

---

## 🛠️ Estructura del Código

### 1. Clase `Politico`
Representa el molde para los objetos del tema seleccionado.
* **Atributos (6):** `nombre`, `partido`, `cargo`, `edad`, `anosExperiencia`, `enActivo`.
* **Constructor:** Inicializa los 6 atributos al instanciar un objeto.
* **Acciones / Métodos (5):**
  * `presentarPropuesta(String propuesta)`
  * `votarProyecto(String proyecto, boolean aFavor)`
  * `participarEnDebate(String tema)`
  * `retirarDeCargo()`
  * `cumplirAnoDeGestion()`

### 2. Clase `GestorTablaPoliticos`
Recibe la colección de objetos `Politico` como insumos, los almacena internamente y genera la salida en formato de tabla para la consola.

### 3. Clase `Main`
Contiene la ejecución principal (`main`):
* Crea 10 objetos de tipo `Politico`.
* Envía los objetos al gestor de tabla.
* Muestra la tabla de datos final en la consola.

---

## 🚀 Instrucciones de Ejecución

1. Clonar o descargar este repositorio:
   ```bash
   git clone [https://github.com/tu-usuario/proyecto-poo-politicos.git](https://github.com/tu-usuario/proyecto-poo-politicos.git)
