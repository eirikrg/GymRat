package com.example.compose

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import com.eirikrg.gymrat.ui.theme.AppTypography
import com.eirikrg.gymrat.ui.theme.backgroundDark
import com.eirikrg.gymrat.ui.theme.backgroundDarkHighContrast
import com.eirikrg.gymrat.ui.theme.backgroundDarkMediumContrast
import com.eirikrg.gymrat.ui.theme.backgroundLight
import com.eirikrg.gymrat.ui.theme.backgroundLightHighContrast
import com.eirikrg.gymrat.ui.theme.backgroundLightMediumContrast
import com.eirikrg.gymrat.ui.theme.errorContainerDark
import com.eirikrg.gymrat.ui.theme.errorContainerDarkHighContrast
import com.eirikrg.gymrat.ui.theme.errorContainerDarkMediumContrast
import com.eirikrg.gymrat.ui.theme.errorContainerLight
import com.eirikrg.gymrat.ui.theme.errorContainerLightHighContrast
import com.eirikrg.gymrat.ui.theme.errorContainerLightMediumContrast
import com.eirikrg.gymrat.ui.theme.errorDark
import com.eirikrg.gymrat.ui.theme.errorDarkHighContrast
import com.eirikrg.gymrat.ui.theme.errorDarkMediumContrast
import com.eirikrg.gymrat.ui.theme.errorLight
import com.eirikrg.gymrat.ui.theme.errorLightHighContrast
import com.eirikrg.gymrat.ui.theme.errorLightMediumContrast
import com.eirikrg.gymrat.ui.theme.inverseOnSurfaceDark
import com.eirikrg.gymrat.ui.theme.inverseOnSurfaceDarkHighContrast
import com.eirikrg.gymrat.ui.theme.inverseOnSurfaceDarkMediumContrast
import com.eirikrg.gymrat.ui.theme.inverseOnSurfaceLight
import com.eirikrg.gymrat.ui.theme.inverseOnSurfaceLightHighContrast
import com.eirikrg.gymrat.ui.theme.inverseOnSurfaceLightMediumContrast
import com.eirikrg.gymrat.ui.theme.inversePrimaryDark
import com.eirikrg.gymrat.ui.theme.inversePrimaryDarkHighContrast
import com.eirikrg.gymrat.ui.theme.inversePrimaryDarkMediumContrast
import com.eirikrg.gymrat.ui.theme.inversePrimaryLight
import com.eirikrg.gymrat.ui.theme.inversePrimaryLightHighContrast
import com.eirikrg.gymrat.ui.theme.inversePrimaryLightMediumContrast
import com.eirikrg.gymrat.ui.theme.inverseSurfaceDark
import com.eirikrg.gymrat.ui.theme.inverseSurfaceDarkHighContrast
import com.eirikrg.gymrat.ui.theme.inverseSurfaceDarkMediumContrast
import com.eirikrg.gymrat.ui.theme.inverseSurfaceLight
import com.eirikrg.gymrat.ui.theme.inverseSurfaceLightHighContrast
import com.eirikrg.gymrat.ui.theme.inverseSurfaceLightMediumContrast
import com.eirikrg.gymrat.ui.theme.onBackgroundDark
import com.eirikrg.gymrat.ui.theme.onBackgroundDarkHighContrast
import com.eirikrg.gymrat.ui.theme.onBackgroundDarkMediumContrast
import com.eirikrg.gymrat.ui.theme.onBackgroundLight
import com.eirikrg.gymrat.ui.theme.onBackgroundLightHighContrast
import com.eirikrg.gymrat.ui.theme.onBackgroundLightMediumContrast
import com.eirikrg.gymrat.ui.theme.onErrorContainerDark
import com.eirikrg.gymrat.ui.theme.onErrorContainerDarkHighContrast
import com.eirikrg.gymrat.ui.theme.onErrorContainerDarkMediumContrast
import com.eirikrg.gymrat.ui.theme.onErrorContainerLight
import com.eirikrg.gymrat.ui.theme.onErrorContainerLightHighContrast
import com.eirikrg.gymrat.ui.theme.onErrorContainerLightMediumContrast
import com.eirikrg.gymrat.ui.theme.onErrorDark
import com.eirikrg.gymrat.ui.theme.onErrorDarkHighContrast
import com.eirikrg.gymrat.ui.theme.onErrorDarkMediumContrast
import com.eirikrg.gymrat.ui.theme.onErrorLight
import com.eirikrg.gymrat.ui.theme.onErrorLightHighContrast
import com.eirikrg.gymrat.ui.theme.onErrorLightMediumContrast
import com.eirikrg.gymrat.ui.theme.onPrimaryContainerDark
import com.eirikrg.gymrat.ui.theme.onPrimaryContainerDarkHighContrast
import com.eirikrg.gymrat.ui.theme.onPrimaryContainerDarkMediumContrast
import com.eirikrg.gymrat.ui.theme.onPrimaryContainerLight
import com.eirikrg.gymrat.ui.theme.onPrimaryContainerLightHighContrast
import com.eirikrg.gymrat.ui.theme.onPrimaryContainerLightMediumContrast
import com.eirikrg.gymrat.ui.theme.onPrimaryDark
import com.eirikrg.gymrat.ui.theme.onPrimaryDarkHighContrast
import com.eirikrg.gymrat.ui.theme.onPrimaryDarkMediumContrast
import com.eirikrg.gymrat.ui.theme.onPrimaryLight
import com.eirikrg.gymrat.ui.theme.onPrimaryLightHighContrast
import com.eirikrg.gymrat.ui.theme.onPrimaryLightMediumContrast
import com.eirikrg.gymrat.ui.theme.onSecondaryContainerDark
import com.eirikrg.gymrat.ui.theme.onSecondaryContainerDarkHighContrast
import com.eirikrg.gymrat.ui.theme.onSecondaryContainerDarkMediumContrast
import com.eirikrg.gymrat.ui.theme.onSecondaryContainerLight
import com.eirikrg.gymrat.ui.theme.onSecondaryContainerLightHighContrast
import com.eirikrg.gymrat.ui.theme.onSecondaryContainerLightMediumContrast
import com.eirikrg.gymrat.ui.theme.onSecondaryDark
import com.eirikrg.gymrat.ui.theme.onSecondaryDarkHighContrast
import com.eirikrg.gymrat.ui.theme.onSecondaryDarkMediumContrast
import com.eirikrg.gymrat.ui.theme.onSecondaryLight
import com.eirikrg.gymrat.ui.theme.onSecondaryLightHighContrast
import com.eirikrg.gymrat.ui.theme.onSecondaryLightMediumContrast
import com.eirikrg.gymrat.ui.theme.onSurfaceDark
import com.eirikrg.gymrat.ui.theme.onSurfaceDarkHighContrast
import com.eirikrg.gymrat.ui.theme.onSurfaceDarkMediumContrast
import com.eirikrg.gymrat.ui.theme.onSurfaceLight
import com.eirikrg.gymrat.ui.theme.onSurfaceLightHighContrast
import com.eirikrg.gymrat.ui.theme.onSurfaceLightMediumContrast
import com.eirikrg.gymrat.ui.theme.onSurfaceVariantDark
import com.eirikrg.gymrat.ui.theme.onSurfaceVariantDarkHighContrast
import com.eirikrg.gymrat.ui.theme.onSurfaceVariantDarkMediumContrast
import com.eirikrg.gymrat.ui.theme.onSurfaceVariantLight
import com.eirikrg.gymrat.ui.theme.onSurfaceVariantLightHighContrast
import com.eirikrg.gymrat.ui.theme.onSurfaceVariantLightMediumContrast
import com.eirikrg.gymrat.ui.theme.onTertiaryContainerDark
import com.eirikrg.gymrat.ui.theme.onTertiaryContainerDarkHighContrast
import com.eirikrg.gymrat.ui.theme.onTertiaryContainerDarkMediumContrast
import com.eirikrg.gymrat.ui.theme.onTertiaryContainerLight
import com.eirikrg.gymrat.ui.theme.onTertiaryContainerLightHighContrast
import com.eirikrg.gymrat.ui.theme.onTertiaryContainerLightMediumContrast
import com.eirikrg.gymrat.ui.theme.onTertiaryDark
import com.eirikrg.gymrat.ui.theme.onTertiaryDarkHighContrast
import com.eirikrg.gymrat.ui.theme.onTertiaryDarkMediumContrast
import com.eirikrg.gymrat.ui.theme.onTertiaryLight
import com.eirikrg.gymrat.ui.theme.onTertiaryLightHighContrast
import com.eirikrg.gymrat.ui.theme.onTertiaryLightMediumContrast
import com.eirikrg.gymrat.ui.theme.outlineDark
import com.eirikrg.gymrat.ui.theme.outlineDarkHighContrast
import com.eirikrg.gymrat.ui.theme.outlineDarkMediumContrast
import com.eirikrg.gymrat.ui.theme.outlineLight
import com.eirikrg.gymrat.ui.theme.outlineLightHighContrast
import com.eirikrg.gymrat.ui.theme.outlineLightMediumContrast
import com.eirikrg.gymrat.ui.theme.outlineVariantDark
import com.eirikrg.gymrat.ui.theme.outlineVariantDarkHighContrast
import com.eirikrg.gymrat.ui.theme.outlineVariantDarkMediumContrast
import com.eirikrg.gymrat.ui.theme.outlineVariantLight
import com.eirikrg.gymrat.ui.theme.outlineVariantLightHighContrast
import com.eirikrg.gymrat.ui.theme.outlineVariantLightMediumContrast
import com.eirikrg.gymrat.ui.theme.primaryContainerDark
import com.eirikrg.gymrat.ui.theme.primaryContainerDarkHighContrast
import com.eirikrg.gymrat.ui.theme.primaryContainerDarkMediumContrast
import com.eirikrg.gymrat.ui.theme.primaryContainerLight
import com.eirikrg.gymrat.ui.theme.primaryContainerLightHighContrast
import com.eirikrg.gymrat.ui.theme.primaryContainerLightMediumContrast
import com.eirikrg.gymrat.ui.theme.primaryDark
import com.eirikrg.gymrat.ui.theme.primaryDarkHighContrast
import com.eirikrg.gymrat.ui.theme.primaryDarkMediumContrast
import com.eirikrg.gymrat.ui.theme.primaryLight
import com.eirikrg.gymrat.ui.theme.primaryLightHighContrast
import com.eirikrg.gymrat.ui.theme.primaryLightMediumContrast
import com.eirikrg.gymrat.ui.theme.scrimDark
import com.eirikrg.gymrat.ui.theme.scrimDarkHighContrast
import com.eirikrg.gymrat.ui.theme.scrimDarkMediumContrast
import com.eirikrg.gymrat.ui.theme.scrimLight
import com.eirikrg.gymrat.ui.theme.scrimLightHighContrast
import com.eirikrg.gymrat.ui.theme.scrimLightMediumContrast
import com.eirikrg.gymrat.ui.theme.secondaryContainerDark
import com.eirikrg.gymrat.ui.theme.secondaryContainerDarkHighContrast
import com.eirikrg.gymrat.ui.theme.secondaryContainerDarkMediumContrast
import com.eirikrg.gymrat.ui.theme.secondaryContainerLight
import com.eirikrg.gymrat.ui.theme.secondaryContainerLightHighContrast
import com.eirikrg.gymrat.ui.theme.secondaryContainerLightMediumContrast
import com.eirikrg.gymrat.ui.theme.secondaryDark
import com.eirikrg.gymrat.ui.theme.secondaryDarkHighContrast
import com.eirikrg.gymrat.ui.theme.secondaryDarkMediumContrast
import com.eirikrg.gymrat.ui.theme.secondaryLight
import com.eirikrg.gymrat.ui.theme.secondaryLightHighContrast
import com.eirikrg.gymrat.ui.theme.secondaryLightMediumContrast
import com.eirikrg.gymrat.ui.theme.surfaceBrightDark
import com.eirikrg.gymrat.ui.theme.surfaceBrightDarkHighContrast
import com.eirikrg.gymrat.ui.theme.surfaceBrightDarkMediumContrast
import com.eirikrg.gymrat.ui.theme.surfaceBrightLight
import com.eirikrg.gymrat.ui.theme.surfaceBrightLightHighContrast
import com.eirikrg.gymrat.ui.theme.surfaceBrightLightMediumContrast
import com.eirikrg.gymrat.ui.theme.surfaceContainerDark
import com.eirikrg.gymrat.ui.theme.surfaceContainerDarkHighContrast
import com.eirikrg.gymrat.ui.theme.surfaceContainerDarkMediumContrast
import com.eirikrg.gymrat.ui.theme.surfaceContainerHighDark
import com.eirikrg.gymrat.ui.theme.surfaceContainerHighDarkHighContrast
import com.eirikrg.gymrat.ui.theme.surfaceContainerHighDarkMediumContrast
import com.eirikrg.gymrat.ui.theme.surfaceContainerHighLight
import com.eirikrg.gymrat.ui.theme.surfaceContainerHighLightHighContrast
import com.eirikrg.gymrat.ui.theme.surfaceContainerHighLightMediumContrast
import com.eirikrg.gymrat.ui.theme.surfaceContainerHighestDark
import com.eirikrg.gymrat.ui.theme.surfaceContainerHighestDarkHighContrast
import com.eirikrg.gymrat.ui.theme.surfaceContainerHighestDarkMediumContrast
import com.eirikrg.gymrat.ui.theme.surfaceContainerHighestLight
import com.eirikrg.gymrat.ui.theme.surfaceContainerHighestLightHighContrast
import com.eirikrg.gymrat.ui.theme.surfaceContainerHighestLightMediumContrast
import com.eirikrg.gymrat.ui.theme.surfaceContainerLight
import com.eirikrg.gymrat.ui.theme.surfaceContainerLightHighContrast
import com.eirikrg.gymrat.ui.theme.surfaceContainerLightMediumContrast
import com.eirikrg.gymrat.ui.theme.surfaceContainerLowDark
import com.eirikrg.gymrat.ui.theme.surfaceContainerLowDarkHighContrast
import com.eirikrg.gymrat.ui.theme.surfaceContainerLowDarkMediumContrast
import com.eirikrg.gymrat.ui.theme.surfaceContainerLowLight
import com.eirikrg.gymrat.ui.theme.surfaceContainerLowLightHighContrast
import com.eirikrg.gymrat.ui.theme.surfaceContainerLowLightMediumContrast
import com.eirikrg.gymrat.ui.theme.surfaceContainerLowestDark
import com.eirikrg.gymrat.ui.theme.surfaceContainerLowestDarkHighContrast
import com.eirikrg.gymrat.ui.theme.surfaceContainerLowestDarkMediumContrast
import com.eirikrg.gymrat.ui.theme.surfaceContainerLowestLight
import com.eirikrg.gymrat.ui.theme.surfaceContainerLowestLightHighContrast
import com.eirikrg.gymrat.ui.theme.surfaceContainerLowestLightMediumContrast
import com.eirikrg.gymrat.ui.theme.surfaceDark
import com.eirikrg.gymrat.ui.theme.surfaceDarkHighContrast
import com.eirikrg.gymrat.ui.theme.surfaceDarkMediumContrast
import com.eirikrg.gymrat.ui.theme.surfaceDimDark
import com.eirikrg.gymrat.ui.theme.surfaceDimDarkHighContrast
import com.eirikrg.gymrat.ui.theme.surfaceDimDarkMediumContrast
import com.eirikrg.gymrat.ui.theme.surfaceDimLight
import com.eirikrg.gymrat.ui.theme.surfaceDimLightHighContrast
import com.eirikrg.gymrat.ui.theme.surfaceDimLightMediumContrast
import com.eirikrg.gymrat.ui.theme.surfaceLight
import com.eirikrg.gymrat.ui.theme.surfaceLightHighContrast
import com.eirikrg.gymrat.ui.theme.surfaceLightMediumContrast
import com.eirikrg.gymrat.ui.theme.surfaceVariantDark
import com.eirikrg.gymrat.ui.theme.surfaceVariantDarkHighContrast
import com.eirikrg.gymrat.ui.theme.surfaceVariantDarkMediumContrast
import com.eirikrg.gymrat.ui.theme.surfaceVariantLight
import com.eirikrg.gymrat.ui.theme.surfaceVariantLightHighContrast
import com.eirikrg.gymrat.ui.theme.surfaceVariantLightMediumContrast
import com.eirikrg.gymrat.ui.theme.tertiaryContainerDark
import com.eirikrg.gymrat.ui.theme.tertiaryContainerDarkHighContrast
import com.eirikrg.gymrat.ui.theme.tertiaryContainerDarkMediumContrast
import com.eirikrg.gymrat.ui.theme.tertiaryContainerLight
import com.eirikrg.gymrat.ui.theme.tertiaryContainerLightHighContrast
import com.eirikrg.gymrat.ui.theme.tertiaryContainerLightMediumContrast
import com.eirikrg.gymrat.ui.theme.tertiaryDark
import com.eirikrg.gymrat.ui.theme.tertiaryDarkHighContrast
import com.eirikrg.gymrat.ui.theme.tertiaryDarkMediumContrast
import com.eirikrg.gymrat.ui.theme.tertiaryLight
import com.eirikrg.gymrat.ui.theme.tertiaryLightHighContrast
import com.eirikrg.gymrat.ui.theme.tertiaryLightMediumContrast

private val lightScheme = lightColorScheme(
    primary = primaryLight,
    onPrimary = onPrimaryLight,
    primaryContainer = primaryContainerLight,
    onPrimaryContainer = onPrimaryContainerLight,
    secondary = secondaryLight,
    onSecondary = onSecondaryLight,
    secondaryContainer = secondaryContainerLight,
    onSecondaryContainer = onSecondaryContainerLight,
    tertiary = tertiaryLight,
    onTertiary = onTertiaryLight,
    tertiaryContainer = tertiaryContainerLight,
    onTertiaryContainer = onTertiaryContainerLight,
    error = errorLight,
    onError = onErrorLight,
    errorContainer = errorContainerLight,
    onErrorContainer = onErrorContainerLight,
    background = backgroundLight,
    onBackground = onBackgroundLight,
    surface = surfaceLight,
    onSurface = onSurfaceLight,
    surfaceVariant = surfaceVariantLight,
    onSurfaceVariant = onSurfaceVariantLight,
    outline = outlineLight,
    outlineVariant = outlineVariantLight,
    scrim = scrimLight,
    inverseSurface = inverseSurfaceLight,
    inverseOnSurface = inverseOnSurfaceLight,
    inversePrimary = inversePrimaryLight,
    surfaceDim = surfaceDimLight,
    surfaceBright = surfaceBrightLight,
    surfaceContainerLowest = surfaceContainerLowestLight,
    surfaceContainerLow = surfaceContainerLowLight,
    surfaceContainer = surfaceContainerLight,
    surfaceContainerHigh = surfaceContainerHighLight,
    surfaceContainerHighest = surfaceContainerHighestLight,
)

private val darkScheme = darkColorScheme(
    primary = primaryDark,
    onPrimary = onPrimaryDark,
    primaryContainer = primaryContainerDark,
    onPrimaryContainer = onPrimaryContainerDark,
    secondary = secondaryDark,
    onSecondary = onSecondaryDark,
    secondaryContainer = secondaryContainerDark,
    onSecondaryContainer = onSecondaryContainerDark,
    tertiary = tertiaryDark,
    onTertiary = onTertiaryDark,
    tertiaryContainer = tertiaryContainerDark,
    onTertiaryContainer = onTertiaryContainerDark,
    error = errorDark,
    onError = onErrorDark,
    errorContainer = errorContainerDark,
    onErrorContainer = onErrorContainerDark,
    background = backgroundDark,
    onBackground = onBackgroundDark,
    surface = surfaceDark,
    onSurface = onSurfaceDark,
    surfaceVariant = surfaceVariantDark,
    onSurfaceVariant = onSurfaceVariantDark,
    outline = outlineDark,
    outlineVariant = outlineVariantDark,
    scrim = scrimDark,
    inverseSurface = inverseSurfaceDark,
    inverseOnSurface = inverseOnSurfaceDark,
    inversePrimary = inversePrimaryDark,
    surfaceDim = surfaceDimDark,
    surfaceBright = surfaceBrightDark,
    surfaceContainerLowest = surfaceContainerLowestDark,
    surfaceContainerLow = surfaceContainerLowDark,
    surfaceContainer = surfaceContainerDark,
    surfaceContainerHigh = surfaceContainerHighDark,
    surfaceContainerHighest = surfaceContainerHighestDark,
)

private val mediumContrastLightColorScheme = lightColorScheme(
    primary = primaryLightMediumContrast,
    onPrimary = onPrimaryLightMediumContrast,
    primaryContainer = primaryContainerLightMediumContrast,
    onPrimaryContainer = onPrimaryContainerLightMediumContrast,
    secondary = secondaryLightMediumContrast,
    onSecondary = onSecondaryLightMediumContrast,
    secondaryContainer = secondaryContainerLightMediumContrast,
    onSecondaryContainer = onSecondaryContainerLightMediumContrast,
    tertiary = tertiaryLightMediumContrast,
    onTertiary = onTertiaryLightMediumContrast,
    tertiaryContainer = tertiaryContainerLightMediumContrast,
    onTertiaryContainer = onTertiaryContainerLightMediumContrast,
    error = errorLightMediumContrast,
    onError = onErrorLightMediumContrast,
    errorContainer = errorContainerLightMediumContrast,
    onErrorContainer = onErrorContainerLightMediumContrast,
    background = backgroundLightMediumContrast,
    onBackground = onBackgroundLightMediumContrast,
    surface = surfaceLightMediumContrast,
    onSurface = onSurfaceLightMediumContrast,
    surfaceVariant = surfaceVariantLightMediumContrast,
    onSurfaceVariant = onSurfaceVariantLightMediumContrast,
    outline = outlineLightMediumContrast,
    outlineVariant = outlineVariantLightMediumContrast,
    scrim = scrimLightMediumContrast,
    inverseSurface = inverseSurfaceLightMediumContrast,
    inverseOnSurface = inverseOnSurfaceLightMediumContrast,
    inversePrimary = inversePrimaryLightMediumContrast,
    surfaceDim = surfaceDimLightMediumContrast,
    surfaceBright = surfaceBrightLightMediumContrast,
    surfaceContainerLowest = surfaceContainerLowestLightMediumContrast,
    surfaceContainerLow = surfaceContainerLowLightMediumContrast,
    surfaceContainer = surfaceContainerLightMediumContrast,
    surfaceContainerHigh = surfaceContainerHighLightMediumContrast,
    surfaceContainerHighest = surfaceContainerHighestLightMediumContrast,
)

private val highContrastLightColorScheme = lightColorScheme(
    primary = primaryLightHighContrast,
    onPrimary = onPrimaryLightHighContrast,
    primaryContainer = primaryContainerLightHighContrast,
    onPrimaryContainer = onPrimaryContainerLightHighContrast,
    secondary = secondaryLightHighContrast,
    onSecondary = onSecondaryLightHighContrast,
    secondaryContainer = secondaryContainerLightHighContrast,
    onSecondaryContainer = onSecondaryContainerLightHighContrast,
    tertiary = tertiaryLightHighContrast,
    onTertiary = onTertiaryLightHighContrast,
    tertiaryContainer = tertiaryContainerLightHighContrast,
    onTertiaryContainer = onTertiaryContainerLightHighContrast,
    error = errorLightHighContrast,
    onError = onErrorLightHighContrast,
    errorContainer = errorContainerLightHighContrast,
    onErrorContainer = onErrorContainerLightHighContrast,
    background = backgroundLightHighContrast,
    onBackground = onBackgroundLightHighContrast,
    surface = surfaceLightHighContrast,
    onSurface = onSurfaceLightHighContrast,
    surfaceVariant = surfaceVariantLightHighContrast,
    onSurfaceVariant = onSurfaceVariantLightHighContrast,
    outline = outlineLightHighContrast,
    outlineVariant = outlineVariantLightHighContrast,
    scrim = scrimLightHighContrast,
    inverseSurface = inverseSurfaceLightHighContrast,
    inverseOnSurface = inverseOnSurfaceLightHighContrast,
    inversePrimary = inversePrimaryLightHighContrast,
    surfaceDim = surfaceDimLightHighContrast,
    surfaceBright = surfaceBrightLightHighContrast,
    surfaceContainerLowest = surfaceContainerLowestLightHighContrast,
    surfaceContainerLow = surfaceContainerLowLightHighContrast,
    surfaceContainer = surfaceContainerLightHighContrast,
    surfaceContainerHigh = surfaceContainerHighLightHighContrast,
    surfaceContainerHighest = surfaceContainerHighestLightHighContrast,
)

private val mediumContrastDarkColorScheme = darkColorScheme(
    primary = primaryDarkMediumContrast,
    onPrimary = onPrimaryDarkMediumContrast,
    primaryContainer = primaryContainerDarkMediumContrast,
    onPrimaryContainer = onPrimaryContainerDarkMediumContrast,
    secondary = secondaryDarkMediumContrast,
    onSecondary = onSecondaryDarkMediumContrast,
    secondaryContainer = secondaryContainerDarkMediumContrast,
    onSecondaryContainer = onSecondaryContainerDarkMediumContrast,
    tertiary = tertiaryDarkMediumContrast,
    onTertiary = onTertiaryDarkMediumContrast,
    tertiaryContainer = tertiaryContainerDarkMediumContrast,
    onTertiaryContainer = onTertiaryContainerDarkMediumContrast,
    error = errorDarkMediumContrast,
    onError = onErrorDarkMediumContrast,
    errorContainer = errorContainerDarkMediumContrast,
    onErrorContainer = onErrorContainerDarkMediumContrast,
    background = backgroundDarkMediumContrast,
    onBackground = onBackgroundDarkMediumContrast,
    surface = surfaceDarkMediumContrast,
    onSurface = onSurfaceDarkMediumContrast,
    surfaceVariant = surfaceVariantDarkMediumContrast,
    onSurfaceVariant = onSurfaceVariantDarkMediumContrast,
    outline = outlineDarkMediumContrast,
    outlineVariant = outlineVariantDarkMediumContrast,
    scrim = scrimDarkMediumContrast,
    inverseSurface = inverseSurfaceDarkMediumContrast,
    inverseOnSurface = inverseOnSurfaceDarkMediumContrast,
    inversePrimary = inversePrimaryDarkMediumContrast,
    surfaceDim = surfaceDimDarkMediumContrast,
    surfaceBright = surfaceBrightDarkMediumContrast,
    surfaceContainerLowest = surfaceContainerLowestDarkMediumContrast,
    surfaceContainerLow = surfaceContainerLowDarkMediumContrast,
    surfaceContainer = surfaceContainerDarkMediumContrast,
    surfaceContainerHigh = surfaceContainerHighDarkMediumContrast,
    surfaceContainerHighest = surfaceContainerHighestDarkMediumContrast,
)

private val highContrastDarkColorScheme = darkColorScheme(
    primary = primaryDarkHighContrast,
    onPrimary = onPrimaryDarkHighContrast,
    primaryContainer = primaryContainerDarkHighContrast,
    onPrimaryContainer = onPrimaryContainerDarkHighContrast,
    secondary = secondaryDarkHighContrast,
    onSecondary = onSecondaryDarkHighContrast,
    secondaryContainer = secondaryContainerDarkHighContrast,
    onSecondaryContainer = onSecondaryContainerDarkHighContrast,
    tertiary = tertiaryDarkHighContrast,
    onTertiary = onTertiaryDarkHighContrast,
    tertiaryContainer = tertiaryContainerDarkHighContrast,
    onTertiaryContainer = onTertiaryContainerDarkHighContrast,
    error = errorDarkHighContrast,
    onError = onErrorDarkHighContrast,
    errorContainer = errorContainerDarkHighContrast,
    onErrorContainer = onErrorContainerDarkHighContrast,
    background = backgroundDarkHighContrast,
    onBackground = onBackgroundDarkHighContrast,
    surface = surfaceDarkHighContrast,
    onSurface = onSurfaceDarkHighContrast,
    surfaceVariant = surfaceVariantDarkHighContrast,
    onSurfaceVariant = onSurfaceVariantDarkHighContrast,
    outline = outlineDarkHighContrast,
    outlineVariant = outlineVariantDarkHighContrast,
    scrim = scrimDarkHighContrast,
    inverseSurface = inverseSurfaceDarkHighContrast,
    inverseOnSurface = inverseOnSurfaceDarkHighContrast,
    inversePrimary = inversePrimaryDarkHighContrast,
    surfaceDim = surfaceDimDarkHighContrast,
    surfaceBright = surfaceBrightDarkHighContrast,
    surfaceContainerLowest = surfaceContainerLowestDarkHighContrast,
    surfaceContainerLow = surfaceContainerLowDarkHighContrast,
    surfaceContainer = surfaceContainerDarkHighContrast,
    surfaceContainerHigh = surfaceContainerHighDarkHighContrast,
    surfaceContainerHighest = surfaceContainerHighestDarkHighContrast,
)

@Immutable
data class ColorFamily(
    val color: Color,
    val onColor: Color,
    val colorContainer: Color,
    val onColorContainer: Color
)

val unspecified_scheme = ColorFamily(
    Color.Unspecified, Color.Unspecified, Color.Unspecified, Color.Unspecified
)

@Composable
fun GymRatTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable() () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> darkScheme
        else -> lightScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = AppTypography,
        content = content
    )
}

