package br.com.ds.helium.statusview

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
fun StatusViewScreen(modifier: Modifier = Modifier) {

    Column(
        modifier.fillMaxSize(),
    ) {
        Box(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(HeliumMargin.xs)
        ) {
            Column {
                HeliumStatusView(
                    title = "Test",
                    description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
                    type = HeliumStatusViewType.NoInternet,
                    onClick = {},
                    buttonText = "Try again"
                )
                Spacer(modifier = Modifier.height(40.dp))
                HeliumStatusView(
                    title = "Test",
                    description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
                    type = HeliumStatusViewType.GenericError,
                    onClick = {},
                    buttonText = "Try again"
                )
                Spacer(modifier = Modifier.height(40.dp))
                HeliumStatusView(
                    title = "Test",
                    description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
                    type = HeliumStatusViewType.Warning,
                )
                Spacer(modifier = Modifier.height(40.dp))
                HeliumStatusView(
                    title = "Test",
                    description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
                    type = HeliumStatusViewType.Empty,
                )

            }
        }
    }
}