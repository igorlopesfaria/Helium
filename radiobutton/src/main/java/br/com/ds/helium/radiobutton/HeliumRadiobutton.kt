package br.com.ds.helium.radiobutton

import android.content.res.Configuration
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconToggleButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.ds.helium.core.HeliumTheme
import br.com.ds.helium.core.dimen.HeliumMargin

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HeliumRadioButton(
    onCheckedChange: () -> Unit,
    isSelected: Boolean = false,
    modifier: Modifier = Modifier,
    text: String = ""
){
    Row {

        IconToggleButton(
            checked = isSelected,
            onCheckedChange = { onCheckedChange },
            modifier = Modifier.size(24.dp)
        ) {
            Box(
                modifier = Modifier
                    .clip(CircleShape)
                    .border(2.dp,  when {
                        isSelected-> MaterialTheme.colorScheme.primary
                        else ->MaterialTheme.colorScheme.onSecondary
                    }, CircleShape)
                    .size(20.dp),
                contentAlignment = Alignment.Center

            ) {
                if(isSelected)
                    Box(
                        modifier = Modifier
                            .clip(CircleShape)
                            .size(12.dp)
                            .background(color = MaterialTheme.colorScheme.primary)

                    )
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
            HeliumRadioButton(
                text = "Test",
                isSelected = false,
                onCheckedChange = {}
            )
        }
    }
}
