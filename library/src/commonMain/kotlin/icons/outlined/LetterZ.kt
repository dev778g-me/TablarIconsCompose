package icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Tablar

val Tablar.Outlined.LetterZ: ImageVector
    get() {
        if (_LetterZ != null) {
            return _LetterZ!!
        }
        _LetterZ = ImageVector.Builder(
            name = "Outlined.LetterZ",
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
                moveTo(7f, 4f)
                horizontalLineToRelative(10f)
                lineToRelative(-10f, 16f)
                horizontalLineToRelative(10f)
            }
        }.build()

        return _LetterZ!!
    }

@Suppress("ObjectPropertyName")
private var _LetterZ: ImageVector? = null
