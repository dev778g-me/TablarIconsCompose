package icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Tablar

val Tablar.Outlined.BrandAdobeIndesign: ImageVector
    get() {
        if (_BrandAdobeIndesign != null) {
            return _BrandAdobeIndesign!!
        }
        _BrandAdobeIndesign = ImageVector.Builder(
            name = "Outlined.BrandAdobeIndesign",
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
                moveTo(3f, 12f)
                curveToRelative(0f, -4.243f, 0f, -6.364f, 1.318f, -7.682f)
                reflectiveCurveToRelative(3.44f, -1.318f, 7.682f, -1.318f)
                reflectiveCurveToRelative(6.364f, 0f, 7.682f, 1.318f)
                reflectiveCurveToRelative(1.318f, 3.44f, 1.318f, 7.682f)
                reflectiveCurveToRelative(0f, 6.364f, -1.318f, 7.682f)
                reflectiveCurveToRelative(-3.44f, 1.318f, -7.682f, 1.318f)
                reflectiveCurveToRelative(-6.364f, 0f, -7.682f, -1.318f)
                reflectiveCurveToRelative(-1.318f, -3.44f, -1.318f, -7.682f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 11f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.1f, -0.657f, 0.997f, -1.6f, 0.997f)
                arcToRelative(2.35f, 2.35f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.697f, -0.731f)
                arcToRelative(2.55f, 2.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.703f, -1.767f)
                curveToRelative(0f, -0.663f, 0.253f, -1.299f, 0.703f, -1.767f)
                arcToRelative(2.35f, 2.35f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.697f, -0.732f)
                horizontalLineToRelative(1.6f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 11f)
                verticalLineToRelative(-3f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 8f)
                verticalLineToRelative(8f)
            }
        }.build()

        return _BrandAdobeIndesign!!
    }

@Suppress("ObjectPropertyName")
private var _BrandAdobeIndesign: ImageVector? = null
