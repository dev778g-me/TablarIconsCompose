# Tablar Icons for Compose Multiplatform

A **Compose Multiplatform library of Tabler Icons** for Jetpack Compose.

This library provides the **Tabler icon set as ImageVectors**, allowing developers to use Tabler Icons directly inside **Jetpack Compose and Compose Multiplatform UI**.

The API is simple, lightweight, and designed to feel natural for Compose developers.

---

## ✨ Features

* Complete **Tabler Icons support**
* Optimized **ImageVector icons**
* Works with **Jetpack Compose**
* Compatible with **Compose Multiplatform**
* Lightweight and fast
* Clean and easy-to-use API

---

## 📦 Installation

Add the dependency to your `build.gradle.kts`:

```kotlin
implementation("io.github.dev778g-me:tablarIcon-compose:1.0.2")
```

Sync your project after adding the dependency.

---

## 🧩 Icon Styles

Tabler icons in this library are available in two styles.

```kotlin
object Tablar {
    object Filled
    object Outlined
}
```

Each icon can be accessed through these style objects.

---

## 🚀 Usage

Basic usage with the Compose `Icon` component:

```kotlin
Icon(
    tint = primary,
    imageVector = Tablar.Filled.Heart,
    contentDescription = null
)
```

Outlined style:

```kotlin
Icon(
    tint = primary,
    imageVector = Tablar.Outlined.Heart,
    contentDescription = null
)
```

---

## 🎨 Example

```kotlin
Column {

    Icon(
        tint = primary,
        imageVector = Tablar.Filled.Heart,
        contentDescription = null
    )

    Spacer(
        modifier = Modifier.height(12.dp)
    )

    Icon(
        tint = primary,
        imageVector = Tablar.Outlined.Heart,
        contentDescription = null
    )

}
```

---

## 🖥 Supported Platforms

* Android
* Desktop
* JVM
* Compose Multiplatform

---

## 📚 About Tabler Icons

Tabler Icons is a **free and open-source icon set designed for modern interfaces**.

Official website:
https://tabler.io/icons

---

## 📄 License

Tabler Icons are licensed under the **MIT License**.

This Compose wrapper library follows the same license.
