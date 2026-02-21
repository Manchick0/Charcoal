package com.manchickas.charcoal;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Range;

import java.util.Objects;

public abstract class Charcoal {

    private static final boolean ENABLED_GLOBALLY     = Charcoal.readFlag();
    private static final ThreadLocal<Boolean> ENABLED = ThreadLocal.withInitial(() -> Charcoal.ENABLED_GLOBALLY);

    private static final Style EMPTY             = new Style.Empty(null);
    private static final Style BOLD              = new Style.Fixed(null, Style.BOLD);
    private static final Style DIM               = new Style.Fixed(null, Style.DIM);
    private static final Style ITALIC            = new Style.Fixed(null, Style.ITALIC);
    private static final Style UNDERLINE         = new Style.Fixed(null, Style.UNDERLINE);
    private static final Style BLINK             = new Style.Fixed(null, Style.BLINK);
    private static final Style RAPID_BLINK       = new Style.Fixed(null, Style.RAPID_BLINK);
    private static final Style STRIKE_THROUGH    = new Style.Fixed(null, Style.STRIKE_THROUGH);
    private static final Style BLACK             = new Style.Fixed(null, Style.BLACK);
    private static final Style RED               = new Style.Fixed(null, Style.RED);
    private static final Style GREEN             = new Style.Fixed(null, Style.GREEN);
    private static final Style YELLOW            = new Style.Fixed(null, Style.YELLOW);
    private static final Style BLUE              = new Style.Fixed(null, Style.BLUE);
    private static final Style MAGENTA           = new Style.Fixed(null, Style.MAGENTA);
    private static final Style CYAN              = new Style.Fixed(null, Style.CYAN);
    private static final Style WHITE             = new Style.Fixed(null, Style.WHITE);
    private static final Style BLACK_BRIGHT      = new Style.Fixed(null, Style.BLACK_BRIGHT);
    private static final Style RED_BRIGHT        = new Style.Fixed(null, Style.RED_BRIGHT);
    private static final Style GREEN_BRIGHT      = new Style.Fixed(null, Style.GREEN_BRIGHT);
    private static final Style YELLOW_BRIGHT     = new Style.Fixed(null, Style.YELLOW_BRIGHT);
    private static final Style BLUE_BRIGHT       = new Style.Fixed(null, Style.BLUE_BRIGHT);
    private static final Style MAGENTA_BRIGHT    = new Style.Fixed(null, Style.MAGENTA_BRIGHT);
    private static final Style CYAN_BRIGHT       = new Style.Fixed(null, Style.CYAN_BRIGHT);
    private static final Style WHITE_BRIGHT      = new Style.Fixed(null, Style.WHITE_BRIGHT);
    private static final Style BLACK_BG          = new Style.Fixed(null, Style.BLACK_BG);
    private static final Style RED_BG            = new Style.Fixed(null, Style.RED_BG);
    private static final Style GREEN_BG          = new Style.Fixed(null, Style.GREEN_BG);
    private static final Style YELLOW_BG         = new Style.Fixed(null, Style.YELLOW_BG);
    private static final Style BLUE_BG           = new Style.Fixed(null, Style.BLUE_BG);
    private static final Style MAGENTA_BG        = new Style.Fixed(null, Style.MAGENTA_BG);
    private static final Style CYAN_BG           = new Style.Fixed(null, Style.CYAN_BG);
    private static final Style WHITE_BG          = new Style.Fixed(null, Style.WHITE_BG);
    private static final Style BLACK_BRIGHT_BG   = new Style.Fixed(null, Style.BLACK_BRIGHT_BG);
    private static final Style RED_BRIGHT_BG     = new Style.Fixed(null, Style.RED_BRIGHT_BG);
    private static final Style GREEN_BRIGHT_BG   = new Style.Fixed(null, Style.GREEN_BRIGHT_BG);
    private static final Style YELLOW_BRIGHT_BG  = new Style.Fixed(null, Style.YELLOW_BRIGHT_BG);
    private static final Style BLUE_BRIGHT_BG    = new Style.Fixed(null, Style.BLUE_BRIGHT_BG);
    private static final Style MAGENTA_BRIGHT_BG = new Style.Fixed(null, Style.MAGENTA_BRIGHT_BG);
    private static final Style CYAN_BRIGHT_BG    = new Style.Fixed(null, Style.CYAN_BRIGHT_BG);
    private static final Style WHITE_BRIGHT_BG   = new Style.Fixed(null, Style.WHITE_BRIGHT_BG);

    // abstract class; private constructor
    private Charcoal() {
        throw new UnsupportedOperationException();
    }

    public static @NotNull Style empty() {
        return Charcoal.EMPTY;
    }

    public static @NotNull Style bold() {
        return Charcoal.BOLD;
    }

    public static @NotNull String bold(@NotNull String content) {
        Objects.requireNonNull(content);
        return Charcoal.BOLD.apply(content);
    }

    public static @NotNull Style dim() {
        return Charcoal.DIM;
    }

    public static @NotNull String dim(@NotNull String content) {
        Objects.requireNonNull(content);
        return Charcoal.DIM.apply(content);
    }

    public static @NotNull Style italic() {
        return Charcoal.ITALIC;
    }

    public static @NotNull String italic(@NotNull String content) {
        Objects.requireNonNull(content);
        return Charcoal.ITALIC.apply(content);
    }

    public static @NotNull Style underline() {
        return Charcoal.UNDERLINE;
    }

    public static @NotNull String underline(@NotNull String content) {
        Objects.requireNonNull(content);
        return Charcoal.UNDERLINE.apply(content);
    }

    public static @NotNull Style blinking() {
        return Charcoal.BLINK;
    }

    public static @NotNull String blinking(@NotNull String content) {
        Objects.requireNonNull(content);
        return Charcoal.BLINK.apply(content);
    }

    public static @NotNull Style blinkingRapidly() {
        return Charcoal.RAPID_BLINK;
    }

    public static @NotNull String blinkingRapidly(@NotNull String content) {
        Objects.requireNonNull(content);
        return Charcoal.RAPID_BLINK.apply(content);
    }

    public static @NotNull Style strikeThrough() {
        return Charcoal.STRIKE_THROUGH;
    }

    public static @NotNull String strikeThrough(@NotNull String content) {
        Objects.requireNonNull(content);
        return Charcoal.STRIKE_THROUGH.apply(content);
    }

    public static @NotNull Style black() {
        return Charcoal.BLACK;
    }

    public static @NotNull String black(@NotNull String content) {
        Objects.requireNonNull(content);
        return Charcoal.BLACK.apply(content);
    }
    
    public static @NotNull Style red() {
        return Charcoal.RED;
    }
    
    public static @NotNull String red(@NotNull String content) {
        Objects.requireNonNull(content);
        return Charcoal.RED.apply(content);
    }
    
    public static @NotNull Style green() {
        return Charcoal.GREEN;
    }

    public static @NotNull String green(@NotNull String content) {
        Objects.requireNonNull(content);
        return Charcoal.GREEN.apply(content);
    }

    public static @NotNull Style yellow() {
        return Charcoal.YELLOW;
    }

    public static @NotNull String yellow(@NotNull String content) {
        Objects.requireNonNull(content);
        return Charcoal.YELLOW.apply(content);
    }

    public static @NotNull Style blue() {
        return Charcoal.BLUE;
    }

    public static @NotNull String blue(@NotNull String content) {
        Objects.requireNonNull(content);
        return Charcoal.BLUE.apply(content);
    }

    public static @NotNull Style magenta() {
        return Charcoal.MAGENTA;
    }

    public static @NotNull String magenta(@NotNull String content) {
        Objects.requireNonNull(content);
        return Charcoal.MAGENTA.apply(content);
    }

    public static @NotNull Style cyan() {
        return Charcoal.CYAN;
    }

    public static @NotNull String cyan(@NotNull String content) {
        Objects.requireNonNull(content);
        return Charcoal.CYAN.apply(content);
    }

    public static @NotNull Style white() {
        return Charcoal.WHITE;
    }

    public static @NotNull String white(@NotNull String content) {
        Objects.requireNonNull(content);
        return Charcoal.WHITE.apply(content);
    }

    public static @NotNull Style brightBlack() {
        return Charcoal.BLACK_BRIGHT;
    }

    public static @NotNull String brightBlack(@NotNull String content) {
        Objects.requireNonNull(content);
        return Charcoal.BLACK_BRIGHT.apply(content);
    }

    public static @NotNull Style brightRed() {
        return Charcoal.RED_BRIGHT;
    }

    public static @NotNull String brightRed(@NotNull String content) {
        Objects.requireNonNull(content);
        return Charcoal.RED_BRIGHT.apply(content);
    }

    public static @NotNull Style brightGreen() {
        return Charcoal.GREEN_BRIGHT;
    }

    public static @NotNull String brightGreen(@NotNull String content) {
        Objects.requireNonNull(content);
        return Charcoal.GREEN_BRIGHT.apply(content);
    }

    public static @NotNull Style brightYellow() {
        return Charcoal.YELLOW_BRIGHT;
    }

    public static @NotNull String brightYellow(@NotNull String content) {
        Objects.requireNonNull(content);
        return Charcoal.YELLOW_BRIGHT.apply(content);
    }

    public static @NotNull Style brightBlue() {
        return Charcoal.BLUE_BRIGHT;
    }

    public static @NotNull String brightBlue(@NotNull String content) {
        Objects.requireNonNull(content);
        return Charcoal.BLUE_BRIGHT.apply(content);
    }

    public static @NotNull Style brightMagenta() {
        return Charcoal.MAGENTA_BRIGHT;
    }

    public static @NotNull String brightMagenta(@NotNull String content) {
        Objects.requireNonNull(content);
        return Charcoal.MAGENTA_BRIGHT.apply(content);
    }

    public static @NotNull Style brightCyan() {
        return Charcoal.CYAN_BRIGHT;
    }

    public static @NotNull String brightCyan(@NotNull String content) {
        Objects.requireNonNull(content);
        return Charcoal.CYAN_BRIGHT.apply(content);
    }

    public static @NotNull Style brightWhite() {
        return Charcoal.WHITE_BRIGHT;
    }

    public static @NotNull String brightWhite(@NotNull String content) {
        Objects.requireNonNull(content);
        return Charcoal.WHITE_BRIGHT.apply(content);
    }


    public static @NotNull Style blackBg() {
        return Charcoal.BLACK_BG;
    }

    public static @NotNull String blackBg(@NotNull String content) {
        Objects.requireNonNull(content);
        return Charcoal.BLACK_BG.apply(content);
    }

    public static @NotNull Style redBg() {
        return Charcoal.RED_BG;
    }

    public static @NotNull String redBg(@NotNull String content) {
        Objects.requireNonNull(content);
        return Charcoal.RED_BG.apply(content);
    }

    public static @NotNull Style greenBg() {
        return Charcoal.GREEN_BG;
    }

    public static @NotNull String greenBg(@NotNull String content) {
        Objects.requireNonNull(content);
        return Charcoal.GREEN_BG.apply(content);
    }

    public static @NotNull Style yellowBg() {
        return Charcoal.YELLOW_BG;
    }

    public static @NotNull String yellowBg(@NotNull String content) {
        Objects.requireNonNull(content);
        return Charcoal.YELLOW_BG.apply(content);
    }

    public static @NotNull Style blueBg() {
        return Charcoal.BLUE_BG;
    }

    public static @NotNull String blueBg(@NotNull String content) {
        Objects.requireNonNull(content);
        return Charcoal.BLUE_BG.apply(content);
    }

    public static @NotNull Style magentaBg() {
        return Charcoal.MAGENTA_BG;
    }

    public static @NotNull String magentaBg(@NotNull String content) {
        Objects.requireNonNull(content);
        return Charcoal.MAGENTA_BG.apply(content);
    }

    public static @NotNull Style cyanBg() {
        return Charcoal.CYAN_BG;
    }

    public static @NotNull String cyanBg(@NotNull String content) {
        Objects.requireNonNull(content);
        return Charcoal.CYAN_BG.apply(content);
    }

    public static @NotNull Style whiteBg() {
        return Charcoal.WHITE_BG;
    }

    public static @NotNull String whiteBg(@NotNull String content) {
        Objects.requireNonNull(content);
        return Charcoal.WHITE_BG.apply(content);
    }

    public static @NotNull Style brightBlackBg() {
        return Charcoal.BLACK_BRIGHT_BG;
    }

    public static @NotNull String brightBlackBg(@NotNull String content) {
        Objects.requireNonNull(content);
        return Charcoal.BLACK_BRIGHT_BG.apply(content);
    }

    public static @NotNull Style brightRedBg() {
        return Charcoal.RED_BRIGHT_BG;
    }

    public static @NotNull String brightRedBg(@NotNull String content) {
        Objects.requireNonNull(content);
        return Charcoal.RED_BRIGHT_BG.apply(content);
    }

    public static @NotNull Style brightGreenBg() {
        return Charcoal.GREEN_BRIGHT_BG;
    }

    public static @NotNull String brightGreenBg(@NotNull String content) {
        Objects.requireNonNull(content);
        return Charcoal.GREEN_BRIGHT_BG.apply(content);
    }

    public static @NotNull Style brightYellowBg() {
        return Charcoal.YELLOW_BRIGHT_BG;
    }

    public static @NotNull String brightYellowBg(@NotNull String content) {
        Objects.requireNonNull(content);
        return Charcoal.YELLOW_BRIGHT_BG.apply(content);
    }

    public static @NotNull Style brightBlueBg() {
        return Charcoal.BLUE_BRIGHT_BG;
    }

    public static @NotNull String brightBlueBg(@NotNull String content) {
        Objects.requireNonNull(content);
        return Charcoal.BLUE_BRIGHT_BG.apply(content);
    }

    public static @NotNull Style brightMagentaBg() {
        return Charcoal.MAGENTA_BRIGHT_BG;
    }

    public static @NotNull String brightMagentaBg(@NotNull String content) {
        Objects.requireNonNull(content);
        return Charcoal.MAGENTA_BRIGHT_BG.apply(content);
    }

    public static @NotNull Style brightCyanBg() {
        return Charcoal.CYAN_BRIGHT_BG;
    }

    public static @NotNull String brightCyanBg(@NotNull String content) {
        Objects.requireNonNull(content);
        return Charcoal.CYAN_BRIGHT_BG.apply(content);
    }

    public static @NotNull Style brightWhiteBg() {
        return Charcoal.WHITE_BRIGHT_BG;
    }

    public static @NotNull String brightWhiteBg(@NotNull String content) {
        Objects.requireNonNull(content);
        return Charcoal.WHITE_BRIGHT_BG.apply(content);
    }

    public static @NotNull Style foreground(@Range(from = 0, to = 0xFFFFFF) int color) {
        return new Style.Truecolor.Foreground(null, Charcoal.splitColor(color));
    }

    public static @NotNull String color(@Range(from = 0, to = 0xFFFFFF) int color,
                                        @NotNull String content) {
        Objects.requireNonNull(content);
        return new Style.Truecolor.Foreground(null, Charcoal.splitColor(color))
                .apply(content);
    }

    public static @NotNull Style background(@Range(from = 0, to = 0xFFFFFF) int color) {
        return new Style.Truecolor.Background(null, Charcoal.splitColor(color));
    }

    public static @NotNull String background(@Range(from = 0, to = 0xFFFFFF) int color,
                                             @NotNull String content) {
        Objects.requireNonNull(content);
        return new Style.Truecolor.Background(null, Charcoal.splitColor(color))
                .apply(content);
    }

    /// Joins together the provided [String] parts.
    ///
    /// Since it's common for formatting to appear within a string literal,
    /// this method lets one concatenate styled and unstyled strings
    /// in a readable manner.
    ///
    /// The following call to `join` yields `Hello, \033[93mMarie\033[39m!`:
    /// ```java
    /// Charcoal.join("Hello, ", Charcoal.brightYellow("Marie"), "!");
    /// ```
    public static @NotNull String join(@NotNull String @NotNull... parts) {
        Objects.requireNonNull(parts);
        var buffer = new StringBuilder();
        for (var part : parts)
            buffer.append(Objects.requireNonNull(part));
        return buffer.toString();
    }

    @ApiStatus.Internal
    public static int @NotNull[] splitColor(@Range(from = 0, to = 0xFFFFFF) int color) {
        return new int[] {
                (color >> 16) & 0xFF,
                (color >> 8) & 0xFF,
                color & 0xFF
        };
    }

    /// Enables Charcoal on the current thread.
    ///
    /// The `enable` method lets you override the `-Dcharcoal`
    /// system property for the current thread, letting you (potentially temporarily)
    /// enable Charcoal formatting.
    ///
    /// @return Whether the state of Charcoal was changed as a result of the operation.
    public static boolean enable() {
        if (Charcoal.ENABLED.get())
            return false;
        Charcoal.ENABLED.set(true);
        return true;
    }

    /// Disables Charcoal on the current thread.
    ///
    /// The `disable` method lets you override the `-Dcharcoal`
    /// system property for the current thread, letting you (potentially temporarily)
    /// disable Charcoal formatting.
    ///
    /// @return Whether the state of Charcoal was changed as a result of the operation.
    public static boolean disable() {
        if (Charcoal.ENABLED.get()) {
            Charcoal.ENABLED.set(false);
            return true;
        }
        return false;
    }

    /// Determines whether Charcoal is enabled for the current thread.
    ///
    /// Unless explicitly changed with the [#enable()] or [#disable()] methods,
    /// this returns the state of the global `-Dcharcoal` system property.
    ///
    /// @return Whether Charcoal is enabled for the current thread.
    public static boolean isEnabled() {
        return Charcoal.ENABLED.get();
    }

    @ApiStatus.Internal
    private static boolean readFlag() {
        var property = System.getProperty("charcoal");
        if (property != null) {
            return switch (property.trim()) {
                case "enabled", "enable", "true", "on" -> true;
                case "disabled", "disable", "false", "off" -> false;
                default -> throw new IllegalStateException(String.format("Encountered an unrecognized value for '-Dcharcoal': '%s'", property));
            };
        }
        return true;
    }
}
