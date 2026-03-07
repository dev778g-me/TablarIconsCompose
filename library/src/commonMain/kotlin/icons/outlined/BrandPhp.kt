package icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Tablar

val Tablar.Outlined.BrandPhp: ImageVector
    get() {
        if (_BrandPhp != null) {
            return _BrandPhp!!
        }
        _BrandPhp = ImageVector.Builder(
            name = "Outlined.BrandPhp",
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
                moveTo(2f, 12f)
                arcToRelative(10f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = false, 20f, 0f)
                arcToRelative(10f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = false, -20f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.5f, 15f)
                lineToRelative(0.395f, -1.974f)
                lineToRelative(0.605f, -3.026f)
                horizontalLineToRelative(1.32f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.986f, 1.164f)
                lineToRelative(-0.167f, 1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.986f, 0.836f)
                horizontalLineToRelative(-1.653f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.5f, 15f)
                lineToRelative(0.395f, -1.974f)
                lineToRelative(0.605f, -3.026f)
                horizontalLineToRelative(1.32f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.986f, 1.164f)
                lineToRelative(-0.167f, 1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.986f, 0.836f)
                horizontalLineToRelative(-1.653f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 7.5f)
                lineToRelative(-1f, 5.5f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.6f, 10f)
                horizontalLineToRelative(2.4f)
                lineToRelative(-0.5f, 3f)
            }
        }.build()

        return _BrandPhp!!
    }

@Suppress("ObjectPropertyName")
private var _BrandPhp: ImageVector? = null
