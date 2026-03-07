package icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Tablar

val Tablar.Outlined.Number7Small: ImageVector
    get() {
        if (_Number7Small != null) {
            return _Number7Small!!
        }
        _Number7Small = ImageVector.Builder(
            name = "Outlined.Number7Small",
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
                moveTo(10f, 8f)
                horizontalLineToRelative(4f)
                lineToRelative(-2f, 8f)
            }
        }.build()

        return _Number7Small!!
    }

@Suppress("ObjectPropertyName")
private var _Number7Small: ImageVector? = null
