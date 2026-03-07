package icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Tablar

val Tablar.Outlined.UmbrellaClosed: ImageVector
    get() {
        if (_UmbrellaClosed != null) {
            return _UmbrellaClosed!!
        }
        _UmbrellaClosed = ImageVector.Builder(
            name = "Outlined.UmbrellaClosed",
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
                moveTo(9f, 16f)
                lineToRelative(3f, -13f)
                lineToRelative(3f, 13f)
                lineToRelative(-6f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 16f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 2.667f, 4f, 2.667f, 4f, 0f)
            }
        }.build()

        return _UmbrellaClosed!!
    }

@Suppress("ObjectPropertyName")
private var _UmbrellaClosed: ImageVector? = null
