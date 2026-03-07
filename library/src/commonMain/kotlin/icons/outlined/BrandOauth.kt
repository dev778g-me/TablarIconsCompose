package icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Tablar

val Tablar.Outlined.BrandOauth: ImageVector
    get() {
        if (_BrandOauth != null) {
            return _BrandOauth!!
        }
        _BrandOauth = ImageVector.Builder(
            name = "Outlined.BrandOauth",
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
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = false, 20f, 0f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = false, -20f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.556f, 6f)
                curveToRelative(0.65f, 0f, 1.235f, 0.373f, 1.508f, 0.947f)
                lineToRelative(2.839f, 7.848f)
                arcToRelative(1.646f, 1.646f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.01f, 2.108f)
                arcToRelative(1.673f, 1.673f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.068f, -0.851f)
                lineToRelative(-0.46f, -1.052f)
                horizontalLineToRelative(-2.73f)
                lineToRelative(-0.398f, 0.905f)
                arcToRelative(1.67f, 1.67f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.977f, 1.045f)
                lineToRelative(-0.153f, -0.047f)
                arcToRelative(1.647f, 1.647f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.056f, -1.956f)
                lineToRelative(2.824f, -7.852f)
                arcToRelative(1.664f, 1.664f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.409f, -1.087f)
                lineToRelative(1.272f, -0.008f)
            }
        }.build()

        return _BrandOauth!!
    }

@Suppress("ObjectPropertyName")
private var _BrandOauth: ImageVector? = null
