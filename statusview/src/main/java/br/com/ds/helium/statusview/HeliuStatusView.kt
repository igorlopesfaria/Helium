package br.com.ds.helium.statusview

import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.ds.helium.button.HeliumButton
import br.com.ds.helium.button.HeliumButtonSize
import br.com.ds.helium.button.HeliumButtonType
import br.com.ds.helium.core.HeliumTheme
import br.com.ds.helium.core.dimen.HeliumMargin

sealed interface HeliumStatusViewType {
    object NoInternet : HeliumStatusViewType
    object GenericError : HeliumStatusViewType
    object Warning : HeliumStatusViewType
    object Empty : HeliumStatusViewType
}

@Composable
fun HeliumStatusView(
    modifier: Modifier = Modifier,
    title:String,
    description: String,
    onClick: (() -> Unit)? = null,
    buttonText: String = "",
    type: HeliumStatusViewType = HeliumStatusViewType.GenericError) {

    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Icon(
            imageVector = type.getIcon(),
            modifier = Modifier.size(50.dp),
            contentDescription = null,
            tint = type.getIconColor()//MaterialTheme.colorScheme.onSecondary
        )
        Spacer(modifier = Modifier.height(HeliumMargin.sm))
        Text(
            text = title,
            style = MaterialTheme.typography.headlineLarge,
        )
        Spacer(modifier = Modifier.height(HeliumMargin.xxxxs))
        Text(
            text = description,
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.titleSmall,
            color = MaterialTheme.colorScheme.onSecondary
        )
        onClick?.let {
            Spacer(modifier = Modifier.height(HeliumMargin.sm))
            HeliumButton(type = HeliumButtonType.Secondary, size = HeliumButtonSize.Small, onClick = onClick, text = buttonText)
        }


    }


}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun DarkFontPreview() {
    HeliumTheme {
        Surface {
            HeliumStatusView(
                type = HeliumStatusViewType.NoInternet,
                description = " Chip LightChip LightChip LightChip LightChip LightChip LightChip Light",
                onClick = {},
                buttonText = "Tentar de novo",
                title = " Chip Light"
            )
        }
    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
private fun LightButtonPreview() {
    HeliumTheme {
        Surface {
            HeliumStatusView(
                type = HeliumStatusViewType.GenericError,
                description = " Chip LightChip LightChip LightChip LightChip LightChip LightChip Light",
                onClick = {},
                buttonText = "Tentar de novo",
                title = " Chip Light"
            )
        }
    }
}
