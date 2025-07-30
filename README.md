# 🐶 MascotasApp

Aplicación Android desarrollada en Java como parte de la asignación **“Mascotas, RecyclerView y Action View”**.

---

## 📱 Características

### 🧩 Parte 1: Lista de Mascotas
- Se muestra una lista de mascotas con:
  - Foto
  - Nombre
  - Cantidad de "raiting" (likes)
- Cada mascota puede ser raiteada tocando el icono de **hueso blanco**, aumentando el contador.
- Se implementa usando **RecyclerView + CardView + Adapter personalizado**.

### ⭐ Parte 2: ActionView de Estrella
- Se agrega un botón de estrella en la `Toolbar`.
- Al presionarlo, se abre una nueva pantalla que muestra las **5 mascotas favoritas**.
- Esta pantalla también usa un **RecyclerView** con datos dummy (hardcodeados).
- Tiene botón de regreso al `MainActivity`.

---

## 🧑‍💻 Tecnologías utilizadas

- Java
- Android Studio
- RecyclerView
- CardView
- Toolbar y ActionView
- Intents entre actividades

---

## 📸 Capturas

| Lista Principal | Botón de Estrella | Pantalla Favoritos |
|------------------|--------------------|-----------------------|
| ![lista](capturas/lista.png) | ![estrella](capturas/estrella.png) | ![favoritos](capturas/favoritos.png) |

---

## 🚀 Cómo correr la app

1. Clona este repositorio:
   ```bash
   git clone https://github.com/tuusuario/MascotasApp.git
