package com.manchickas.charcoal;

import com.manchickas.charcoal.style.Hyperlink;
import com.manchickas.charcoal.style.SGR;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

import java.net.URI;
import java.util.Objects;

public final class Charcoal {

    private static final @NotNull State STATE = Charcoal.readState();
    private static final boolean TERMINAL     = Charcoal.hasTerminal();

    private static final Style BOLD           = SGR.BOLD.apply(null);
    private static final Style DIM            = SGR.DIM.apply(null);
    private static final Style ITALIC         = SGR.ITALIC.apply(null);
    private static final Style UNDERLINE      = SGR.UNDERLINE.apply(null);
    private static final Style STRIKETHROUGH  = SGR.STRIKETHROUGH.apply(null);
    private static final Style BLACK          = SGR.BLACK.apply(null);
    private static final Style RED            = SGR.RED.apply(null);
    private static final Style GREEN          = SGR.GREEN.apply(null);
    private static final Style YELLOW         = SGR.YELLOW.apply(null);
    private static final Style BLUE           = SGR.BLUE.apply(null);
    private static final Style MAGENTA        = SGR.MAGENTA.apply(null);
    private static final Style CYAN           = SGR.CYAN.apply(null);
    private static final Style WHITE          = SGR.WHITE.apply(null);
    private static final Style BLACK_BRIGHT   = SGR.BLACK_BRIGHT.apply(null);
    private static final Style RED_BRIGHT     = SGR.RED_BRIGHT.apply(null);
    private static final Style GREEN_BRIGHT   = SGR.GREEN_BRIGHT.apply(null);
    private static final Style YELLOW_BRIGHT  = SGR.YELLOW_BRIGHT.apply(null);
    private static final Style BLUE_BRIGHT    = SGR.BLUE_BRIGHT.apply(null);
    private static final Style MAGENTA_BRIGHT = SGR.MAGENTA_BRIGHT.apply(null);
    private static final Style CYAN_BRIGHT    = SGR.CYAN_BRIGHT.apply(null);
    private static final Style WHITE_BRIGHT   = SGR.WHITE_BRIGHT.apply(null);

    private Charcoal() {
        throw new UnsupportedOperationException();
    }

    public static @NotNull Style bold() {
        return Charcoal.BOLD;
    }

    public static @NotNull String bold(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return Charcoal.BOLD.apply(sqc);
    }

    public static @NotNull Style dim() {
        return Charcoal.DIM;
    }

    public static @NotNull String dim(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return Charcoal.DIM.apply(sqc);
    }

    public static @NotNull Style italic() {
        return Charcoal.ITALIC;
    }

    public static @NotNull String italic(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return Charcoal.ITALIC.apply(sqc);
    }

    public static @NotNull Style underline() {
        return Charcoal.UNDERLINE;
    }

    public static @NotNull String underline(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return Charcoal.UNDERLINE.apply(sqc);
    }

    public static @NotNull Style strikethrough() {
        return Charcoal.STRIKETHROUGH;
    }

    public static @NotNull String strikethrough(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return Charcoal.STRIKETHROUGH.apply(sqc);
    }

    public static @NotNull Style black() {
        return Charcoal.BLACK;
    }

    public static @NotNull String black(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return Charcoal.BLACK.apply(sqc);
    }

    public static @NotNull Style red() {
        return Charcoal.RED;
    }

    public static @NotNull String red(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return Charcoal.RED.apply(sqc);
    }

    public static @NotNull Style green() {
        return Charcoal.GREEN;
    }

    public static @NotNull String green(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return Charcoal.GREEN.apply(sqc);
    }

    public static @NotNull Style yellow() {
        return Charcoal.YELLOW;
    }

    public static @NotNull String yellow(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return Charcoal.YELLOW.apply(sqc);
    }

    public static @NotNull Style blue() {
        return Charcoal.BLUE;
    }

    public static @NotNull String blue(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return Charcoal.BLUE.apply(sqc);
    }

    public static @NotNull Style magenta() {
        return Charcoal.MAGENTA;
    }

    public static @NotNull String magenta(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return Charcoal.MAGENTA.apply(sqc);
    }

    public static @NotNull Style cyan() {
        return Charcoal.CYAN;
    }

    public static @NotNull String cyan(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return Charcoal.CYAN.apply(sqc);
    }

    public static @NotNull Style white() {
        return Charcoal.WHITE;
    }

    public static @NotNull String white(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return Charcoal.WHITE.apply(sqc);
    }

    public static @NotNull Style blackBright() {
        return Charcoal.BLACK_BRIGHT;
    }

    public static @NotNull String blackBright(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return Charcoal.BLACK_BRIGHT.apply(sqc);
    }

    public static @NotNull Style redBright() {
        return Charcoal.RED_BRIGHT;
    }

    public static @NotNull String redBright(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return Charcoal.RED_BRIGHT.apply(sqc);
    }

    public static @NotNull Style greenBright() {
        return Charcoal.GREEN_BRIGHT;
    }

    public static @NotNull String greenBright(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return Charcoal.GREEN_BRIGHT.apply(sqc);
    }

    public static @NotNull Style yellowBright() {
        return Charcoal.YELLOW_BRIGHT;
    }

    public static @NotNull String yellowBright(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return Charcoal.YELLOW_BRIGHT.apply(sqc);
    }

    public static @NotNull Style blueBright() {
        return Charcoal.BLUE_BRIGHT;
    }

    public static @NotNull String blueBright(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return Charcoal.BLUE_BRIGHT.apply(sqc);
    }

    public static @NotNull Style magentaBright() {
        return Charcoal.MAGENTA_BRIGHT;
    }

    public static @NotNull String magentaBright(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return Charcoal.MAGENTA_BRIGHT.apply(sqc);
    }

    public static @NotNull Style cyanBright() {
        return Charcoal.CYAN_BRIGHT;
    }

    public static @NotNull String cyanBright(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return Charcoal.CYAN_BRIGHT.apply(sqc);
    }

    public static @NotNull Style whiteBright() {
        return Charcoal.WHITE_BRIGHT;
    }

    public static @NotNull String whiteBright(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return Charcoal.WHITE_BRIGHT.apply(sqc);
    }

    public static @NotNull Style foreground(int color) {
        return SGR.FOREGROUND.apply(null, color);
    }

    public static @NotNull String foreground(int color, @NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return SGR.FOREGROUND.apply(null, color).apply(sqc);
    }

    public static @NotNull Style background(int color) {
        return SGR.BACKGROUND.apply(null, color);
    }

    public static @NotNull String background(int color, @NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return SGR.BACKGROUND.apply(null, color).apply(sqc);
    }

    public static @NotNull Style link(@NotNull URI reference) {
        return new Hyperlink(null, reference);
    }

    public static @NotNull String link(@NotNull URI reference, @NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return new Hyperlink(null, reference).apply(sqc);
    }

    /// Determines whether Charcoal is enabled.
    ///
    /// If the `color` flag is set to `true`, this method instead
    /// determines whether Charcoal is enabled for **color** specifically,
    /// which has broader terminal support.
    ///
    /// The state of Charcoal is determined when the class is first
    /// loaded using the `-Dcharcoal` system property:
    ///
    /// - If overridden to `"enabled"`, this method always returns `true`.
    /// - If overridden to `"disabled"`, this method always returns `false`.
    /// - If overridden to `"color"`, this method returns the provided `color` flag.
    ///
    /// Otherwise, the state of Charcoal is determined heuristically based on
    /// whether the current environment feels like a terminal.
    public static boolean isEnabled(boolean color) {
        return switch (Charcoal.STATE) {
            case State.ENABLED  -> true;
            case State.DISABLED -> false;
            case State.COLOR    -> color;
            default             -> Charcoal.TERMINAL;
        };
    }

    @ApiStatus.Internal
    private static boolean hasTerminal() {
        var terminal = System.console();
        if (terminal == null) {
            var env = System.getenv();
            return env.containsKey("TERM")
                    || env.containsKey("TERMINAL_EMULATOR")
                    || env.containsKey("TERM_PROGRAM")
                    || env.containsKey("COLORTERM");
        }
        return true;
    }

    @ApiStatus.Internal
    private static @NotNull State readState() {
        var property = System.getProperty("charcoal");
        if (property != null) {
            return switch (property.trim()) {
                case "enabled",  "enable",  "true",  "on" -> State.ENABLED;
                case "disabled", "disable", "false", "off" -> State.DISABLED;
                case "color",    "colors",  "sgr" -> State.COLOR;
                case "default",  "auto" -> State.DEFAULT;
                default -> throw new IllegalStateException(String.format("Encountered an unrecognized state for '-Dcharcoal': '%s'", property));
            };
        }
        return State.DEFAULT;
    }

    @ApiStatus.Internal
    private enum State {

        ENABLED,
        COLOR,
        DISABLED,
        DEFAULT
    }
}
