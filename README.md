# Jetpack-Compose-Template-Open-Source

Jetpack-Compose-Template-Open-Source is a production-ready Jetpack Compose Android project template following **Google's best practices** and implementing **Clean Architecture** out of the box. It was developed to save time and help developers kick-start new Android projects with the right structure and dependencies already in place. Just clone, rename, and build!

# 🚀 Android Starter Template
## ✅ Features

- Clean Architecture (Domain, Data, and Presentation layers)
- MVVM (Model-View-ViewModel) architecture
- Dependency Injection using **Hilt**
- Coroutines for asynchronous programming
- Retrofit for network calls
- Room for local database
- Material Design components (Including Expressive Material Design. You can remove the dependency if you plan to release the app before they become stable)
- KSP
- TYPE-save Navigation - Compose Navigation
- Jetpack libraries and recommended tools

---

## 📦 Included Dependencies

| Category              | Library                                                                 |
|-----------------------|-------------------------------------------------------------------------|
| Dependency Injection  | [Hilt](https://dagger.dev/hilt/), [Hilt Google Docs](https://developer.android.com/training/dependency-injection/hilt-android)                                       |
| Networking            | [Retrofit](https://square.github.io/retrofit/)  |
| Asynchronous Tasks    | [Kotlin Coroutines](https://kotlinlang.org/docs/coroutines-overview.html) [Coroutines Google Docs](https://developer.android.com/kotlin/coroutines) |
| Database              | [Room](https://developer.android.com/jetpack/androidx/releases/room)    |
| UI                    | [Material Components](https://material.io/components), [Jetpack ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel), [Expressive Material](https://m3.material.io/blog/building-with-m3-expressive), [Navigation Component](https://developer.android.com/guide/navigation) |
| Other                 | [Serialization](https://kotlinlang.org/docs/serialization.html), [Core-KTX](https://developer.android.com/kotlin/ktx#core), [lifecycle Runtime KTX](https://developer.android.com/jetpack/androidx/releases/lifecycle), [KSP](https://kotlinlang.org/docs/ksp-quickstart.html) |

---

## 🛠️ Project Configuration

  * compileSdk: 36
  * targetSdk: 36
  * minSdk: 28
  * buildToolsVersion: 36.0.0
  * ndkVersion: 28.1.13356709
  * gradle: 9.0.0
  * kotlin: 2.2.0

---
## 🧱 Project Structure
<img width="575" height="843" alt="project_structure" src="https://github.com/user-attachments/assets/6a898561-8b1e-4fb5-9261-cf8516d03435" />

---

## 📋 How to Use This Repository

This repository can be used as a starting point for your Android projects in two ways:

---

### ✅ Option 1: Use the “Use this template” Button (Recommended)

If the repository is enabled as a template:

1. Click the green **“Use this template”** button at the top-right of this repository page.
2. Create a new repository with your own name, description, and visibility.
3. Clone your new repository and start building — no extra steps needed!

> This method gives you a clean copy without Git history and is the easiest way to start fresh.

---

### 🛠 Option 2: Clone the Repository Directly

If you prefer to manually clone the repository:

---

#### 🔹 2.1. Clone the Repository Locally

Click the green **“Code”** button on this page and choose one of the following methods:

##### 📥 Clone via HTTPS

```bash
git clone https://github.com/r1n1os/Jetpack-Compose-Template-Open-Source.git
```
##### 🔐 Clone via SSH

```bash
git clone git@github.com:r1n1os/Jetpack-Compose-Template-Open-Source.git
```

##### 
💻 Clone via GitHub CLI

```bash
gh repo clone r1n1os/Jetpack-Compose-Template-Open-Source
```

Then navigate into the project directory:

```bash
cd Jetpack-Compose-Template-Open-Source
```

#### 🔹 2.2. Remove the Existing Git History

To disconnect from the original repository and avoid pushing to it:

##### On Windows (PowerShell):

```bash
Remove-Item -Recurse -Force .git
```

##### On Mac/Linux/Git Bash:

```bash
rm -rf .git
```

#### 🔹 2.3. Initialize a New Git Repository

Now initialize your own Git project and connect it to your own GitHub repository:

```bash
git init
git remote add origin https://github.com/your-username/your-new-project.git
git add .
git commit -m "Initial commit from Android Starter Template"
git push -u origin main
```

#### ✅ You now have your own version of the project, with full control and clean Git history.

## Contribution

 If you have any feedback, found a bug or need something that is missing feel free to create an issue in the following link. https://github.com/r1n1os/Jetpack-Compose-Template-Open-Source/issues















