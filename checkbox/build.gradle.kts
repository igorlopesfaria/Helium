plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-parcelize")
    id("kotlin-kapt")
}

android {
    namespace = "br.com.ds.helium.checkbox"
    compileSdk = Apps.compileSdkVersion

    defaultConfig {
        minSdk = Apps.minSdkVersion
        targetSdk = Apps.targetSdkVersion

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.0"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {

    implementation(project(Module.core))

    implementation(Libs.Core.coreKtxVersion())
    implementation(Libs.Activity.getActivityComposeVersion())

    implementation(platform(Libs.Compose.getComposeBOM()))
    implementation(Libs.Compose.getComposeMaterial3Version())
    implementation(Libs.Compose.getComposeToolingPreviewVersion())
    implementation(Libs.Compose.getComposeUIVersion())
    debugImplementation(Libs.Compose.getComposeToolingVersion())

    androidTestImplementation(Libs.Compose.getComposeTestJUnitVersion())
    testImplementation(Libs.Test.getJunitVersion())

}