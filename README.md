# 🎬 Sistema de Gestión de Cine

Sistema de gestión de cine desarrollado en Java que permite administrar películas de estreno y películas normales, calcular ingresos y gestionar el catálogo cinematográfico.

## 📋 Descripción

Este proyecto es una aplicación de escritorio que implementa un sistema de gestión para un cine, permitiendo:

- Agregar películas de estreno
- Agregar películas normales
- Visualizar el catálogo de películas
- Calcular el total de ingresos potenciales
- Interfaz gráfica mediante ventanas de diálogo

## 🏗️ Estructura del Proyecto

```
GestionCine/
├── src/
│   └── gestioncine/
│       ├── GestionCine.java          # Clase principal con menú
│       ├── Cine.java                 # Clase que gestiona las películas
│       ├── Pelicula.java             # Clase abstracta base
│       ├── PeliculaEstreno.java      # Implementación para películas de estreno
│       ├── PeliculaNormal.java       # Implementación para películas normales
│       └── GestionCineInterfaz.java  # Interfaz del sistema
├── build/                            # Archivos compilados
├── dist/                             # JAR ejecutable
│   └── GestionCine.jar
├── build.xml                         # Script de compilación Ant
└── README.md                         # Este archivo
```

## 🎯 Características

### Tipos de Películas

- **Películas de Estreno**: Precio base de $5,000
- **Películas Normales**: Precio base de $3,000

### Funcionalidades

1. **Agregar Película de Estreno**: Permite registrar una nueva película de estreno con título, género y duración
2. **Agregar Película Normal**: Permite registrar una nueva película normal con título, género y duración
3. **Mostrar Películas**: Lista todas las películas registradas con sus precios
4. **Calcular Total de Ingresos**: Calcula la suma total de los ingresos potenciales de todas las películas

## 🛠️ Tecnologías Utilizadas

- **Java**: Lenguaje de programación
- **Java Swing (JOptionPane)**: Interfaz gráfica de usuario
- **Apache Ant**: Herramienta de compilación
- **Programación Orientada a Objetos**: Uso de clases abstractas, interfaces y herencia

## 📦 Requisitos

- Java JDK 8 o superior
- Apache Ant (opcional, para compilación con build.xml)

## 🚀 Instalación y Ejecución

### Opción 1: Ejecutar el JAR precompilado

```bash
cd GestionCine/dist
java -jar GestionCine.jar
```

### Opción 2: Compilar desde el código fuente

#### Con NetBeans
1. Abrir el proyecto en NetBeans IDE
2. Limpiar y compilar el proyecto (Build > Clean and Build)
3. Ejecutar el proyecto (Run > Run Project)

#### Con Apache Ant
```bash
cd GestionCine
ant compile
ant jar
java -jar dist/GestionCine.jar
```

#### Compilación manual
```bash
cd GestionCine/src
javac gestioncine/*.java
java gestioncine.GestionCine
```

## 💻 Uso

1. Al iniciar la aplicación, se mostrará un menú con las siguientes opciones:
   - **Opción 1**: Agregar película de estreno
   - **Opción 2**: Agregar película normal
   - **Opción 3**: Mostrar películas
   - **Opción 4**: Calcular total de ingresos
   - **Opción 5**: Salir

2. Ingrese el número de la opción deseada y siga las instrucciones en las ventanas de diálogo.

3. Cada película requiere:
   - Título
   - Género
   - Duración (en minutos)

## 📐 Arquitectura

El proyecto utiliza principios de programación orientada a objetos:

- **Herencia**: `PeliculaEstreno` y `PeliculaNormal` extienden de la clase abstracta `Pelicula`
- **Polimorfismo**: Diferentes tipos de películas implementan el método `calcularPrecio()`
- **Interfaces**: `Cine` implementa `GestionCineInterfaz`
- **Abstracción**: La clase `Pelicula` define la estructura común pero delega el cálculo de precio a las subclases

## 📝 Clases Principales

### `GestionCine`
Clase principal que contiene el método `main()` y gestiona el menú de usuario mediante ventanas de diálogo.

### `Cine`
Implementa la lógica de gestión del cine, almacena hasta 10 películas y proporciona métodos para agregar películas y calcular ingresos.

### `Pelicula`
Clase abstracta que define los atributos comunes (título, género, duración) y el método abstracto `calcularPrecio()`.

### `PeliculaEstreno` y `PeliculaNormal`
Implementan la clase `Pelicula` con diferentes precios base para el cálculo de ingresos.

## 👤 Autor

**Fabia**

## 📄 Licencia

Este proyecto utiliza la licencia por defecto de NetBeans.

## 🔮 Posibles Mejoras Futuras

- Aumentar la capacidad de almacenamiento de películas (usar ArrayList en lugar de array)
- Persistencia de datos (guardar en archivo o base de datos)
- Gestión de sesiones de proyección
- Sistema de reservas
- Búsqueda y filtrado de películas
- Interfaz gráfica más completa (ventanas en lugar de diálogos)

