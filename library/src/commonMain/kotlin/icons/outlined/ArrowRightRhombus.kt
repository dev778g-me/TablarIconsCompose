package icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Tablar

val Tablar.Outlined.ArrowRightRhombus: ImageVector
    get() {
        if (_ArrowRightRhombus != null) {
            return _ArrowRightRhombus!!
        }
        _ArrowRightRhombus = ImageVector.Builder(
            name = "Outlined.ArrowRightRhombus",
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
                moveTo(8f, 12f)
                horizontalLineToRelative(13f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 9f)
                lineToRelative(3f, 3f)
                lineToRelative(-3f, 3f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.5f, 9.5f)
                lineToRelative(-2.5f, 2.5f)
                lineToRelative(2.5f, 2.5f)
                lineToRelative(2.5f, -2.5f)
                lineToRelative(-2.5f, -2.5f)
            }
        }.build()

        return _ArrowRightRhombus!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowRightRhombus: ImageVector? = null
