package com.swordfish.lemuroid.app.shared.game

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FastForward
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.swordfish.lemuroid.R

@Composable
internal fun FastForwardIndicator(
    speed: Int,
    modifier: Modifier = Modifier,
) {
    val description = stringResource(R.string.game_fast_forward_indicator, speed)
    Row(
        modifier =
            modifier
                .safeDrawingPadding()
                .padding(8.dp)
                .background(Color.Black.copy(alpha = 0.45f), RoundedCornerShape(6.dp))
                .padding(horizontal = 6.dp, vertical = 3.dp)
                .semantics(mergeDescendants = true) { contentDescription = description },
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(3.dp),
    ) {
        Icon(
            Icons.Default.FastForward,
            contentDescription = null,
            tint = Color.White.copy(alpha = 0.8f),
            modifier = Modifier.size(14.dp),
        )
        Text(text = "$speed×", color = Color.White.copy(alpha = 0.8f), fontSize = 11.sp)
    }
}
