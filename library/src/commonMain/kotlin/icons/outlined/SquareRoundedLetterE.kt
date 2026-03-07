package icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Tablar

val Tablar.Outlined.SquareRoundedLetterE: ImageVector
    get() {
        if (_SquareRoundedLetterE != null) {
            return _SquareRoundedLetterE!!
        }
        _SquareRoundedLetterE = ImageVector.Builder(
            name = "Outlined.SquareRoundedLetterE",
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
                moveTo(14f, 8f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(4f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 12f)
                horizontalLineToRelative(2.5f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 3f)
                curveToRelative(7.2f, 0f, 9f, 1.8f, 9f, 9f)
                curveToRelative(0f, 7.2f, -1.8f, 9f, -9f, 9f)
                curveToRelative(-7.2f, 0f, -9f, -1.8f, -9f, -9f)
                curveToRelative(0f, -7.2f, 1.8f, -9f, 9f, -9f)
            }
        }.build()

        return _SquareRoundedLetterE!!
    }

@Suppress("ObjectPropertyName")
private var _SquareRoundedLetterE: ImageVector? = null
