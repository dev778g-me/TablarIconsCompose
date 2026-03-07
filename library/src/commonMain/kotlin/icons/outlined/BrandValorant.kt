package icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Tablar

val Tablar.Outlined.BrandValorant: ImageVector
    get() {
        if (_BrandValorant != null) {
            return _BrandValorant!!
        }
        _BrandValorant = ImageVector.Builder(
            name = "Outlined.BrandValorant",
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
                moveTo(14.5f, 14f)
                horizontalLineToRelative(4.5f)
                lineToRelative(2f, -2f)
                verticalLineToRelative(-6f)
                lineToRelative(-6.5f, 8f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 19f)
                horizontalLineToRelative(5f)
                lineToRelative(-11f, -13f)
                verticalLineToRelative(6f)
                lineToRelative(6f, 7f)
            }
        }.build()

        return _BrandValorant!!
    }

@Suppress("ObjectPropertyName")
private var _BrandValorant: ImageVector? = null
