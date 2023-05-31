package br.com.ds.helium.button

import android.content.res.Configuration
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.ds.helium.core.HeliumTheme
import br.com.ds.helium.core.dimen.HeliumMargin

@Composable
fun ListButton(modifier: Modifier = Modifier) {
    val loadingPrimaryButton = remember { mutableStateOf(false) }
    val loadingSecondaryButton = remember { mutableStateOf(false) }
    val loadingLinkButton = remember { mutableStateOf(false) }

    Column(
        modifier.fillMaxSize(),
    ) {
        Box(modifier = Modifier
            .verticalScroll(rememberScrollState())
            .padding(HeliumMargin.xs)) {
            Column {
                HeliumButton(
                    type = HeliumButtonType.Primary,
                    isLoading = loadingPrimaryButton.value,
                    onClick = { loadingPrimaryButton.value = !loadingPrimaryButton.value},
                    size = HeliumButtonSize.Tiny,
                    text = "Click aqui"
                )
                Spacer(modifier = Modifier.height(10.dp)) 
                HeliumButton(
                    type = HeliumButtonType.Primary,
                    isLoading = loadingPrimaryButton.value,
                    onClick = { loadingPrimaryButton.value = !loadingPrimaryButton.value},
                    size = HeliumButtonSize.Small,
                    text = "Click aqui"
                )
                Spacer(modifier = Modifier.height(10.dp)) 
                HeliumButton(
                    type = HeliumButtonType.Primary,
                    isLoading = loadingPrimaryButton.value,
                    onClick = { loadingPrimaryButton.value = !loadingPrimaryButton.value},
                    text = "Click aqui"
                )
                Spacer(modifier = Modifier.height(10.dp)) 
                HeliumButton(
                    type = HeliumButtonType.Primary,
                    isLoading = loadingPrimaryButton.value,
                    onClick = { loadingPrimaryButton.value = !loadingPrimaryButton.value},
                    size = HeliumButtonSize.Large,
                    text = "Click aqui"
                )
                Spacer(modifier = Modifier.height(10.dp))
                HeliumButton(
                    type = HeliumButtonType.Primary,
                    modifier = modifier.fillMaxWidth(),
                    isLoading = loadingPrimaryButton.value,
                    onClick = { loadingPrimaryButton.value = !loadingPrimaryButton.value},
                    text = "Click aqui"
                )
                Spacer(modifier = Modifier.height(10.dp))
                HeliumButton(
                    type = HeliumButtonType.Primary,
                    modifier = modifier.fillMaxWidth(),
                    enabled = false,
                    isLoading = loadingPrimaryButton.value,
                    onClick = { },
                    text = "Click aqui"
                )
                Spacer(modifier = Modifier.height(10.dp))
                HeliumButton(
                    type = HeliumButtonType.Secondary,
                    isLoading = loadingSecondaryButton.value,
                    enabled = false,
                    size = HeliumButtonSize.Tiny,
                    onClick = { loadingSecondaryButton.value = !loadingSecondaryButton.value },
                    text = "Click aqui"
                )
                Spacer(modifier = Modifier.height(10.dp)) 
                HeliumButton(
                    type = HeliumButtonType.Secondary,
                    isLoading = loadingSecondaryButton.value,
                    size = HeliumButtonSize.Small,
                    onClick = { loadingSecondaryButton.value = !loadingSecondaryButton.value },
                    text = "Click aqui"
                )
                Spacer(modifier = Modifier.height(10.dp)) 
                HeliumButton(
                    type = HeliumButtonType.Secondary,
                    isLoading = loadingSecondaryButton.value,
                    onClick = { loadingSecondaryButton.value = !loadingSecondaryButton.value },
                    text = "Click aqui"
                )
                Spacer(modifier = Modifier.height(10.dp)) 
                HeliumButton(
                    type = HeliumButtonType.Secondary,
                    isLoading = loadingSecondaryButton.value,
                    size = HeliumButtonSize.Large,
                    onClick = { loadingSecondaryButton.value = !loadingSecondaryButton.value },
                    text = "Click aqui"
                )
                HeliumButton(
                    type = HeliumButtonType.Link,
                    isLoading = loadingLinkButton.value,
                    onClick = { loadingLinkButton.value = !loadingLinkButton.value },
                    text = "Click aqui"
                )
                HeliumButton(
                    type = HeliumButtonType.Secondary,
                    modifier = modifier.fillMaxWidth(),
                    isLoading = loadingSecondaryButton.value,
                    onClick = { loadingSecondaryButton.value = !loadingSecondaryButton.value},
                    text = "Click aqui"
                )
                HeliumButton(
                    type = HeliumButtonType.Link,
                    modifier = modifier.fillMaxWidth(),
                    isLoading = loadingLinkButton.value,
                    onClick = { loadingLinkButton.value = !loadingLinkButton.value},
                    text = "Click aqui"
                )


            }
        }
    }

}
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun FontPreview() {
    HeliumTheme {
        Surface {
            ListButton()
        }
    }
}
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun DarkFontPreview() {
    HeliumTheme {
        Surface {
            ListButton()
        }
    }
}
