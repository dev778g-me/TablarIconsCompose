package icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Tablar

val Tablar.Outlined.ChevronsDownRight: ImageVector
    get() {
        if (_ChevronsDownRight != null) {
            return _ChevronsDownRight!!
        }
        _ChevronsDownRight = ImageVector.Builder(
            name = "Outlined.ChevronsDownRight",
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
                moveTo(13f, 5f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-8f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 9f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-8f)
            }
        }.build()

        return _ChevronsDownRight!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronsDownRight: ImageVector? = null
