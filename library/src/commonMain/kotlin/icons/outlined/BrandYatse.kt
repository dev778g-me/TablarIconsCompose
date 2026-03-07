package icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Tablar

val Tablar.Outlined.BrandYatse: ImageVector
    get() {
        if (_BrandYatse != null) {
            return _BrandYatse!!
        }
        _BrandYatse = ImageVector.Builder(
            name = "Outlined.BrandYatse",
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
                moveTo(7f, 3f)
                lineToRelative(5f, 2.876f)
                verticalLineToRelative(5.088f)
                lineToRelative(4.197f, -2.73f)
                lineToRelative(4.803f, 2.731f)
                lineToRelative(-9.281f, 5.478f)
                lineToRelative(-2.383f, 1.41f)
                lineToRelative(-2.334f, 1.377f)
                lineToRelative(-3f, 1.77f)
                verticalLineToRelative(-5.565f)
                lineToRelative(3f, -1.771f)
                lineToRelative(-0.002f, -10.664f)
            }
        }.build()

        return _BrandYatse!!
    }

@Suppress("ObjectPropertyName")
private var _BrandYatse: ImageVector? = null
