package br.com.ds.helium.checkbox


import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.ds.helium.core.HeliumTheme
import br.com.ds.helium.core.dimen.HeliumMargin
import br.com.ds.helium.core.dimen.HeliumRadiusSize
import br.com.ds.helium.core.dimen.HeliumStrokeSize

@Composable
fun HeliumCheckbox(
    onCheckedChange: () -> Unit,
    isSelected: Boolean = false,
    modifier: Modifier = Modifier,
    text: String = ""
){
    Row(verticalAlignment = Alignment.CenterVertically) {

        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(HeliumRadiusSize.small))
                .border(HeliumStrokeSize.medium,  when {
                    isSelected-> MaterialTheme.colorScheme.primary
                    else ->MaterialTheme.colorScheme.onSecondary
                }, RoundedCornerShape(HeliumRadiusSize.small))
                .size(20.dp),
            contentAlignment = Alignment.Center

        ) {
            if(isSelected) {
                Box(
                    modifier = Modifier.clip(RoundedCornerShape(HeliumRadiusSize.small))
                        .size(20.dp)
                        .background(color = MaterialTheme.colorScheme.primary)

                ) {
                    Icon(
                        imageVector = Icons.Default.Check,
                        contentDescription = null,
                        tint = MaterialTheme.colorScheme.primaryContainer
                    )
                }
            }
        }
        if(text.isNotBlank()){
            Spacer(Modifier.width(HeliumMargin.xxxs))
            Text(
                text = text,
                style = MaterialTheme.typography.titleSmall,
                modifier = Modifier.fillMaxWidth()
            )

        }
    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
private fun LightButtonPreview() {
    HeliumTheme {
        Surface {
            HeliumCheckbox(
                text = "Test",
                isSelected = true,
                onCheckedChange = {}
            )
        }
    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun DarkButtonPreview() {
    HeliumTheme {
        Surface {
            HeliumCheckbox(
                text = "Test",
                isSelected = false,
                onCheckedChange = {}
            )
        }
    }
}
