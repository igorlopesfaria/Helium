object Apps {
    const val compileSdkVersion = 33
    const val minSdkVersion = 24
    const val targetSdkVersion = 32
    const val versionName = "1.0.0"
    const val versionCode = 1

    const val groupId = "br.com.ds.hellium"
    const val applicationId = groupId
    const val scheme = "helium"

}

object Module {
    const val core = ":core"
    const val chip = ":chip"
    const val button = ":button"
    const val radiobutton = ":radiobutton"
    const val infoview = ":infoview"
    const val checkbox = ":checkbox"
    const val statusview = ":statusview"
}

object Versions {

    const val KOTLIN_VERSION = "1.6.21"
    const val ANDROIDX_CORE_VERSION = "1.9.0"
    const val GRADLE_PLUGIN_VERSION = "7.2.2"
    const val ACTIVITY_VERSION = "1.6.1"
    const val COMPOSE_BOOM_VERSION = "2023.01.00"
    const val TEST_JUNIT_VERSION = "4.13.2"

}

object Libs {

    object Gradle {
        fun getToolsGradleVersion() =
            "com.android.tools.build:gradle:${Versions.GRADLE_PLUGIN_VERSION}"
    }

    object Kotlin {
        fun getKotlinGradlePluginVersion() =
            "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.KOTLIN_VERSION}"

        fun getKotlinStdlibVersion() =
            "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.KOTLIN_VERSION}"

        fun getKotlinReflectVersion() =
            "org.jetbrains.kotlin:kotlin-reflect:${Versions.KOTLIN_VERSION}"

    }

    object Core {
        fun coreKtxVersion() = "androidx.core:core-ktx:${Versions.ANDROIDX_CORE_VERSION}"
    }

    object Activity {
        fun getActivityComposeVersion() = "androidx.activity:activity-compose:${Versions.ACTIVITY_VERSION}"
    }

    object Compose {
        fun getComposeBOM() = "androidx.compose:compose-bom:${Versions.COMPOSE_BOOM_VERSION}"
        fun getComposeUIVersion() = "androidx.compose.ui:ui"
        fun getComposeMaterialVersion() = "androidx.compose.material3:material3"
        fun getComposeToolingPreviewVersion() = "androidx.compose.ui:ui-tooling-preview"

        fun getComposeToolingVersion() = "androidx.compose.ui:ui-tooling"
        fun getComposeTestJUnitVersion() = "androidx.compose.ui:ui-test-junit4:1.4.2"
    }

    object Test {
        fun getJunitVersion() = "junit:junit:${Versions.TEST_JUNIT_VERSION}"
    }

}