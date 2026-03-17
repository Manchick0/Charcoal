package com.manchickas.charcoal;

import com.manchickas.charcoal.style.Empty;
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

    public static @NotNull Style empty() {
        return new Empty(null);
    }

    public static @NotNull Style bold() {
        return Charcoal.BOLD;
    }

    public static @NotNull String bold(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return Charcoal.BOLD.wrap(sqc);
    }

    public static @NotNull String bold(char c) {
        return Charcoal.BOLD.wrap(c);
    }

    public static @NotNull Style dim() {
        return Charcoal.DIM;
    }

    public static @NotNull String dim(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return Charcoal.DIM.wrap(sqc);
    }

    public static @NotNull String dim(char c) {
        return Charcoal.DIM.wrap(c);
    }

    public static @NotNull Style italic() {
        return Charcoal.ITALIC;
    }

    public static @NotNull String italic(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return Charcoal.ITALIC.wrap(sqc);
    }

    public static @NotNull String italic(char c) {
        return Charcoal.ITALIC.wrap(c);
    }

    public static @NotNull Style underline() {
        return Charcoal.UNDERLINE;
    }

    public static @NotNull String underline(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return Charcoal.UNDERLINE.wrap(sqc);
    }

    public static @NotNull String underline(char c) {
        return Charcoal.UNDERLINE.wrap(c);
    }

    public static @NotNull Style strikethrough() {
        return Charcoal.STRIKETHROUGH;
    }

    public static @NotNull String strikethrough(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return Charcoal.STRIKETHROUGH.wrap(sqc);
    }

    public static @NotNull String strikethrough(char c) {
        return Charcoal.STRIKETHROUGH.wrap(c);
    }

    public static @NotNull Style black() {
        return Charcoal.BLACK;
    }

    public static @NotNull String black(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return Charcoal.BLACK.wrap(sqc);
    }

    public static @NotNull String black(char c) {
        return Charcoal.BLACK.wrap(c);
    }

    public static @NotNull Style red() {
        return Charcoal.RED;
    }

    public static @NotNull String red(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return Charcoal.RED.wrap(sqc);
    }

    public static @NotNull String red(char c) {
        return Charcoal.RED.wrap(c);
    }

    public static @NotNull Style green() {
        return Charcoal.GREEN;
    }

    public static @NotNull String green(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return Charcoal.GREEN.wrap(sqc);
    }

    public static @NotNull String green(char c) {
        return Charcoal.GREEN.wrap(c);
    }

    public static @NotNull Style yellow() {
        return Charcoal.YELLOW;
    }

    public static @NotNull String yellow(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return Charcoal.YELLOW.wrap(sqc);
    }

    public static @NotNull String yellow(char c) {
        return Charcoal.YELLOW.wrap(c);
    }

    public static @NotNull Style blue() {
        return Charcoal.BLUE;
    }

    public static @NotNull String blue(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return Charcoal.BLUE.wrap(sqc);
    }

    public static @NotNull String blue(char c) {
        return Charcoal.BLUE.wrap(c);
    }

    public static @NotNull Style purple() {
        return Charcoal.MAGENTA;
    }

    public static @NotNull String purple(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return Charcoal.MAGENTA.wrap(sqc);
    }

    public static @NotNull String purple(char c) {
        return Charcoal.MAGENTA.wrap(c);
    }

    public static @NotNull Style cyan() {
        return Charcoal.CYAN;
    }

    public static @NotNull String cyan(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return Charcoal.CYAN.wrap(sqc);
    }

    public static @NotNull String cyan(char c) {
        return Charcoal.CYAN.wrap(c);
    }

    public static @NotNull Style lightGray() {
        return Charcoal.WHITE;
    }

    public static @NotNull String lightGray(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return Charcoal.WHITE.wrap(sqc);
    }

    public static @NotNull String lightGray(char c) {
        return Charcoal.WHITE.wrap(c);
    }

    public static @NotNull Style gray() {
        return Charcoal.BLACK_BRIGHT;
    }

    public static @NotNull String gray(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return Charcoal.BLACK_BRIGHT.wrap(sqc);
    }

    public static @NotNull String gray(char c) {
        return Charcoal.BLACK_BRIGHT.wrap(c);
    }

    public static @NotNull Style brightRed() {
        return Charcoal.RED_BRIGHT;
    }

    public static @NotNull String brightRed(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return Charcoal.RED_BRIGHT.wrap(sqc);
    }

    public static @NotNull String brightRed(char c) {
        return Charcoal.RED_BRIGHT.wrap(c);
    }

    public static @NotNull Style brightGreen() {
        return Charcoal.GREEN_BRIGHT;
    }

    public static @NotNull String brightGreen(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return Charcoal.GREEN_BRIGHT.wrap(sqc);
    }

    public static @NotNull String brightGreen(char c) {
        return Charcoal.GREEN_BRIGHT.wrap(c);
    }

    public static @NotNull Style brightYellow() {
        return Charcoal.YELLOW_BRIGHT;
    }

    public static @NotNull String brightYellow(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return Charcoal.YELLOW_BRIGHT.wrap(sqc);
    }

    public static @NotNull String brightYellow(char c) {
        return Charcoal.YELLOW_BRIGHT.wrap(c);
    }

    public static @NotNull Style brightBlue() {
        return Charcoal.BLUE_BRIGHT;
    }

    public static @NotNull String brightBlue(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return Charcoal.BLUE_BRIGHT.wrap(sqc);
    }

    public static @NotNull String brightBlue(char c) {
        return Charcoal.BLUE_BRIGHT.wrap(c);
    }

    public static @NotNull Style pink() {
        return Charcoal.MAGENTA_BRIGHT;
    }

    public static @NotNull String pink(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return Charcoal.MAGENTA_BRIGHT.wrap(sqc);
    }

    public static @NotNull String pink(char c) {
        return Charcoal.MAGENTA_BRIGHT.wrap(c);
    }

    public static @NotNull Style brightCyan() {
        return Charcoal.CYAN_BRIGHT;
    }

    public static @NotNull String brightCyan(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return Charcoal.CYAN_BRIGHT.wrap(sqc);
    }

    public static @NotNull String brightCyan(char c) {
        return Charcoal.CYAN_BRIGHT.wrap(c);
    }

    public static @NotNull Style white() {
        return Charcoal.WHITE_BRIGHT;
    }

    public static @NotNull String white(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return Charcoal.WHITE_BRIGHT.wrap(sqc);
    }

    public static @NotNull String white(char c) {
        return Charcoal.WHITE_BRIGHT.wrap(c);
    }

    public static @NotNull Style foreground(int color) {
        return SGR.FOREGROUND.apply(null, color);
    }

    public static @NotNull String foreground(int color, @NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return SGR.FOREGROUND.apply(null, color).wrap(sqc);
    }

    public static @NotNull String foreground(int color, char c) {
        return SGR.FOREGROUND.apply(null, color).wrap(c);
    }

    public static @NotNull Style background(int color) {
        return SGR.BACKGROUND.apply(null, color);
    }

    public static @NotNull String background(int color, @NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return SGR.BACKGROUND.apply(null, color).wrap(sqc);
    }

    public static @NotNull String background(int color, char c) {
        return SGR.BACKGROUND.apply(null, color).wrap(c);
    }

    public static @NotNull Style link(@NotNull URI reference) {
        return new Hyperlink(null, reference);
    }

    public static @NotNull String link(@NotNull URI reference, @NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return new Hyperlink(null, reference).wrap(sqc);
    }

    public static @NotNull String link(@NotNull URI reference, char c) {
        return new Hyperlink(null, reference).wrap(c);
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
        return terminal.isTerminal(); // isatty
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
