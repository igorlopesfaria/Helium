package br.com.ds.helium.chip

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import br.com.ds.helium.core.dimen.HeliumMargin

@Composable
fun ChipScreen(modifier: Modifier = Modifier) {
    val chipList: List<String> = listOf( "Chip 1", "Chip 2", "Chip 3", "Chip 4", "Chip 5", "Chip 6")
    Column(
        modifier.fillMaxSize(),
    ) {
        Box(modifier = Modifier
            .verticalScroll(rememberScrollState())
            .padding(HeliumMargin.xs)) {
            Column {
                LazyRow {
                    itemsIndexed(chipList) { index, item ->
                        Spacer(modifier = Modifier.width(6.dp))
                        HeliumChip(
                            selected = false,
                            icon = Icons.Default.Favorite,
                            onClick = { /*TODO*/ },
                            hasCloseIcon = true,
                            text = item
                        )
                    }
                }
                LazyRow {
                    itemsIndexed(chipList) { index, item ->
                        Spacer(modifier = Modifier.width(6.dp))
                        HeliumChip(
                            selected = false,
                            icon = Icons.Default.Favorite,
                            onClick = { /*TODO*/ },
                            text = item
                        )
                    }
                }
                LazyRow {
                    itemsIndexed(chipList) { index, item ->
                        Spacer(modifier = Modifier.width(6.dp))
                        HeliumChip(
                            selected = false,
                            onClick = { /*TODO*/ },
                            hasCloseIcon = true,
                            text = item
                        )
                    }
                }

                LazyRow {
                    itemsIndexed(chipList) { index, item ->
                        Spacer(modifier = Modifier.width(6.dp))
                        HeliumChip(
                            selected = false,
                            onClick = { /*TODO*/ },
                            text = item
                        )
                    }
                }

                // selected
                LazyRow {
                    itemsIndexed(chipList) { index, item ->
                        Spacer(modifier = Modifier.width(6.dp))
                        HeliumChip(
                            selected = true,
                            icon = Icons.Default.Favorite,
                            onClick = { /*TODO*/ },
                            hasCloseIcon = true,
                            text = item
                        )
                    }
                }
                LazyRow {
                    itemsIndexed(chipList) { index, item ->
                        Spacer(modifier = Modifier.width(6.dp))
                        HeliumChip(
                            selected = true,
                            icon = Icons.Default.Favorite,
                            onClick = { /*TODO*/ },
                            text = item
                        )
                    }
                }
                LazyRow {
                    itemsIndexed(chipList) { index, item ->
                        Spacer(modifier = Modifier.width(6.dp))
                        HeliumChip(
                            selected = true,
                            onClick = { /*TODO*/ },
                            hasCloseIcon = true,
                            text = item
                        )
                    }
                }

                LazyRow {
                    itemsIndexed(chipList) { index, item ->
                        Spacer(modifier = Modifier.width(6.dp))
                        HeliumChip(
                            selected = true,
                            onClick = { /*TODO*/ },
                            text = item
                        )
                    }
                }


            }
        }
    }
}
