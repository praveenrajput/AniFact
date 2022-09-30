import com.praveen.anifact.Dependencies
import com.praveen.anifact.Versions

plugins {
    id(com.praveen.anifact.Dependencies.BuildPlugins.androidApplication)
    id(com.praveen.anifact.Dependencies.BuildPlugins.kotlinAndroid)
}

android {
    namespace = "com.praveen.anifact"

    compileSdk = Versions.compileSdk

    defaultConfig {
        applicationId = "com.praveen.anifact"

        minSdk = Versions.minSdk
        targetSdk = Versions.tagetSdk
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        named("release") {
            isMinifyEnabled = false
            setProguardFiles(
                listOf(
                    getDefaultProguardFile("proguard-android-optimize.txt"),
                    "proguard-rules.pro"
                )
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.composeCompiler
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
    Dependencies.Android.apply {
        implementation(coreKtx)
        implementation(runtimeKtx)
        implementation(activity)
    }

    Dependencies.Compose.apply {
        implementation(UI)
        implementation(material)
        implementation(uiTooling)
    }

    Dependencies.Test.apply {
        implementation(junit)
        implementation(composeTestManifest)
    }
}
