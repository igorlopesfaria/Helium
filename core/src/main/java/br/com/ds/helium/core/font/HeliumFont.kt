package br.com.ds.helium.core.font

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import br.com.ds.helium.core.R

object HeliumFontFamily {
    val light = FontFamily (
        Font(R.font.ibmplexsans_light, FontWeight.W300)
    )
    val regular = FontFamily (
        Font(R.font.ibmplexsans_regular, FontWeight.W400)
    )
    val medium = FontFamily (
        Font(R.font.ibmplexsans_medium, FontWeight.W500)
    )

    val semiBold = FontFamily (
        Font(R.font.ibmplexsans_semibold, FontWeight.W600)
    )
    val bold = FontFamily (
        Font(R.font.ibmplexsans_bold, FontWeight.W700)
    )
}



