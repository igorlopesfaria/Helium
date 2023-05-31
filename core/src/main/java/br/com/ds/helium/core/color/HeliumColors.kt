package br.com.ds.helium.core.color

import android.provider.CalendarContract.Colors
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
object HeliumColor {
    val neutralLight1 = Color(0xFFF0F0F0)
    val neutralLight2 = Color(0xFFCCCCCC)
    val neutralLight3 = Color(0xFFB8B8B8)
    val neutralLight = Color(0xFFFFFFFF)

    val neutralDark1 = Color(0xFF666666)
    val neutralDark2 = Color(0xFF3D3D3D)
    val neutralDark3 = Color(0xFF1F1F1F)
    val neutralDark = Color(0xFF121212)

    val accent = Color(0xFF0880AE)
    val warning = Color(0xFF14A38B)
    val success = Color(0xFF14A38B)
    val error = Color(0xFFFF7171)


    val shade = Color(0xFFDBE2EA)

    val blueLight = Color(0xFF0880AE)
    val blueLight1 = Color(0xFF7C9CBF)
    val pinkLight = Color(0xFFEFB8C8)

    val greenLight = Color(0xFF14A38B)
    val purpleDark1 = Color(0xFF625b71)
    val pinkDark = Color(0xFF7D5260)

    val DarkColorPalette = darkColorScheme(
        primary = blueLight,
        onPrimary = neutralLight,
        secondary = greenLight,
        onSecondary = neutralLight3,
        onBackground = neutralLight,
        onSurface = neutralLight,
        background = neutralDark,
        surface = neutralDark,
        error = error,
        primaryContainer = neutralDark,
        secondaryContainer = neutralDark2
    )

    val LightColorPalette = lightColorScheme(
        primary = blueLight,
        secondary = greenLight,
        onSecondary = neutralDark1,
        onPrimary = neutralDark,
        onBackground = neutralDark,
        onSurface = neutralDark,
        background = neutralLight,
        surface = neutralLight,
        error = error,
        primaryContainer = neutralLight,
        secondaryContainer = neutralLight2
    )


}
