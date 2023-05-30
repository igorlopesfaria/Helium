package br.com.ds.helium.button

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.progressSemantics
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.text.style.TextDecoration
import br.com.ds.helium.core.dimen.HeliumBorderSize
import br.com.ds.helium.core.dimen.HeliumRadiusSize
import br.com.ds.helium.core.dimen.HeliumStrokeSize
import br.com.ds.helium.core.util.alphaVisibility

@Composable
internal fun HeliumButtonLink (
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
    enabled: Boolean,
    isLoading: Boolean,
    size: HeliumButtonSize,
) {
    OutlinedButton(
        onClick = onClick,
        enabled = enabled,
        modifier = modifier.height(size.getHeight()),
        shape = RoundedCornerShape(HeliumRadiusSize.medium),
        border = BorderStroke(HeliumBorderSize.small, MaterialTheme.colorScheme.primaryContainer)) {
        Box(contentAlignment = Alignment.Center){
            CircularProgressIndicator(
                modifier = Modifier
                    .align(alignment = Alignment.Center)
                    .alpha(isLoading.alphaVisibility())
                    .progressSemantics()
                    .size(size.getProgressSize()),
                color = MaterialTheme.colorScheme.primary,
                strokeWidth = HeliumStrokeSize.medium
            )
            Text(
                text = text.uppercase(),
                textDecoration = TextDecoration.Underline,
                modifier = Modifier.align(alignment = Alignment.Center)
                    .alpha((!isLoading).alphaVisibility()),
                style = size.getTypography(),
                color= MaterialTheme.colorScheme.primary
            )
        }
    }
}