Overview

This project is an Android application developed as part of the Web and Mobile App Development course at QUT.
It is implemented in Kotlin/Java using Android Studio and follows standard Android architecture with separate folders for activities, resources, and Gradle configuration.

Project Structure
app/
 ├── src/
 │    ├── main/
 │    │    ├── java/com/example/assignment2/    # App source code (Activities, Fragments, etc.)
 │    │    ├── res/                             # UI resources
 │    │    │    ├── layout/                     # XML layout files
 │    │    │    ├── drawable*/                  # Icons and images
 │    │    │    ├── mipmap*/                    # App launcher icons
 │    │    │    ├── values*/                    # Colors, strings, themes
 │    │    │    └── xml/                        # App configuration XMLs
 │    │    └── AndroidManifest.xml              # App manifest
 │    └── test/                                 # Unit tests
 ├── build.gradle.kts                            # App-level Gradle build file
 ├── settings.gradle.kts                         # Project-level Gradle settings
 ├── gradlew / gradlew.bat                       # Gradle wrapper scripts
 ├── gradle.properties                           # Gradle configuration
 └── proguard-rules.pro                          # ProGuard configuration for release builds

Requirements:
Android Studio Giraffe or newer
Gradle 8+
Android SDK 33+
Java 17 or Kotlin 1.8+

How to Run
Clone this repository:
git clone https://github.com/samreenq5/Assignment2.git

Open the project in Android Studio.
Wait for Gradle to sync.
Run the app on an emulator or a physical Android device:
Click Run
Or use the shortcut: Shift + F10

Features:
Modern Android UI built using XML layouts
Organized resources (drawable, mipmap, values, layout)
Kotlin/Java-based logic with clear package structure
Configurable build via Gradle

Author:
Samreen
Web and Mobile App Development, QUT

Samreen Q.
📚 Web and Mobile App Development, QUT
