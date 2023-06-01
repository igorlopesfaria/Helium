package br.com.ds.helium.statusview

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Warning
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import br.com.ds.helium.core.color.HeliumColor

@Composable
fun HeliumStatusViewType.getIcon() : ImageVector =
    when (this) {
        HeliumStatusViewType.NoInternet -> {
            ImageVector.vectorResource(id = br.com.ds.helium.core.R.drawable.baseline_wifi_off_24)
        }
        HeliumStatusViewType.GenericError -> {
            ImageVector.vectorResource(id = br.com.ds.helium.core.R.drawable.baseline_cancel_24)
        }
        HeliumStatusViewType.Warning -> {
            Icons.Rounded.Warning
        }
        HeliumStatusViewType.Empty -> {
            ImageVector.vectorResource(id = br.com.ds.helium.core.R.drawable.ic_empty_21)
        }

    }
fun HeliumStatusViewType.getIconColor() : Color =
    when (this) {
        HeliumStatusViewType.NoInternet -> {
            HeliumColor.noInternet
        }
        HeliumStatusViewType.GenericError -> {
            HeliumColor.error
        }
        HeliumStatusViewType.Warning -> {
            HeliumColor.warning
        }
        HeliumStatusViewType.Empty -> {
            HeliumColor.empty
        }

    }
