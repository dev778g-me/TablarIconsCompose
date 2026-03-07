package icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Tablar

val Tablar.Outlined.BrandGoogleDrive: ImageVector
    get() {
        if (_BrandGoogleDrive != null) {
            return _BrandGoogleDrive!!
        }
        _BrandGoogleDrive = ImageVector.Builder(
            name = "Outlined.BrandGoogleDrive",
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
                moveTo(12f, 10f)
                lineToRelative(-6f, 10f)
                lineToRelative(-3f, -5f)
                lineToRelative(6f, -10f)
                lineToRelative(3f, 5f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 15f)
                horizontalLineToRelative(12f)
                lineToRelative(-3f, 5f)
                horizontalLineToRelative(-12f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 15f)
                lineToRelative(-6f, -10f)
                horizontalLineToRelative(6f)
                lineToRelative(6f, 10f)
                lineToRelative(-6f, 0f)
            }
        }.build()

        return _BrandGoogleDrive!!
    }

@Suppress("ObjectPropertyName")
private var _BrandGoogleDrive: ImageVector? = null
