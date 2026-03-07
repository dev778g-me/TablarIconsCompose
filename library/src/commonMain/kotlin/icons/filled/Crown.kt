package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Tablar

val Tablar.Filled.Crown: ImageVector
    get() {
        if (_Crown != null) {
            return _Crown!!
        }
        _Crown = ImageVector.Builder(
            name = "Filled.Crown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 19f)
                horizontalLineToRelative(-14f)
                curveToRelative(-0.5f, 0f, -0.9f, -0.3f, -1f, -0.8f)
                lineToRelative(-2f, -10f)
                curveToRelative(0f, -0.4f, 0.1f, -0.8f, 0.5f, -1.1f)
                curveToRelative(0.4f, -0.2f, 0.8f, -0.2f, 1.1f, 0f)
                lineToRelative(4.1f, 3.3f)
                lineToRelative(3.4f, -5.1f)
                curveToRelative(0.4f, -0.6f, 1.3f, -0.6f, 1.7f, 0f)
                lineToRelative(3.4f, 5.1f)
                lineToRelative(4.1f, -3.3f)
                curveToRelative(0.3f, -0.3f, 0.8f, -0.3f, 1.1f, 0f)
                curveToRelative(0.4f, 0.2f, 0.5f, 0.6f, 0.5f, 1.1f)
                lineToRelative(-2f, 10f)
                curveToRelative(0f, 0.5f, -0.5f, 0.8f, -1f, 0.8f)
                close()
            }
        }.build()

        return _Crown!!
    }

@Suppress("ObjectPropertyName")
private var _Crown: ImageVector? = null
