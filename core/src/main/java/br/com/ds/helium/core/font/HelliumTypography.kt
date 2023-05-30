package br.com.ds.helium.core.font

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import br.com.ds.helium.core.dimen.HeliumFontSize

val HeliumTypography = Typography(
    displaySmall = TextStyle(
        fontFamily = HeliumFontFamily.medium,
        fontSize = HeliumFontSize.lg
    ),
    displayMedium = TextStyle(
        fontFamily = HeliumFontFamily.semiBold,
        fontSize = HeliumFontSize.lg
    ),
    displayLarge = TextStyle(
        fontFamily = HeliumFontFamily.bold,
        fontSize = HeliumFontSize.lg
    ),
    headlineSmall = TextStyle(
        fontFamily = HeliumFontFamily.regular,
        fontSize = HeliumFontSize.xs
    ),
    headlineMedium = TextStyle(
        fontFamily = HeliumFontFamily.medium,
        fontSize = HeliumFontSize.xs
    ),
    headlineLarge = TextStyle(
        fontFamily = HeliumFontFamily.semiBold,
        fontSize = HeliumFontSize.xs
    ),
    titleSmall = TextStyle(
        fontFamily = HeliumFontFamily.regular,
        fontSize = HeliumFontSize.xxs
    ),
    titleMedium = TextStyle(
        fontFamily = HeliumFontFamily.medium,
        fontSize = HeliumFontSize.xxs
    ),
    titleLarge = TextStyle(
        fontFamily = HeliumFontFamily.semiBold,
        fontSize = HeliumFontSize.xxs
    ),
    bodySmall = TextStyle(
        fontFamily = HeliumFontFamily.regular,
        fontSize = HeliumFontSize.xxxs
    ),
    bodyMedium = TextStyle(
        fontFamily = HeliumFontFamily.medium,
        fontSize = HeliumFontSize.xxxs
    ),
    bodyLarge = TextStyle(
        fontFamily = HeliumFontFamily.semiBold,
        fontSize = HeliumFontSize.xxxs
    ),
    labelSmall = TextStyle(
        fontFamily = HeliumFontFamily.light,
        fontSize = HeliumFontSize.us
    ),
    labelMedium = TextStyle(
        fontFamily = HeliumFontFamily.regular,
        fontSize = HeliumFontSize.us
    ),
    labelLarge = TextStyle(
        fontFamily = HeliumFontFamily.medium,
        fontSize = HeliumFontSize.us
    ),


)