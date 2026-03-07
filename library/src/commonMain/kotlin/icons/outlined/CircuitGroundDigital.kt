package icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Tablar

val Tablar.Outlined.CircuitGroundDigital: ImageVector
    get() {
        if (_CircuitGroundDigital != null) {
            return _CircuitGroundDigital!!
        }
        _CircuitGroundDigital = ImageVector.Builder(
            name = "Outlined.CircuitGroundDigital",
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
                moveTo(12f, 13f)
                verticalLineToRelative(-10f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 21f)
                lineToRelative(-6f, -8f)
                horizontalLineToRelative(12f)
                lineToRelative(-6f, 8f)
            }
        }.build()

        return _CircuitGroundDigital!!
    }

@Suppress("ObjectPropertyName")
private var _CircuitGroundDigital: ImageVector? = null
