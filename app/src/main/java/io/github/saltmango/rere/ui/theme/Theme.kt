package io.github.saltmango.rere.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

private val reReColorScheme = darkColorScheme(
    primary            = Gold,
    onPrimary          = OnGold,
    primaryContainer   = GoldTint,
    onPrimaryContainer = Gold,
    secondary          = TextMid,
    onSecondary        = Bg1,
    background         = Bg1,
    onBackground       = TextHi,
    surface            = Surf1,
    onSurface          = TextHi,
    surfaceVariant     = Surf2,
    onSurfaceVariant   = TextMid,
    outline            = Line2,
    error              = Alert,
    onError            = TextHi,
    scrim              = Bg0,
)

@Composable
fun ReReTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = reReColorScheme,
        typography = Typography,
        content = content,
    )
}
