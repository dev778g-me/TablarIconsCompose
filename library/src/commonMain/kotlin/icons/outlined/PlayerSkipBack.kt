package icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Tablar

val Tablar.Outlined.PlayerSkipBack: ImageVector
    get() {
        if (_PlayerSkipBack != null) {
            return _PlayerSkipBack!!
        }
        _PlayerSkipBack = ImageVector.Builder(
            name = "Outlined.PlayerSkipBack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 5f)
                verticalLineToRelative(14f)
                lineToRelative(-12f, -7f)
                lineToRelative(12f, -7f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 5f)
                lineToRelative(0f, 14f)
            }
        }.build()

        return _PlayerSkipBack!!
    }

@Suppress("ObjectPropertyName")
private var _PlayerSkipBack: ImageVector? = null
