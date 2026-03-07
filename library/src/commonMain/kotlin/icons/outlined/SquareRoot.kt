package icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Tablar

val Tablar.Outlined.SquareRoot: ImageVector
    get() {
        if (_SquareRoot != null) {
            return _SquareRoot!!
        }
        _SquareRoot = ImageVector.Builder(
            name = "Outlined.SquareRoot",
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
                moveTo(3f, 12f)
                horizontalLineToRelative(2f)
                lineToRelative(4f, 8f)
                lineToRelative(4f, -16f)
                horizontalLineToRelative(8f)
            }
        }.build()

        return _SquareRoot!!
    }

@Suppress("ObjectPropertyName")
private var _SquareRoot: ImageVector? = null
