package icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Tablar

val Tablar.Outlined.GiftCard: ImageVector
    get() {
        if (_GiftCard != null) {
            return _GiftCard!!
        }
        _GiftCard = ImageVector.Builder(
            name = "Outlined.GiftCard",
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
                moveTo(3f, 8f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                horizontalLineToRelative(12f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                verticalLineToRelative(8f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                horizontalLineToRelative(-12f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                lineToRelative(0f, -8f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 16f)
                lineToRelative(3f, -3f)
                lineToRelative(3f, 3f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 13f)
                curveToRelative(-0.789f, 0f, -2f, -0.672f, -2f, -1.5f)
                reflectiveCurveToRelative(0.711f, -1.5f, 1.5f, -1.5f)
                curveToRelative(1.128f, -0.02f, 2.077f, 1.17f, 2.5f, 3f)
                curveToRelative(0.423f, -1.83f, 1.372f, -3.02f, 2.5f, -3f)
                curveToRelative(0.789f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-1.211f, 1.5f, -2f, 1.5f)
                horizontalLineToRelative(-4f)
            }
        }.build()

        return _GiftCard!!
    }

@Suppress("ObjectPropertyName")
private var _GiftCard: ImageVector? = null
