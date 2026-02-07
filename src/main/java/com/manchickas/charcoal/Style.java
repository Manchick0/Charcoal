package com.manchickas.charcoal;

import com.manchickas.Charcoal;
import org.jetbrains.annotations.*;

import java.util.Objects;

public abstract sealed class Style {

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

    protected final @Nullable Style parent;

    public Style(@Nullable Style parent) {
        this.parent = parent;
    }

    public @NotNull Style bold() {
        return new Style.Fixed(this, Style.BOLD);
    }

    public @NotNull String bold(@NotNull String content) {
        Objects.requireNonNull(content);
        return new Style.Fixed(this, Style.BOLD)
                .apply(content);
    }

    public @NotNull Style dim() {
        return new Style.Fixed(this, Style.DIM);
    }

    public @NotNull String dim(@NotNull String content) {
        Objects.requireNonNull(content);
        return new Style.Fixed(this, Style.DIM)
                .apply(content);
    }

    public @NotNull Style italic() {
        return new Style.Fixed(this, Style.ITALIC);
    }

    public @NotNull String italic(@NotNull String content) {
        Objects.requireNonNull(content);
        return new Style.Fixed(this, Style.ITALIC)
                .apply(content);
    }

    public @NotNull Style underline() {
        return new Style.Fixed(this, Style.UNDERLINE);
    }

    public @NotNull String underline(@NotNull String content) {
        Objects.requireNonNull(content);
        return new Style.Fixed(this, Style.UNDERLINE)
                .apply(content);
    }

    public @NotNull Style blinking() {
        return new Style.Fixed(this, Style.BLINK);
    }

    public @NotNull String blinking(@NotNull String content) {
        Objects.requireNonNull(content);
        return new Style.Fixed(this, Style.BLINK)
                .apply(content);
    }

    public @NotNull Style blinkingRapidly() {
        return new Style.Fixed(this, Style.RAPID_BLINK);
    }

    public @NotNull String blinkingRapidly(@NotNull String content) {
        Objects.requireNonNull(content);
        return new Style.Fixed(this, Style.RAPID_BLINK)
                .apply(content);
    }

    public @NotNull Style strikeThrough() {
        return new Style.Fixed(this, Style.STRIKE_THROUGH);
    }

    public @NotNull String strikeThrough(@NotNull String content) {
        Objects.requireNonNull(content);
        return new Style.Fixed(this, Style.STRIKE_THROUGH)
                .apply(content);
    }

    public @NotNull Style black() {
        return new Style.Fixed(this, Style.BLACK);
    }

    public @NotNull String black(@NotNull String content) {
        Objects.requireNonNull(content);
        return new Style.Fixed(this, Style.BLACK)
                .apply(content);
    }

    public @NotNull Style red() {
        return new Style.Fixed(this, Style.RED);
    }

    public @NotNull String red(@NotNull String content) {
        Objects.requireNonNull(content);
        return new Style.Fixed(this, Style.RED)
                .apply(content);
    }

    public @NotNull Style green() {
        return new Style.Fixed(this, Style.GREEN);
    }

    public @NotNull String green(@NotNull String content) {
        Objects.requireNonNull(content);
        return new Style.Fixed(this, Style.GREEN)
                .apply(content);
    }

    public @NotNull Style yellow() {
        return new Style.Fixed(this, Style.YELLOW);
    }

    public @NotNull String yellow(@NotNull String content) {
        Objects.requireNonNull(content);
        return new Style.Fixed(this, Style.YELLOW)
                .apply(content);
    }

    public @NotNull Style blue() {
        return new Style.Fixed(this, Style.BLUE);
    }

    public @NotNull String blue(@NotNull String content) {
        Objects.requireNonNull(content);
        return new Style.Fixed(this, Style.BLUE)
                .apply(content);
    }

    public @NotNull Style magenta() {
        return new Style.Fixed(this, Style.MAGENTA);
    }

    public @NotNull String magenta(@NotNull String content) {
        Objects.requireNonNull(content);
        return new Style.Fixed(this, Style.MAGENTA)
                .apply(content);
    }

    public @NotNull Style cyan() {
        return new Style.Fixed(this, Style.CYAN);
    }

    public @NotNull String cyan(@NotNull String content) {
        Objects.requireNonNull(content);
        return new Style.Fixed(this, Style.CYAN)
                .apply(content);
    }

    public @NotNull Style white() {
        return new Style.Fixed(this, Style.WHITE);
    }

    public @NotNull String white(@NotNull String content) {
        Objects.requireNonNull(content);
        return new Style.Fixed(this, Style.WHITE)
                .apply(content);
    }

    public @NotNull Style brightBlack() {
        return new Style.Fixed(this, Style.BLACK_BRIGHT);
    }

    public @NotNull String brightBlack(@NotNull String content) {
        Objects.requireNonNull(content);
        return new Style.Fixed(this, Style.BLACK_BRIGHT)
                .apply(content);
    }

    public @NotNull Style brightRed() {
        return new Style.Fixed(this, Style.RED_BRIGHT);
    }

    public @NotNull String brightRed(@NotNull String content) {
        Objects.requireNonNull(content);
        return new Style.Fixed(this, Style.RED_BRIGHT)
                .apply(content);
    }

    public @NotNull Style brightGreen() {
        return new Style.Fixed(this, Style.GREEN_BRIGHT);
    }

    public @NotNull String brightGreen(@NotNull String content) {
        Objects.requireNonNull(content);
        return new Style.Fixed(this, Style.GREEN_BRIGHT)
                .apply(content);
    }

    public @NotNull Style brightYellow() {
        return new Style.Fixed(this, Style.YELLOW_BRIGHT);
    }

    public @NotNull String brightYellow(@NotNull String content) {
        Objects.requireNonNull(content);
        return new Style.Fixed(this, Style.YELLOW_BRIGHT)
                .apply(content);
    }

    public @NotNull Style brightBlue() {
        return new Style.Fixed(this, Style.BLUE_BRIGHT);
    }

    public @NotNull String brightBlue(@NotNull String content) {
        Objects.requireNonNull(content);
        return new Style.Fixed(this, Style.BLUE_BRIGHT)
                .apply(content);
    }

    public @NotNull Style brightMagenta() {
        return new Style.Fixed(this, Style.MAGENTA_BRIGHT);
    }

    public @NotNull String brightMagenta(@NotNull String content) {
        Objects.requireNonNull(content);
        return new Style.Fixed(this, Style.MAGENTA_BRIGHT)
                .apply(content);
    }

    public @NotNull Style brightCyan() {
        return new Style.Fixed(this, Style.CYAN_BRIGHT);
    }

    public @NotNull String brightCyan(@NotNull String content) {
        Objects.requireNonNull(content);
        return new Style.Fixed(this, Style.CYAN_BRIGHT)
                .apply(content);
    }

    public @NotNull Style brightWhite() {
        return new Style.Fixed(this, Style.WHITE_BRIGHT);
    }

    public @NotNull String brightWhite(@NotNull String content) {
        Objects.requireNonNull(content);
        return new Style.Fixed(this, Style.WHITE_BRIGHT)
                .apply(content);
    }

    public @NotNull Style blackBg() {
        return new Style.Fixed(this, Style.BLACK_BG);
    }

    public @NotNull String blackBg(@NotNull String content) {
        Objects.requireNonNull(content);
        return new Style.Fixed(this, Style.BLACK_BG)
                .apply(content);
    }

    public @NotNull Style redBg() {
        return new Style.Fixed(this, Style.RED_BG);
    }

    public @NotNull String redBg(@NotNull String content) {
        Objects.requireNonNull(content);
        return new Style.Fixed(this, Style.RED_BG)
                .apply(content);
    }

    public @NotNull Style greenBg() {
        return new Style.Fixed(this, Style.GREEN_BG);
    }

    public @NotNull String greenBg(@NotNull String content) {
        Objects.requireNonNull(content);
        return new Style.Fixed(this, Style.GREEN_BG)
                .apply(content);
    }

    public @NotNull Style yellowBg() {
        return new Style.Fixed(this, Style.YELLOW_BG);
    }

    public @NotNull String yellowBg(@NotNull String content) {
        Objects.requireNonNull(content);
        return new Style.Fixed(this, Style.YELLOW_BG)
                .apply(content);
    }

    public @NotNull Style blueBg() {
        return new Style.Fixed(this, Style.BLUE_BG);
    }

    public @NotNull String blueBg(@NotNull String content) {
        Objects.requireNonNull(content);
        return new Style.Fixed(this, Style.BLUE_BG)
                .apply(content);
    }

    public @NotNull Style magentaBg() {
        return new Style.Fixed(this, Style.MAGENTA_BG);
    }

    public @NotNull String magentaBg(@NotNull String content) {
        Objects.requireNonNull(content);
        return new Style.Fixed(this, Style.MAGENTA_BG)
                .apply(content);
    }

    public @NotNull Style cyanBg() {
        return new Style.Fixed(this, Style.CYAN_BG);
    }

    public @NotNull String cyanBg(@NotNull String content) {
        Objects.requireNonNull(content);
        return new Style.Fixed(this, Style.CYAN_BG)
                .apply(content);
    }

    public @NotNull Style whiteBg() {
        return new Style.Fixed(this, Style.WHITE_BG);
    }

    public @NotNull String whiteBg(@NotNull String content) {
        Objects.requireNonNull(content);
        return new Style.Fixed(this, Style.WHITE_BG)
                .apply(content);
    }

    public @NotNull Style brightBlackBg() {
        return new Style.Fixed(this, Style.BLACK_BRIGHT_BG);
    }

    public @NotNull String brightBlackBg(@NotNull String content) {
        Objects.requireNonNull(content);
        return new Style.Fixed(this, Style.BLACK_BRIGHT_BG)
                .apply(content);
    }

    public @NotNull Style brightRedBg() {
        return new Style.Fixed(this, Style.RED_BRIGHT_BG);
    }

    public @NotNull String brightRedBg(@NotNull String content) {
        Objects.requireNonNull(content);
        return new Style.Fixed(this, Style.RED_BRIGHT_BG)
                .apply(content);
    }

    public @NotNull Style brightGreenBg() {
        return new Style.Fixed(this, Style.GREEN_BRIGHT_BG);
    }

    public @NotNull String brightGreenBg(@NotNull String content) {
        Objects.requireNonNull(content);
        return new Style.Fixed(this, Style.GREEN_BRIGHT_BG)
                .apply(content);
    }

    public @NotNull Style brightYellowBg() {
        return new Style.Fixed(this, Style.YELLOW_BRIGHT_BG);
    }

    public @NotNull String brightYellowBg(@NotNull String content) {
        Objects.requireNonNull(content);
        return new Style.Fixed(this, Style.YELLOW_BRIGHT_BG)
                .apply(content);
    }

    public @NotNull Style brightBlueBg() {
        return new Style.Fixed(this, Style.BLUE_BRIGHT_BG);
    }

    public @NotNull String brightBlueBg(@NotNull String content) {
        Objects.requireNonNull(content);
        return new Style.Fixed(this, Style.BLUE_BRIGHT_BG)
                .apply(content);
    }

    public @NotNull Style brightMagentaBg() {
        return new Style.Fixed(this, Style.MAGENTA_BRIGHT_BG);
    }

    public @NotNull String brightMagentaBg(@NotNull String content) {
        Objects.requireNonNull(content);
        return new Style.Fixed(this, Style.MAGENTA_BRIGHT_BG)
                .apply(content);
    }

    public @NotNull Style brightCyanBg() {
        return new Style.Fixed(this, Style.CYAN_BRIGHT_BG);
    }

    public @NotNull String brightCyanBg(@NotNull String content) {
        Objects.requireNonNull(content);
        return new Style.Fixed(this, Style.CYAN_BRIGHT_BG)
                .apply(content);
    }

    public @NotNull Style brightWhiteBg() {
        return new Style.Fixed(this, Style.WHITE_BRIGHT_BG);
    }

    public @NotNull String brightWhiteBg(@NotNull String content) {
        Objects.requireNonNull(content);
        return new Style.Fixed(this, Style.WHITE_BRIGHT_BG)
                .apply(content);
    }

    public @NotNull Style foreground(@Range(from = 0, to = 0xFFFFFF) int color) {
        return new Style.Truecolor.Foreground(this, Charcoal.splitColor(color));
    }

    public @NotNull String foreground(@Range(from = 0, to = 0xFFFFFF) int color, @NotNull String content) {
        Objects.requireNonNull(content);
        return new Style.Truecolor.Foreground(this, Charcoal.splitColor(color))
                .apply(content);
    }

    public @NotNull Style background(@Range(from = 0, to = 0xFFFFFF) int color) {
        return new Style.Truecolor.Background(this, Charcoal.splitColor(color));
    }

    public @NotNull String background(@Range(from = 0, to = 0xFFFFFF) int color, @NotNull String content) {
        Objects.requireNonNull(content);
        return new Style.Truecolor.Background(this, Charcoal.splitColor(color))
                .apply(content);
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
    protected abstract @NotNull StringBuilder appendBegin(@NotNull StringBuilder buffer);

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
    protected abstract @NotNull StringBuilder appendEnd(@NotNull StringBuilder buffer);

    @Override
    public String toString() {
        return this.apply("...");
    }

    public static final class Fixed extends Style {

        private byte @NotNull[] sequence;

        public Fixed(@Nullable Style parent,
                     byte @NotNull[] sequence) {
            super(parent);
            this.sequence = sequence;
        }

        @Override
        protected @NotNull StringBuilder appendBegin(@NotNull StringBuilder buffer) {
            if (this.parent != null)
                this.parent.appendBegin(buffer).append(';');
            buffer.append(this.sequence[0]);
            return buffer;
        }

        @Override
        protected @NotNull StringBuilder appendEnd(@NotNull StringBuilder buffer) {
            if (this.parent != null)
                this.parent.appendEnd(buffer).append(';');
            buffer.append(this.sequence[1]);
            return buffer;
        }
    }

    public static sealed abstract class Truecolor extends Style {

        protected final int @NotNull[] color;

        public Truecolor(@Nullable Style parent,
                         int @NotNull[] color) {
            super(parent);
            this.color = color;
        }

        public static final class Foreground extends Truecolor {

            public Foreground(
                    @Nullable Style parent,
                    int @NotNull[] color
            ) {
                super(parent, color);
            }

            @Override
            protected @NotNull StringBuilder appendBegin(@NotNull StringBuilder buffer) {
                if (this.parent != null)
                    this.parent.appendBegin(buffer).append(';');
                return buffer.append(38).append(';')
                        .append(2).append(';')
                        .append(this.color[0]).append(';')
                        .append(this.color[1]).append(';')
                        .append(this.color[2]);
            }

            @Override
            protected @NotNull StringBuilder appendEnd(@NotNull StringBuilder buffer) {
                if (this.parent != null)
                    this.parent.appendEnd(buffer).append(';');
                return buffer.append(39);
            }
        }

        public static final class Background extends Truecolor {

            public Background(
                    @Nullable Style parent,
                    int @NotNull[] color
            ) {
                super(parent, color);
            }

            @Override
            protected @NotNull StringBuilder appendBegin(@NotNull StringBuilder buffer) {
                if (this.parent != null)
                    this.parent.appendBegin(buffer).append(';');
                return buffer.append(48).append(';')
                        .append(2).append(';')
                        .append(this.color[0]).append(';')
                        .append(this.color[1]).append(';')
                        .append(this.color[2]);
            }

            @Override
            protected @NotNull StringBuilder appendEnd(@NotNull StringBuilder buffer) {
                if (this.parent != null)
                    this.parent.appendEnd(buffer).append(';');
                return buffer.append(49);
            }
        }
    }

    public static final class Empty extends Style {

        public Empty(@Nullable Style parent) {
            super(parent);
        }

        @Override
        protected @NotNull StringBuilder appendBegin(@NotNull StringBuilder buffer) {
            if (this.parent != null)
                this.parent.appendBegin(buffer);
            return buffer;
        }

        @Override
        protected @NotNull StringBuilder appendEnd(@NotNull StringBuilder buffer) {
            if (this.parent != null)
                this.parent.appendEnd(buffer);
            return buffer;
        }
    }
}
