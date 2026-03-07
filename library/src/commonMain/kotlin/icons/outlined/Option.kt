package icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Tablar

val Tablar.Outlined.Option: ImageVector
    get() {
        if (_Option != null) {
            return _Option!!
        }
        _Option = ImageVector.Builder(
            name = "Outlined.Option",
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
                moveTo(14f, 6f)
                horizontalLineToRelative(5f)
                moveToRelative(0f, 12f)
                horizontalLineToRelative(-5f)
                lineToRelative(-5f, -12f)
                horizontalLineToRelative(-4f)
            }
        }.build()

        return _Option!!
    }

@Suppress("ObjectPropertyName")
private var _Option: ImageVector? = null
