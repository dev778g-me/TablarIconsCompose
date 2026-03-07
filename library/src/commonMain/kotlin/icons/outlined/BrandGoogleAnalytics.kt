package icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Tablar

val Tablar.Outlined.BrandGoogleAnalytics: ImageVector
    get() {
        if (_BrandGoogleAnalytics != null) {
            return _BrandGoogleAnalytics!!
        }
        _BrandGoogleAnalytics = ImageVector.Builder(
            name = "Outlined.BrandGoogleAnalytics",
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
                moveTo(10f, 10.105f)
                arcToRelative(1.105f, 1.105f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.105f, -1.105f)
                horizontalLineToRelative(1.79f)
                arcToRelative(1.105f, 1.105f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.105f, 1.105f)
                verticalLineToRelative(9.79f)
                arcToRelative(1.105f, 1.105f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.105f, 1.105f)
                horizontalLineToRelative(-1.79f)
                arcToRelative(1.105f, 1.105f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.105f, -1.105f)
                lineToRelative(0f, -9.79f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 4.105f)
                arcToRelative(1.105f, 1.105f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.105f, -1.105f)
                horizontalLineToRelative(1.79f)
                arcToRelative(1.105f, 1.105f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.105f, 1.105f)
                verticalLineToRelative(15.79f)
                arcToRelative(1.105f, 1.105f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.105f, 1.105f)
                horizontalLineToRelative(-1.79f)
                arcToRelative(1.105f, 1.105f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.105f, -1.105f)
                lineToRelative(0f, -15.79f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 19f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, -4f, 0f)
            }
        }.build()

        return _BrandGoogleAnalytics!!
    }

@Suppress("ObjectPropertyName")
private var _BrandGoogleAnalytics: ImageVector? = null
