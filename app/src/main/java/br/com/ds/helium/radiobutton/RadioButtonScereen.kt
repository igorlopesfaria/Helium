package br.com.ds.helium.radiobutton

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import br.com.ds.helium.core.dimen.HeliumMargin

@Composable
fun RadioButtonScreen(modifier: Modifier = Modifier) {

    Column(
        modifier.fillMaxSize(),
    ) {
        Box(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(HeliumMargin.xs)
        ) {
            Column {
                HeliumRadioButton(
                    text = "Test",
                    isSelected = false,
                    onCheckedChange = {}
                )
                Spacer(modifier = Modifier.height(10.dp))
                HeliumRadioButton(
                    text = "Test",
                    isSelected = true,
                    onCheckedChange = {}
                )
                Spacer(modifier = Modifier.height(10.dp))
                HeliumRadioButton(
                    isSelected = false,
                    onCheckedChange = {}
                )
                Spacer(modifier = Modifier.height(10.dp))
                HeliumRadioButton(
                    isSelected = true,
                    onCheckedChange = {}
                )

            }
        }
    }
}