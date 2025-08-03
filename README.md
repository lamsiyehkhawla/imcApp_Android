# IMCApp

IMCApp is a simple Android application that calculates the Body Mass Index (Indice de Masse Corporelle - IMC) based on user input for weight and height. The app displays the calculated IMC and shows a corresponding category image.

## Features

- User inputs weight (kg) and height (cm)
- Calculates IMC on button click
- Displays the IMC result with two decimals
- Shows an image representing the IMC category:
  - Maigre (Underweight)
  - Normal (Normal weight)
  - Surpoids (Overweight)
  - Obésité modérée (Moderate obesity)
  - Obésité sévère (Severe obesity)
- Simple and clean user interface

## Screenshots

<img src="assets/images/img1.png" width="200"/>
<img src="assets/images/img2.png" width="200"/>

## Installation

1. Clone or download this repository.
2. Open the project in **Android Studio**.
3. Build and run the app on an emulator or Android device.
4. Enter your weight and height, then tap **Calculer IMC**.

## Code Overview

- `MainActivity.java`: Contains the logic for input handling, IMC calculation, and updating UI.
- `activity_main.xml`: Defines the user interface layout with EditTexts, Button, TextView, and ImageView.
- Drawable resources: Images for different IMC categories located in `res/drawable`.

## Manifest

The app launcher activity is declared in `AndroidManifest.xml` as:

```xml
<activity
    android:name=".MainActivity"
    android:exported="true">
    <intent-filter>
        <action android:name="android.intent.action.MAIN" />
        <category android:name="android.intent.category.LAUNCHER" />
    </intent-filter>
</activity>


Requirements
Android Studio

Minimum SDK: 21

Compile SDK: 34 (or latest installed)

License
This project is open-source and free to use.

