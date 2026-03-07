package icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Tablar

val Tablar.Outlined.BrandAzure: ImageVector
    get() {
        if (_BrandAzure != null) {
            return _BrandAzure!!
        }
        _BrandAzure = ImageVector.Builder(
            name = "Outlined.BrandAzure",
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
                moveTo(6f, 7.5f)
                lineToRelative(-4f, 9.5f)
                horizontalLineToRelative(4f)
                lineToRelative(6f, -15f)
                lineToRelative(-6f, 5.5f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 20f)
                lineToRelative(-7f, -15f)
                lineToRelative(-3f, 7f)
                lineToRelative(4f, 5f)
                lineToRelative(-8f, 3f)
                lineToRelative(14f, 0f)
            }
        }.build()

        return _BrandAzure!!
    }

@Suppress("ObjectPropertyName")
private var _BrandAzure: ImageVector? = null
