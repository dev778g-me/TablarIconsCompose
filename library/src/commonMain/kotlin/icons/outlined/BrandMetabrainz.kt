package icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Tablar

val Tablar.Outlined.BrandMetabrainz: ImageVector
    get() {
        if (_BrandMetabrainz != null) {
            return _BrandMetabrainz!!
        }
        _BrandMetabrainz = ImageVector.Builder(
            name = "Outlined.BrandMetabrainz",
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
                moveTo(3f, 7f)
                verticalLineToRelative(10f)
                lineToRelative(7f, 4f)
                verticalLineToRelative(-18f)
                lineToRelative(-7f, 4f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 7f)
                verticalLineToRelative(10f)
                lineToRelative(-7f, 4f)
                verticalLineToRelative(-18f)
                lineToRelative(7f, 4f)
            }
        }.build()

        return _BrandMetabrainz!!
    }

@Suppress("ObjectPropertyName")
private var _BrandMetabrainz: ImageVector? = null
