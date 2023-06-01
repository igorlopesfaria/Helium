package br.com.ds.helium.infoview

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material.icons.outlined.Close
import androidx.compose.material.icons.rounded.CheckCircle
import androidx.compose.material.icons.rounded.Close
import androidx.compose.material.icons.rounded.Delete
import androidx.compose.material.icons.rounded.Done
import androidx.compose.material.icons.rounded.Info
import androidx.compose.material.icons.rounded.Warning
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import br.com.ds.helium.core.R
import br.com.ds.helium.core.color.HeliumColor

@Composable
internal fun HeliumInfoViewType.getIcon(): ImageVector {
    return when (this){
        HeliumInfoViewType.Info -> Icons.Rounded.Info
        HeliumInfoViewType.Warning -> Icons.Rounded.Warning
        HeliumInfoViewType.Alert -> ImageVector.vectorResource(id = R.drawable.baseline_cancel_24)
    }
}

internal fun HeliumInfoViewType.getColor(): Color {
    return when (this){
        HeliumInfoViewType.Info -> HeliumColor.info
        HeliumInfoViewType.Warning -> HeliumColor.warning
        HeliumInfoViewType.Alert -> HeliumColor.error
    }
}

