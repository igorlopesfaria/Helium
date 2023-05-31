package br.com.ds.helium.chip

import android.content.res.Configuration
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.ds.helium.core.HeliumTheme
import br.com.ds.helium.core.dimen.HeliumMargin


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HeliumChip(
    selected: Boolean,
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    iconLeft: ImageVector? = null,
    iconRight: ImageVector? = null,
) {

    Surface (
        color = when {
            selected -> MaterialTheme.colorScheme.primary
            else -> Color.Transparent
        },
        shape = CircleShape,
        border = BorderStroke(
            width = 1.dp,
            color = MaterialTheme.colorScheme.primary,
        ),
        modifier = modifier,
        onClick = onClick
    ) {
        Box(modifier = Modifier.padding(start = 12.dp, end = 12.dp, top = 6.dp,  bottom = 8.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically){
                iconLeft?.let {
                    Icon(
                        imageVector = iconLeft,
                        modifier =Modifier.size(14.dp).padding(top = HeliumMargin.xxxxs),
                        contentDescription = "drawable_icons",
                        tint = when {
                            selected -> MaterialTheme.colorScheme.primaryContainer
                            else -> MaterialTheme.colorScheme.primary
                        }
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                } ?: run {
                   if (iconRight != null)
                       Spacer(modifier = Modifier.width(6.dp))

                }
                Text(
                    text = text,
                    textAlign = TextAlign.Center,
                    style = when {
                        selected -> MaterialTheme.typography.bodyMedium
                        else -> MaterialTheme.typography.bodySmall
                    },
                    color = when {
                        selected -> MaterialTheme.colorScheme.primaryContainer
                        else -> MaterialTheme.colorScheme.primary
                    },
                )

                if(iconRight != null) {
                    Spacer(modifier = Modifier.width(6.dp))
                    Icon(
                        imageVector = iconRight,
                        modifier =Modifier.size(14.dp).padding(top = HeliumMargin.xxxxs),
                        contentDescription = "drawable_icons",
                        tint = when {
                            selected -> MaterialTheme.colorScheme.primaryContainer
                            else -> MaterialTheme.colorScheme.primary
                        }
                    )

                } else if(iconLeft != null) {
                    Spacer(modifier = Modifier.width(4.dp))
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
            HeliumChip(
                selected = true,
                iconLeft =  Icons.Default.Email,
                iconRight = Icons.Default.Close,
                onClick = { /*TODO*/ },
                text = " Chip Dark"
            )
        }
    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
private fun LightButtonPreview() {
    HeliumTheme {
        Surface {
            HeliumChip(
                selected = false,
                iconLeft =  Icons.Default.Favorite,
                iconRight = Icons.Default.KeyboardArrowDown,
                onClick = { /*TODO*/ },
                text = " Chip Light"
            )
        }
    }
}

