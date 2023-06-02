package br.com.ds.helium

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.com.ds.helium.bottomsheet.BottomSheetScreen
import br.com.ds.helium.button.ListButton
import br.com.ds.helium.checkbox.CheckboxScreen
import br.com.ds.helium.chip.ChipScreen
import br.com.ds.helium.core.HeliumTheme
import br.com.ds.helium.infoview.InfoViewScreen
import br.com.ds.helium.radiobutton.RadioButtonScreen
import br.com.ds.helium.statusview.StatusViewScreen
@ExperimentalMaterial3Api
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HeliumTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BottomSheetScreen()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HeliumTheme {
        Surface ( color = MaterialTheme.colorScheme.background) {
            StatusViewScreen()
        }
    }
}