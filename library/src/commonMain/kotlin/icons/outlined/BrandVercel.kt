package icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Tablar

val Tablar.Outlined.BrandVercel: ImageVector
    get() {
        if (_BrandVercel != null) {
            return _BrandVercel!!
        }
        _BrandVercel = ImageVector.Builder(
            name = "Outlined.BrandVercel",
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
                moveTo(3f, 19f)
                horizontalLineToRelative(18f)
                lineToRelative(-9f, -15f)
                lineToRelative(-9f, 15f)
            }
        }.build()

        return _BrandVercel!!
    }

@Suppress("ObjectPropertyName")
private var _BrandVercel: ImageVector? = null
