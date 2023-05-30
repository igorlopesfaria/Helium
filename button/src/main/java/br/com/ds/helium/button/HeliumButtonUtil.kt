package br.com.ds.helium.button

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import br.com.ds.helium.core.dimen.HeliumCircularProgressSize

internal fun HeliumButtonSize.getHeight(): Dp {
    return when (this){
        HeliumButtonSize.Small -> 40.dp
        HeliumButtonSize.Large -> 54.dp
        HeliumButtonSize.Medium -> 46.dp
        HeliumButtonSize.Tiny -> 32.dp
    }
}

internal fun HeliumButtonSize.getIconSize(): Dp {
    return when (this){
        HeliumButtonSize.Small -> 16.dp
        HeliumButtonSize.Large -> 20.dp
        HeliumButtonSize.Medium -> 18.dp
        HeliumButtonSize.Tiny -> 14.dp
    }
}


internal fun HeliumButtonSize.getProgressSize(): Dp {
    return when (this){
        HeliumButtonSize.Small -> HeliumCircularProgressSize.small
        HeliumButtonSize.Large -> HeliumCircularProgressSize.large
        HeliumButtonSize.Medium -> HeliumCircularProgressSize.medium
        HeliumButtonSize.Tiny -> HeliumCircularProgressSize.tinny
    }
}

@Composable
internal fun HeliumButtonSize.getTypography(): TextStyle {
    return when (this){
        HeliumButtonSize.Small ->MaterialTheme.typography.bodySmall
        HeliumButtonSize.Large -> MaterialTheme.typography.headlineSmall
        HeliumButtonSize.Medium -> MaterialTheme.typography.titleSmall
        HeliumButtonSize.Tiny -> MaterialTheme.typography.labelSmall
    }
}