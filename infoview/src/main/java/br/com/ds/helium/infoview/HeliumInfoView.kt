package br.com.ds.helium.infoview

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.ds.helium.core.HeliumTheme
import br.com.ds.helium.core.dimen.HeliumIconSize
import br.com.ds.helium.core.dimen.HeliumMargin
import br.com.ds.helium.core.dimen.HeliumRadiusSize

sealed interface HeliumInfoViewType {
    object Alert : HeliumInfoViewType
    object Warning : HeliumInfoViewType
    object Info : HeliumInfoViewType
}

@Composable
fun HeliumInfoView(
    title: String,
    description: String,
    modifier: Modifier = Modifier,
    type: HeliumInfoViewType = HeliumInfoViewType.Info,
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(HeliumRadiusSize.medium),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant,
        ),
    ){
        Column(Modifier.padding(start = HeliumMargin.xs, end = HeliumMargin.xs, top = HeliumMargin.xxs, bottom = HeliumMargin.xxs)) {
            Spacer(modifier = Modifier.height(HeliumMargin.xxxxs))
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    imageVector = type.getIcon(),
                    modifier = Modifier
                        .size(HeliumIconSize.large)
                        .padding(top = HeliumMargin.xxxxs),
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.onSecondary
                )
                Text(
                    text = title,
                    style = MaterialTheme.typography.bodyMedium,
                )
            }
            Spacer(modifier = Modifier.height(HeliumMargin.xxs))
            Text(
                text = description,
                style = MaterialTheme.typography.labelMedium,
                color = MaterialTheme.colorScheme.onSecondary
            )
            Spacer(modifier = Modifier.height(HeliumMargin.xxxxs))

        }

    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun DarkFontPreview() {
    HeliumTheme {
        Surface {
            HeliumInfoView(
                type = HeliumInfoViewType.Warning,
                description = " Chip LightChip LightChip LightChip LightChip LightChip LightChip Light",
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
            HeliumInfoView(
                type = HeliumInfoViewType.Alert,
                description = " Chip LightChip LightChip LightChip LightChip LightChip LightChip Light",
                title = " Chip Light"
            )
        }
    }
}
