package br.com.ds.helium.button

import android.content.res.Configuration
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.progressSemantics
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.ds.helium.core.HeliumTheme
import br.com.ds.helium.core.dimen.HeliumBorderSize
import br.com.ds.helium.core.dimen.HeliumMargin
import br.com.ds.helium.core.dimen.HeliumRadiusSize
import br.com.ds.helium.core.dimen.HeliumStrokeSize
import br.com.ds.helium.core.util.alphaVisibility

@Composable
internal fun HeliumButtonSecondary (
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    isLoading: Boolean = false,
    size: HeliumButtonSize = HeliumButtonSize.Medium,
    icon: ImageVector? = null
) {
    OutlinedButton(
        onClick = onClick,
        enabled = enabled,
        modifier = modifier.height(size.getHeight()),
        shape = RoundedCornerShape(HeliumRadiusSize.medium),
        border = BorderStroke(HeliumBorderSize.small, MaterialTheme.colorScheme.primary)
    ) {
        Box(contentAlignment = Alignment.Center){
                CircularProgressIndicator(
                    modifier = Modifier
                        .align(alignment = Alignment.Center)
                        .alpha(isLoading.alphaVisibility())
                        .progressSemantics()
                        .size(size.getProgressSize()),
                    color= MaterialTheme.colorScheme.primary,
                    strokeWidth = HeliumStrokeSize.medium
                )
            Row {
                if(icon != null) {
                    Icon(
                        imageVector = icon,
                        modifier = Modifier.padding(top = HeliumMargin.xxxxs)
                            .fillMaxHeight()
                            .wrapContentHeight(align = Alignment.CenterVertically).size(size.getIconSize())
                            .alpha((!isLoading).alphaVisibility()),
                        contentDescription = "drawable_icons",
                        tint = MaterialTheme.colorScheme.primary
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                }
                Text(
                    text = text.uppercase(),
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxHeight().wrapContentHeight(align = Alignment.CenterVertically)
                        .alpha((!isLoading).alphaVisibility()),
                    style = size.getTypography(),
                    color= MaterialTheme.colorScheme.primary
                )
                if(icon != null) {
                    Spacer(modifier = Modifier.width(12.dp))
                }
            }
        }
    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun DarkFontPreview() {
    HeliumTheme {
        Surface {
            HeliumButtonSecondary(
                size = HeliumButtonSize.Large,
                enabled = false,
                icon = Icons.Default.Email,
                onClick = { /*TODO*/ },
                text = "Igor Dark")
        }
    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
private fun LightButtonPreview() {
    HeliumTheme {
        Surface {
            HeliumButtonSecondary(
                isLoading = false,
                enabled = false,
                icon = Icons.Default.Email,
                onClick = { /*TODO*/ },
                text = "Igor Light"
            )
        }
    }
}