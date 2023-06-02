package br.com.ds.helium.bottomsheet

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import br.com.ds.helium.button.HeliumButton
import br.com.ds.helium.core.dimen.HeliumMargin

@ExperimentalMaterial3Api
@Composable
fun BottomSheetScreen() {
    var showSheet by remember { mutableStateOf(true) }
    Column(
        Modifier.fillMaxSize(),
    ) {
        Box(modifier = Modifier
            .verticalScroll(rememberScrollState())
            .padding(HeliumMargin.xs)) {
            Column {

                if (showSheet) {
                    HeliumBottomSheet {
                        showSheet = false
                    }
                }

                HeliumButton(onClick = {showSheet = true }, text = "Show BottomSheet")
            }
        }
    }
}
