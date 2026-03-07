package icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Tablar

val Tablar.Outlined.Empathize: ImageVector
    get() {
        if (_Empathize != null) {
            return _Empathize!!
        }
        _Empathize = ImageVector.Builder(
            name = "Outlined.Empathize",
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
                moveTo(9.5f, 5.5f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -5f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 21.368f)
                lineToRelative(5.095f, -5.096f)
                arcToRelative(3.088f, 3.088f, 0f, isMoreThanHalf = true, isPositiveArc = false, -4.367f, -4.367f)
                lineToRelative(-0.728f, 0.727f)
                lineToRelative(-0.728f, -0.727f)
                arcToRelative(3.088f, 3.088f, 0f, isMoreThanHalf = true, isPositiveArc = false, -4.367f, 4.367f)
                lineToRelative(5.095f, 5.096f)
            }
        }.build()

        return _Empathize!!
    }

@Suppress("ObjectPropertyName")
private var _Empathize: ImageVector? = null
