plugins {
    id("com.android.application") version "8.1.0"
    kotlin("android") version "1.8.0"
}

android {
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.snapapp"  // Ganti sesuai package name kamu
        minSdk = 21
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.8.0")
    implementation("androidx.core:core-ktx:1.8.0")
    implementation("androidx.appcompat:appcompat:1.5.0")
    implementation("com.google.android.material:material:1.6.0")
}
