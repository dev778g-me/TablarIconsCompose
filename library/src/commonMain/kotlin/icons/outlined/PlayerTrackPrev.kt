package icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Tablar

val Tablar.Outlined.PlayerTrackPrev: ImageVector
    get() {
        if (_PlayerTrackPrev != null) {
            return _PlayerTrackPrev!!
        }
        _PlayerTrackPrev = ImageVector.Builder(
            name = "Outlined.PlayerTrackPrev",
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
                moveTo(21f, 5f)
                verticalLineToRelative(14f)
                lineToRelative(-8f, -7f)
                lineToRelative(8f, -7f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 5f)
                verticalLineToRelative(14f)
                lineToRelative(-8f, -7f)
                lineToRelative(8f, -7f)
            }
        }.build()

        return _PlayerTrackPrev!!
    }

@Suppress("ObjectPropertyName")
private var _PlayerTrackPrev: ImageVector? = null
