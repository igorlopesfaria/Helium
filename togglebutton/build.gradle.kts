plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-parcelize")
    id("kotlin-kapt")
    id("maven-publish")
}

android {
    namespace = "br.com.ds.helium.togglebutton"
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
    afterEvaluate {
        publishing {
            publications {
                register<MavenPublication>("release") {
                    groupId = Apps.groupId
                    artifactId = "tooglebutton"
                    version = Apps.versionName

                    afterEvaluate {
                        from(components["release"])
                    }
                }
            }
        }

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