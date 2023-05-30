package br.com.ds.helium.font

import android.content.res.Configuration
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.com.ds.helium.core.HeliumTheme
import br.com.ds.helium.core.dimen.HeliumMargin

@Composable
fun ListTypography(name: String, modifier: Modifier = Modifier) {
    Column(
        modifier.fillMaxSize(),
    ) {
        Box(modifier = Modifier
            .verticalScroll(rememberScrollState())
            .padding(HeliumMargin.xs)) {
            Column {

                Text(
                    text = "Hello $name!",
                    style = MaterialTheme.typography.displayLarge,
                )
                Text(
                    text = "Hello $name!",
                    style = MaterialTheme.typography.displayMedium
                )
                Text(
                    text = "Hello $name!",
                    style = MaterialTheme.typography.displaySmall
                )
                Text(
                    text = "Hello $name!",
                    style = MaterialTheme.typography.headlineLarge
                )
                Text(
                    text = "Hello $name!",
                    style = MaterialTheme.typography.headlineMedium
                )
                Text(
                    text = "Hello $name!",
                    style = MaterialTheme.typography.headlineSmall
                )
                Text(
                    text = "Hello $name!",
                    style = MaterialTheme.typography.titleLarge
                )
                Text(
                    text = "Hello $name!",
                    style = MaterialTheme.typography.titleMedium
                )
                Text(
                    text = "Hello $name!",
                    style = MaterialTheme.typography.titleSmall
                )
                Text(
                    text = "Hello $name!",
                    style = MaterialTheme.typography.bodyLarge
                )
                Text(
                    text = "Hello $name!",
                    style = MaterialTheme.typography.bodyMedium
                )
                Text(
                    text = "Hello $name!",
                    style = MaterialTheme.typography.bodySmall
                )
                Text(
                    text = "Hello $name!",
                    style = MaterialTheme.typography.labelLarge
                )
                Text(
                    text = "Hello $name!",
                    style = MaterialTheme.typography.labelMedium
                )
                Text(
                    text = "Hello $name!",
                    style = MaterialTheme.typography.labelSmall,
                    color = MaterialTheme.colorScheme.onSecondary
                )
            }
        }
    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun FontPreview() {
    HeliumTheme {
        ListTypography("Igor")
    }
}
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun DarkFontPreview() {
    HeliumTheme {
        Surface {
            ListTypography("Igor Dark")
        }
    }
}
