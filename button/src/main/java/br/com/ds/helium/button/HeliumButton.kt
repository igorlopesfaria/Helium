package br.com.ds.helium.button

import android.content.res.Configuration
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.com.ds.helium.core.HeliumTheme

sealed interface HeliumButtonSize {
    object Tiny : HeliumButtonSize
    object Small : HeliumButtonSize
    object Medium : HeliumButtonSize
    object Large : HeliumButtonSize
}

sealed interface HeliumButtonType {
    object Primary : HeliumButtonType
    object Secondary : HeliumButtonType
    object Link : HeliumButtonType
}

@Composable
fun HeliumButton(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    isLoading: Boolean = false,
    type: HeliumButtonType = HeliumButtonType.Primary,
    size: HeliumButtonSize = HeliumButtonSize.Medium,
) {
    when (type) {
        HeliumButtonType.Primary -> {
            HeliumButtonPrimary(onClick, text, modifier, enabled, isLoading, size)
        }
        HeliumButtonType.Secondary -> {
            HeliumButtonSecondary(onClick, text, modifier, enabled, isLoading, size)
        }
        HeliumButtonType.Link -> {
            HeliumButtonLink(onClick, text, modifier, enabled, isLoading, size)
        }
    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun DarkFontPreview() {
    HeliumTheme {
        Surface {
            HeliumButton(
                type = HeliumButtonType.Link,
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
            HeliumButton(
                type = HeliumButtonType.Primary,
                isLoading = true,
                onClick = { /*TODO*/ },
                text = "Igor Light"
            )
        }
    }
}





