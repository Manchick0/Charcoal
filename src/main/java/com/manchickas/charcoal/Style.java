package com.manchickas.charcoal;

import com.manchickas.Charcoal;
import org.jetbrains.annotations.*;

import java.util.Objects;

public final class Style {

    private static final char ESCAPE = '\033';
    public static final byte[] BOLD = new byte[] { 1, 22 };
    public static final byte[] DIM = new byte[] { 2, 22 };
    public static final byte[] ITALIC = new byte[] { 3, 23 };
    public static final byte[] UNDERLINE = new byte[] { 4, 24 };
    public static final byte[] BLINK = new byte[] { 5, 25 };
    public static final byte[] RAPID_BLINK = new byte[] { 6, 25 };
    public static final byte[] STRIKE_THROUGH = new byte[] { 9, 29 };
    // Color names as defined by https://en.wikipedia.org/wiki/ANSI_escape_code#3-bit_and_4-bit
    public static final byte[] BLACK = new byte[] { 30, 39 };
    public static final byte[] RED = new byte[] { 31, 39 };
    public static final byte[] GREEN = new byte[] { 32, 39 };
    public static final byte[] YELLOW = new byte[] { 33, 39 };
    public static final byte[] BLUE = new byte[] { 34, 39 };
    public static final byte[] MAGENTA = new byte[] { 35, 39 };
    public static final byte[] CYAN = new byte[] { 36, 39 };
    public static final byte[] WHITE = new byte[] { 37, 39 };
    // Bright colors are technically not supported by the standard,
    // but virtually available everywhere.
    public static final byte[] BLACK_BRIGHT = new byte[] { 90, 39 };
    public static final byte[] RED_BRIGHT = new byte[] { 91, 39 };
    public static final byte[] GREEN_BRIGHT = new byte[] { 92, 39 };
    public static final byte[] YELLOW_BRIGHT = new byte[] { 93, 39 };
    public static final byte[] BLUE_BRIGHT = new byte[] { 94, 39 };
    public static final byte[] MAGENTA_BRIGHT = new byte[] { 95, 39 };
    public static final byte[] CYAN_BRIGHT = new byte[] { 96, 39 };
    public static final byte[] WHITE_BRIGHT = new byte[] { 97, 39 };
    public static final byte[] BLACK_BG = new byte[] { 40, 49 };
    public static final byte[] RED_BG = new byte[] { 41, 49 };
    public static final byte[] GREEN_BG = new byte[] { 42, 49 };
    public static final byte[] YELLOW_BG = new byte[] { 43, 49 };
    public static final byte[] BLUE_BG = new byte[] { 44, 49 };
    public static final byte[] MAGENTA_BG = new byte[] { 45, 49 };
    public static final byte[] CYAN_BG = new byte[] { 46, 49 };
    public static final byte[] WHITE_BG = new byte[] { 47, 49 };
    public static final byte[] BLACK_BRIGHT_BG = new byte[] { 100, 49 };
    public static final byte[] RED_BRIGHT_BG = new byte[] { 101, 49 };
    public static final byte[] GREEN_BRIGHT_BG = new byte[] { 102, 49 };
    public static final byte[] YELLOW_BRIGHT_BG = new byte[] { 103, 49 };
    public static final byte[] BLUE_BRIGHT_BG = new byte[] { 104, 49 };
    public static final byte[] MAGENTA_BRIGHT_BG = new byte[] { 105, 49 };
    public static final byte[] CYAN_BRIGHT_BG = new byte[] { 106, 49 };
    public static final byte[] WHITE_BRIGHT_BG = new byte[] { 107, 49 };
    public static final byte[] FOREGROUND_COLOR = new byte[] { 38, 39 };
    public static final byte[] BACKGROUND_COLOR = new byte[] { 48, 49 };

    private final @Nullable Style parent;
    private final byte @NotNull[] sequence;
    private final int @NotNull[] payload;

    public Style(@Nullable Style parent,
                 byte @NotNull[] sequence,
                 int @NotNull[] payload) {
        this.parent = parent;
        this.sequence = sequence;
        this.payload = payload;
    }

    public @NotNull Style bold() {
        return new Style(this, Style.BOLD, new int[0]);
    }

    public @NotNull String bold(@NotNull String content) {
        Objects.requireNonNull(content);
        return this.applyWithAdditional(content, Style.BOLD, new int[0]);
    }

    public @NotNull Style dim() {
        return new Style(this, Style.DIM, new int[0]);
    }

    public @NotNull String dim(@NotNull String content) {
        Objects.requireNonNull(content);
        return this.applyWithAdditional(content, Style.DIM, new int[0]);
    }

    public @NotNull Style italic() {
        return new Style(this, Style.ITALIC, new int[0]);
    }

    public @NotNull String italic(@NotNull String content) {
        Objects.requireNonNull(content);
        return this.applyWithAdditional(content, Style.ITALIC, new int[0]);
    }

    public @NotNull Style underline() {
        return new Style(this, Style.UNDERLINE, new int[0]);
    }

    public @NotNull String underline(@NotNull String content) {
        Objects.requireNonNull(content);
        return this.applyWithAdditional(content, Style.UNDERLINE, new int[0]);
    }

    public @NotNull Style blinking() {
        return new Style(this, Style.BLINK, new int[0]);
    }

    public @NotNull String blinking(@NotNull String content) {
        Objects.requireNonNull(content);
        return this.applyWithAdditional(content, Style.BLINK, new int[0]);
    }

    public @NotNull Style blinkingRapidly() {
        return new Style(this, Style.RAPID_BLINK, new int[0]);
    }

    public @NotNull String blinkingRapidly(@NotNull String content) {
        Objects.requireNonNull(content);
        return this.applyWithAdditional(content, Style.RAPID_BLINK, new int[0]);
    }

    public @NotNull Style strikeThrough() {
        return new Style(this, Style.STRIKE_THROUGH, new int[0]);
    }

    public @NotNull String strikeThrough(@NotNull String content) {
        Objects.requireNonNull(content);
        return this.applyWithAdditional(content, Style.STRIKE_THROUGH, new int[0]);
    }

    public @NotNull Style black() {
        return new Style(this, Style.BLACK, new int[0]);
    }

    public @NotNull String black(@NotNull String content) {
        Objects.requireNonNull(content);
        return this.applyWithAdditional(content, Style.BLACK, new int[0]);
    }

    public @NotNull Style red() {
        return new Style(this, Style.RED, new int[0]);
    }

    public @NotNull String red(@NotNull String content) {
        Objects.requireNonNull(content);
        return this.applyWithAdditional(content, Style.RED, new int[0]);
    }

    public @NotNull Style green() {
        return new Style(this, Style.GREEN, new int[0]);
    }

    public @NotNull String green(@NotNull String content) {
        Objects.requireNonNull(content);
        return this.applyWithAdditional(content, Style.GREEN, new int[0]);
    }

    public @NotNull Style yellow() {
        return new Style(this, Style.YELLOW, new int[0]);
    }

    public @NotNull String yellow(@NotNull String content) {
        Objects.requireNonNull(content);
        return this.applyWithAdditional(content, Style.YELLOW, new int[0]);
    }

    public @NotNull Style blue() {
        return new Style(this, Style.BLUE, new int[0]);
    }

    public @NotNull String blue(@NotNull String content) {
        Objects.requireNonNull(content);
        return this.applyWithAdditional(content, Style.BLUE, new int[0]);
    }

    public @NotNull Style magenta() {
        return new Style(this, Style.MAGENTA, new int[0]);
    }

    public @NotNull String magenta(@NotNull String content) {
        Objects.requireNonNull(content);
        return this.applyWithAdditional(content, Style.MAGENTA, new int[0]);
    }

    public @NotNull Style cyan() {
        return new Style(this, Style.CYAN, new int[0]);
    }

    public @NotNull String cyan(@NotNull String content) {
        Objects.requireNonNull(content);
        return this.applyWithAdditional(content, Style.CYAN, new int[0]);
    }

    public @NotNull Style white() {
        return new Style(this, Style.WHITE, new int[0]);
    }

    public @NotNull String white(@NotNull String content) {
        Objects.requireNonNull(content);
        return this.applyWithAdditional(content, Style.WHITE, new int[0]);
    }

    public @NotNull Style brightBlack() {
        return new Style(this, Style.BLACK_BRIGHT, new int[0]);
    }

    public @NotNull String brightBlack(@NotNull String content) {
        Objects.requireNonNull(content);
        return this.applyWithAdditional(content, Style.BLACK_BRIGHT, new int[0]);
    }

    public @NotNull Style brightRed() {
        return new Style(this, Style.RED_BRIGHT, new int[0]);
    }

    public @NotNull String brightRed(@NotNull String content) {
        Objects.requireNonNull(content);
        return this.applyWithAdditional(content, Style.RED_BRIGHT, new int[0]);
    }

    public @NotNull Style brightGreen() {
        return new Style(this, Style.GREEN_BRIGHT, new int[0]);
    }

    public @NotNull String brightGreen(@NotNull String content) {
        Objects.requireNonNull(content);
        return this.applyWithAdditional(content, Style.GREEN_BRIGHT, new int[0]);
    }

    public @NotNull Style brightYellow() {
        return new Style(this, Style.YELLOW_BRIGHT, new int[0]);
    }

    public @NotNull String brightYellow(@NotNull String content) {
        Objects.requireNonNull(content);
        return this.applyWithAdditional(content, Style.YELLOW_BRIGHT, new int[0]);
    }

    public @NotNull Style brightBlue() {
        return new Style(this, Style.BLUE_BRIGHT, new int[0]);
    }

    public @NotNull String brightBlue(@NotNull String content) {
        Objects.requireNonNull(content);
        return this.applyWithAdditional(content, Style.BLUE_BRIGHT, new int[0]);
    }

    public @NotNull Style brightMagenta() {
        return new Style(this, Style.MAGENTA_BRIGHT, new int[0]);
    }

    public @NotNull String brightMagenta(@NotNull String content) {
        Objects.requireNonNull(content);
        return this.applyWithAdditional(content, Style.MAGENTA_BRIGHT, new int[0]);
    }

    public @NotNull Style brightCyan() {
        return new Style(this, Style.CYAN_BRIGHT, new int[0]);
    }

    public @NotNull String brightCyan(@NotNull String content) {
        Objects.requireNonNull(content);
        return this.applyWithAdditional(content, Style.CYAN_BRIGHT, new int[0]);
    }

    public @NotNull Style brightWhite() {
        return new Style(this, Style.WHITE_BRIGHT, new int[0]);
    }

    public @NotNull String brightWhite(@NotNull String content) {
        Objects.requireNonNull(content);
        return this.applyWithAdditional(content, Style.WHITE_BRIGHT, new int[0]);
    }

    public @NotNull Style blackBg() {
        return new Style(this, Style.BLACK_BG, new int[0]);
    }

    public @NotNull String blackBg(@NotNull String content) {
        Objects.requireNonNull(content);
        return this.applyWithAdditional(content, Style.BLACK_BG, new int[0]);
    }

    public @NotNull Style redBg() {
        return new Style(this, Style.RED_BG, new int[0]);
    }

    public @NotNull String redBg(@NotNull String content) {
        Objects.requireNonNull(content);
        return this.applyWithAdditional(content, Style.RED_BG, new int[0]);
    }

    public @NotNull Style greenBg() {
        return new Style(this, Style.GREEN_BG, new int[0]);
    }

    public @NotNull String greenBg(@NotNull String content) {
        Objects.requireNonNull(content);
        return this.applyWithAdditional(content, Style.GREEN_BG, new int[0]);
    }

    public @NotNull Style yellowBg() {
        return new Style(this, Style.YELLOW_BG, new int[0]);
    }

    public @NotNull String yellowBg(@NotNull String content) {
        Objects.requireNonNull(content);
        return this.applyWithAdditional(content, Style.YELLOW_BG, new int[0]);
    }

    public @NotNull Style blueBg() {
        return new Style(this, Style.BLUE_BG, new int[0]);
    }

    public @NotNull String blueBg(@NotNull String content) {
        Objects.requireNonNull(content);
        return this.applyWithAdditional(content, Style.BLUE_BG, new int[0]);
    }

    public @NotNull Style magentaBg() {
        return new Style(this, Style.MAGENTA_BG, new int[0]);
    }

    public @NotNull String magentaBg(@NotNull String content) {
        Objects.requireNonNull(content);
        return this.applyWithAdditional(content, Style.MAGENTA_BG, new int[0]);
    }

    public @NotNull Style cyanBg() {
        return new Style(this, Style.CYAN_BG, new int[0]);
    }

    public @NotNull String cyanBg(@NotNull String content) {
        Objects.requireNonNull(content);
        return this.applyWithAdditional(content, Style.CYAN_BG, new int[0]);
    }

    public @NotNull Style whiteBg() {
        return new Style(this, Style.WHITE_BG, new int[0]);
    }

    public @NotNull String whiteBg(@NotNull String content) {
        Objects.requireNonNull(content);
        return this.applyWithAdditional(content, Style.WHITE_BG, new int[0]);
    }

    public @NotNull Style brightBlackBg() {
        return new Style(this, Style.BLACK_BRIGHT_BG, new int[0]);
    }

    public @NotNull String brightBlackBg(@NotNull String content) {
        Objects.requireNonNull(content);
        return this.applyWithAdditional(content, Style.BLACK_BRIGHT_BG, new int[0]);
    }

    public @NotNull Style brightRedBg() {
        return new Style(this, Style.RED_BRIGHT_BG, new int[0]);
    }

    public @NotNull String brightRedBg(@NotNull String content) {
        Objects.requireNonNull(content);
        return this.applyWithAdditional(content, Style.RED_BRIGHT_BG, new int[0]);
    }

    public @NotNull Style brightGreenBg() {
        return new Style(this, Style.GREEN_BRIGHT_BG, new int[0]);
    }

    public @NotNull String brightGreenBg(@NotNull String content) {
        Objects.requireNonNull(content);
        return this.applyWithAdditional(content, Style.GREEN_BRIGHT_BG, new int[0]);
    }

    public @NotNull Style brightYellowBg() {
        return new Style(this, Style.YELLOW_BRIGHT_BG, new int[0]);
    }

    public @NotNull String brightYellowBg(@NotNull String content) {
        Objects.requireNonNull(content);
        return this.applyWithAdditional(content, Style.YELLOW_BRIGHT_BG, new int[0]);
    }

    public @NotNull Style brightBlueBg() {
        return new Style(this, Style.BLUE_BRIGHT_BG, new int[0]);
    }

    public @NotNull String brightBlueBg(@NotNull String content) {
        Objects.requireNonNull(content);
        return this.applyWithAdditional(content, Style.BLUE_BRIGHT_BG, new int[0]);
    }

    public @NotNull Style brightMagentaBg() {
        return new Style(this, Style.MAGENTA_BRIGHT_BG, new int[0]);
    }

    public @NotNull String brightMagentaBg(@NotNull String content) {
        Objects.requireNonNull(content);
        return this.applyWithAdditional(content, Style.MAGENTA_BRIGHT_BG, new int[0]);
    }

    public @NotNull Style brightCyanBg() {
        return new Style(this, Style.CYAN_BRIGHT_BG, new int[0]);
    }

    public @NotNull String brightCyanBg(@NotNull String content) {
        Objects.requireNonNull(content);
        return this.applyWithAdditional(content, Style.CYAN_BRIGHT_BG, new int[0]);
    }

    public @NotNull Style brightWhiteBg() {
        return new Style(this, Style.WHITE_BRIGHT_BG, new int[0]);
    }

    public @NotNull String brightWhiteBg(@NotNull String content) {
        Objects.requireNonNull(content);
        return this.applyWithAdditional(content, Style.WHITE_BRIGHT_BG, new int[0]);
    }

    @SuppressWarnings("ConstantValue")
    public @NotNull Style color(@Range(from = 0, to = 0xFFFFFF) int color) {
        if (color < 0 || color > 0xFFFFFF)
            throw new IllegalArgumentException("Attempted to create a color() Style with color '%x'".formatted(color));
        return new Style(this, Style.FOREGROUND_COLOR, new int[] {
                2,
                (color >> 16) & 0xFF,
                (color >> 8) & 0xFF,
                color & 0xFF
        });
    }

    @SuppressWarnings("ConstantValue")
    public @NotNull String color(@Range(from = 0, to = 0xFFFFFF) int color,
                                 @NotNull String content) {
        if (color < 0 || color > 0xFFFFFF)
            throw new IllegalArgumentException("Attempted to create a color() Style with color '%x'".formatted(color));
        Objects.requireNonNull(content);
        return this.applyWithAdditional(content, Style.FOREGROUND_COLOR, new int[] {
                2,
                (color >> 16) & 0xFF,
                (color >> 8) & 0xFF,
                color & 0xFF
        });
    }

    @SuppressWarnings("ConstantValue")
    public @NotNull Style background(@Range(from = 0, to = 0xFFFFFF) int color) {
        if (color < 0 || color > 0xFFFFFF)
            throw new IllegalArgumentException("Attempted to create a bgColor() Style with color '%x'".formatted(color));
        return new Style(this, Style.BACKGROUND_COLOR, new int[] {
                2,
                (color >> 16) & 0xFF,
                (color >> 8) & 0xFF,
                color & 0xFF
        });
    }

    @SuppressWarnings("ConstantValue")
    public @NotNull String background(@Range(from = 0, to = 0xFFFFFF) int color,
                                      @NotNull String content) {
        if (color < 0 || color > 0xFFFFFF)
            throw new IllegalArgumentException("Attempted to create a bgColor() Style with color '%x'".formatted(color));
        Objects.requireNonNull(content);
        return this.applyWithAdditional(content, Style.BACKGROUND_COLOR, new int[] {
                2,
                (color >> 16) & 0xFF,
                (color >> 8) & 0xFF,
                color & 0xFF
        });
    }

    /// Applies the `Style` to the provided `content`.
    ///
    /// If Charcoal is enabled for the current thread, the specific SGR sequences
    /// described by the `Style` are built and pre-/appended to the provided `content`.
    ///
    /// Otherwise, the `content` is returned unchanged.
    ///
    /// The following call to `apply` yields `\033[1;31mHello, World!\033[22;39m`:
    /// ```java
    /// Charcoal.bold()
    ///         .red()
    ///         .apply("Hello, World!");
    /// ```
    @Contract(pure = true)
    public @NotNull String apply(@NotNull String content) {
        Objects.requireNonNull(content);
        if (Charcoal.isEnabled()) {
            var buffer = new StringBuilder();
            buffer.append(ESCAPE)
                    .append('[');
            this.appendBegin(buffer)
                    .append('m')
                    .append(content)
                    .append(ESCAPE)
                    .append('[');
            return this.appendEnd(buffer)
                    .append('m')
                    .toString();
        }
        return content;
    }

    @ApiStatus.Internal
    private @NotNull String applyWithAdditional(@NotNull String content,
                                                byte @NotNull[] sequence,
                                                int @NotNull[] data) {
        if (Charcoal.isEnabled()) {
            var buffer = new StringBuilder();
            buffer.append(ESCAPE)
                    .append('[');
            this.appendBegin(buffer)
                    .append(';')
                    .append(sequence[0]);
            for (var datum : data)
                buffer.append(';').append(datum);
            buffer.append('m')
                    .append(content)
                    .append(ESCAPE)
                    .append('[');
            return this.appendEnd(buffer)
                    .append(';')
                    .append(sequence[1])
                    .append('m')
                    .toString();
        }
        return content;
    }

    /// Builds the SGR begin sequence described by the `Style`.
    ///
    /// Note that the sequence is specifically built in the _exact order the styles were composed_.
    /// While technically unnecessary, this keeps the semantics consistent.
    ///
    /// The following call to `beginSequence` yields `\033[1;31m`:
    /// ```java
    /// Charcoal.bold()
    ///         .red()
    ///         .beginSequence();
    /// ```
    @Contract(pure = true)
    public @NotNull String beginSequence() {
        var buffer = new StringBuilder();
        buffer.append(ESCAPE)
                .append('[');
        return this.appendBegin(buffer)
                .append('m')
                .toString();
    }

    @ApiStatus.Internal
    private @NotNull StringBuilder appendBegin(@NotNull StringBuilder buffer) {
        if (this.parent != null) {
            this.parent.appendBegin(buffer);
            buffer.append(';');
        }
        buffer.append(this.sequence[0]);
        for (var datum : this.payload)
            buffer.append(';')
                  .append(datum);
        return buffer;
    }

    /// Builds the SGR end sequence described by the `Style`.
    ///
    /// Note that the sequence is specifically built in the _exact order the styles were composed_.
    /// While technically unnecessary, this keeps the semantics consistent.
    ///
    /// The following call to `endSequence` yields `\033[22;39m`:
    /// ```java
    /// Charcoal.bold()
    ///         .red()
    ///         .endSequence();
    /// ```
    @Contract(pure = true)
    public @NotNull String endSequence() {
        var buffer = new StringBuilder();
        buffer.append(ESCAPE)
                .append('[');
        return this.appendEnd(buffer)
                .append('m')
                .toString();
    }

    @ApiStatus.Internal
    private @NotNull StringBuilder appendEnd(@NotNull StringBuilder buffer) {
        if (this.parent != null) {
            this.parent.appendEnd(buffer);
            buffer.append(';');
        }
        buffer.append(this.sequence[1]);
        return buffer;
    }

    @Override
    public String toString() {
        return this.apply("...");
    }
}
