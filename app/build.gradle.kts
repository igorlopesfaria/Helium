plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-parcelize")
    id("kotlin-kapt")
}

android {
    namespace = "br.com.ds.helium"
    compileSdk = Apps.compileSdkVersion

    defaultConfig {
        applicationId = Apps.applicationId
        minSdk = Apps.minSdkVersion
        targetSdk = Apps.targetSdkVersion
        versionCode = Apps.versionCode
        versionName = Apps.versionName
        multiDexEnabled = true // ADD THIS LINE

    }
    buildTypes {
        getByName("debug") {
            isTestCoverageEnabled = true
            isDebuggable = true
            isMinifyEnabled = false
        }
        getByName("release") {
            isDebuggable = false
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.2.0"
    }
    buildFeatures {
        compose = true
    }

    lint {
        checkReleaseBuilds = false
        checkDependencies = true
        checkAllWarnings = true
        warningsAsErrors = true
        abortOnError = false
    }

    testOptions {
        unitTests.isIncludeAndroidResources = true
        unitTests.isReturnDefaultValues = true
    }

}

dependencies {

    implementation(project(Module.chip))
    implementation(project(Module.core))
    implementation(project(Module.checkbox))
    implementation(project(Module.button))
    implementation(project(Module.radiobutton))
    implementation(project(Module.infoview))
    implementation(project(Module.statusview))

    implementation(Libs.Activity.getActivityComposeVersion())

    implementation(platform(Libs.Compose.getComposeBOM()))
    implementation(Libs.Compose.getComposeMaterialVersion())
    implementation(Libs.Compose.getComposeToolingPreviewVersion())
    implementation(Libs.Compose.getComposeUIVersion())
    debugImplementation(Libs.Compose.getComposeToolingVersion())

    androidTestImplementation(Libs.Compose.getComposeTestJUnitVersion())
    testImplementation(Libs.Test.getJunitVersion())

}