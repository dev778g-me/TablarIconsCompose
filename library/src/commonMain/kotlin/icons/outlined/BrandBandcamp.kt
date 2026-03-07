package icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Tablar

val Tablar.Outlined.BrandBandcamp: ImageVector
    get() {
        if (_BrandBandcamp != null) {
            return _BrandBandcamp!!
        }
        _BrandBandcamp = ImageVector.Builder(
            name = "Outlined.BrandBandcamp",
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
                moveTo(8.5f, 6f)
                horizontalLineToRelative(13.5f)
                lineToRelative(-7f, 12f)
                horizontalLineToRelative(-13f)
                lineToRelative(6.5f, -12f)
            }
        }.build()

        return _BrandBandcamp!!
    }

@Suppress("ObjectPropertyName")
private var _BrandBandcamp: ImageVector? = null
