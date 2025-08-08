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

## 🧱 Project Structure
<img width="575" height="843" alt="project_structure" src="https://github.com/user-attachments/assets/6a898561-8b1e-4fb5-9261-cf8516d03435" />

---

## 📋 How to Use This Repository

This repository can be used as a starting point for your Android projects in two ways:

### 1. Use the **“Use this template”** Button (Recommended)

Click the green **“Use this template”** button at the top of this repository page to create a new repository based on this template.  
This method gives you a clean copy without git history and lets you start fresh immediately.

--- OR --- 

### 2. Clone the Repository Directly

Alternatively, you can clone the repository to your local machine:


### 2.1. Clone the Repository Locally
Click the green **“Code”** button at the top of this repository and choose one of the following:

#### 📥 Clone via HTTPS or 🔐 via SSH
Another option is to clone via 💻 CLI using the following command: 

git clone https://github.com/r1n1os/Jetpack-Compose-Template-Open-Source

### 2.2. Remove the Existing Git History
To avoid pushing changes back to the original repository and to start with a clean Git history:

rm -rf .git

### 2.3. Initialize a New Git Repository
Start your own Git history and link it to your new project repository:
<br>git init
<br>git remote add origin https://github.com/your-username/your-new-project.git
<br>git add .
<br>git commit -m "Initial commit from Android Starter Template"
<br>git push -u origin main



