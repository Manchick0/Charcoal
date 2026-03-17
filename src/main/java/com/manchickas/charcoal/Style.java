package com.manchickas.charcoal;

import com.manchickas.charcoal.style.Hyperlink;
import com.manchickas.charcoal.style.SGR;
import org.jetbrains.annotations.*;

import java.net.URI;
import java.util.Objects;
import java.util.function.Consumer;

public abstract class Style {

    protected final @Nullable Style parent;

    public Style(@Nullable Style parent) {
        this.parent = parent;
    }

    public @NotNull Style bold() {
        return SGR.BOLD.apply(this);
    }

    public @NotNull String bold(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return SGR.BOLD.apply(this).wrap(sqc);
    }

    public @NotNull String bold(char c) {
        return SGR.BOLD.apply(this).wrap(c);
    }

    public @NotNull Style dim() {
        return SGR.DIM.apply(this);
    }

    public @NotNull String dim(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return SGR.DIM.apply(this).wrap(sqc);
    }

    public @NotNull String dim(char c) {
        return SGR.DIM.apply(this).wrap(c);
    }

    public @NotNull Style italic() {
        return SGR.ITALIC.apply(this);
    }

    public @NotNull String italic(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return SGR.ITALIC.apply(this).wrap(sqc);
    }

    public @NotNull String italic(char c) {
        return SGR.ITALIC.apply(this).wrap(c);
    }

    public @NotNull Style underline() {
        return SGR.UNDERLINE.apply(this);
    }

    public @NotNull String underline(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return SGR.UNDERLINE.apply(this).wrap(sqc);
    }

    public @NotNull String underline(char c) {
        return SGR.UNDERLINE.apply(this).wrap(c);
    }

    public @NotNull Style strikethrough() {
        return SGR.STRIKETHROUGH.apply(this);
    }

    public @NotNull String strikethrough(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return SGR.STRIKETHROUGH.apply(this).wrap(sqc);
    }

    public @NotNull String strikethrough(char c) {
        return SGR.STRIKETHROUGH.apply(this).wrap(c);
    }

    public @NotNull Style black() {
        return SGR.BLACK.apply(this);
    }

    public @NotNull String black(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return SGR.BLACK.apply(this).wrap(sqc);
    }

    public @NotNull String black(char c) {
        return SGR.BLACK.apply(this).wrap(c);
    }

    public @NotNull Style red() {
        return SGR.RED.apply(this);
    }

    public @NotNull String red(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return SGR.RED.apply(this).wrap(sqc);
    }

    public @NotNull String red(char c) {
        return SGR.RED.apply(this).wrap(c);
    }

    public @NotNull Style green() {
        return SGR.GREEN.apply(this);
    }

    public @NotNull String green(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return SGR.GREEN.apply(this).wrap(sqc);
    }

    public @NotNull String green(char c) {
        return SGR.GREEN.apply(this).wrap(c);
    }

    public @NotNull Style yellow() {
        return SGR.YELLOW.apply(this);
    }

    public @NotNull String yellow(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return SGR.YELLOW.apply(this).wrap(sqc);
    }

    public @NotNull String yellow(char c) {
        return SGR.YELLOW.apply(this).wrap(c);
    }

    public @NotNull Style blue() {
        return SGR.BLUE.apply(this);
    }

    public @NotNull String blue(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return SGR.BLUE.apply(this).wrap(sqc);
    }

    public @NotNull String blue(char c) {
        return SGR.BLUE.apply(this).wrap(c);
    }

    public @NotNull Style purple() {
        return SGR.MAGENTA.apply(this);
    }

    public @NotNull String purple(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return SGR.MAGENTA.apply(this).wrap(sqc);
    }

    public @NotNull String purple(char c) {
        return SGR.MAGENTA.apply(this).wrap(c);
    }

    public @NotNull Style cyan() {
        return SGR.CYAN.apply(this);
    }

    public @NotNull String cyan(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return SGR.CYAN.apply(this).wrap(sqc);
    }

    public @NotNull String cyan(char c) {
        return SGR.CYAN.apply(this).wrap(c);
    }

    public @NotNull Style lightGray() {
        return SGR.WHITE.apply(this);
    }

    public @NotNull String lightGray(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return SGR.WHITE.apply(this).wrap(sqc);
    }

    public @NotNull String lightGray(char c) {
        return SGR.WHITE.apply(this).wrap(c);
    }

    public @NotNull Style gray() {
        return SGR.BLACK_BRIGHT.apply(this);
    }

    public @NotNull String gray(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return SGR.BLACK_BRIGHT.apply(this).wrap(sqc);
    }

    public @NotNull String gray(char c) {
        return SGR.BLACK_BRIGHT.apply(this).wrap(c);
    }

    public @NotNull Style brightRed() {
        return SGR.RED_BRIGHT.apply(this);
    }

    public @NotNull String brightRed(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return SGR.RED_BRIGHT.apply(this).wrap(sqc);
    }

    public @NotNull String brightRed(char c) {
        return SGR.RED_BRIGHT.apply(this).wrap(c);
    }

    public @NotNull Style brightGreen() {
        return SGR.GREEN_BRIGHT.apply(this);
    }

    public @NotNull String brightGreen(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return SGR.GREEN_BRIGHT.apply(this).wrap(sqc);
    }

    public @NotNull String brightGreen(char c) {
        return SGR.GREEN_BRIGHT.apply(this).wrap(c);
    }

    public @NotNull Style brightYellow() {
        return SGR.YELLOW_BRIGHT.apply(this);
    }

    public @NotNull String brightYellow(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return SGR.YELLOW_BRIGHT.apply(this).wrap(sqc);
    }

    public @NotNull String brightYellow(char c) {
        return SGR.YELLOW_BRIGHT.apply(this).wrap(c);
    }

    public @NotNull Style brightBlue() {
        return SGR.BLUE_BRIGHT.apply(this);
    }

    public @NotNull String brightBlue(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return SGR.BLUE_BRIGHT.apply(this).wrap(sqc);
    }

    public @NotNull String brightBlue(char c) {
        return SGR.BLUE_BRIGHT.apply(this).wrap(c);
    }

    public @NotNull Style pink() {
        return SGR.MAGENTA_BRIGHT.apply(this);
    }

    public @NotNull String pink(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return SGR.MAGENTA_BRIGHT.apply(this).wrap(sqc);
    }

    public @NotNull String pink(char c) {
        return SGR.MAGENTA_BRIGHT.apply(this).wrap(c);
    }

    public @NotNull Style brightCyan() {
        return SGR.CYAN_BRIGHT.apply(this);
    }

    public @NotNull String brightCyan(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return SGR.CYAN_BRIGHT.apply(this).wrap(sqc);
    }

    public @NotNull String brightCyan(char c) {
        return SGR.CYAN_BRIGHT.apply(this).wrap(c);
    }

    public @NotNull Style white() {
        return SGR.WHITE_BRIGHT.apply(this);
    }

    public @NotNull String white(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return SGR.WHITE_BRIGHT.apply(this).wrap(sqc);
    }

    public @NotNull String white(char c) {
        return SGR.WHITE_BRIGHT.apply(this).wrap(c);
    }

    public @NotNull Style foreground(int color) {
        return SGR.FOREGROUND.apply(this, color);
    }

    public @NotNull String foreground(int color, @NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return SGR.FOREGROUND.apply(this, color).wrap(sqc);
    }

    public @NotNull String foreground(int color, char c) {
        return SGR.FOREGROUND.apply(this, color).wrap(c);
    }

    public @NotNull Style background(int color) {
        return SGR.BACKGROUND.apply(this, color);
    }

    public @NotNull String background(int color, @NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return SGR.BACKGROUND.apply(this, color).wrap(sqc);
    }

    public @NotNull String background(int color, char c) {
        return SGR.BACKGROUND.apply(this, color).wrap(c);
    }

    public @NotNull Style link(@NotNull URI reference) {
        Objects.requireNonNull(reference);
        return new Hyperlink(this, reference);
    }

    public @NotNull String link(@NotNull URI reference, @NotNull CharSequence sqc) {
        Objects.requireNonNull(reference);
        Objects.requireNonNull(sqc);
        return new Hyperlink(this, reference).wrap(sqc);
    }

    public @NotNull String link(@NotNull URI reference, char c) {
        Objects.requireNonNull(reference);
        return new Hyperlink(this, reference).wrap(c);
    }

    /// Wraps the provided `CharSequence` in the escape sequence(s) described
    /// by this `Style` chain.
    ///
    /// The following call to `wrap` yields `\ESC[91mHello, Marie!\ESC[39m`:
    ///
    /// ```java
    /// Charcoal.brightRed().wrap("Hello, Marie!");
    /// ```
    public @NotNull String wrap(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return this.wrap(new StringBuilder(), sqc)
                .toString();
    }

    /// Wraps the provided `char` in the escape sequence(s) described
    /// by this `Style` chain.
    ///
    /// The following call to `wrap` yields `\ESC[91mM\ESC[39m`:
    ///
    /// ```java
    /// Charcoal.brightRed().wrap('M');
    /// ```
    public @NotNull String wrap(char c) {
        return this.wrap(new StringBuilder(), c)
                .toString();
    }

    /// Invokes the provided `Consumer` to populate the provided `StringBuilder`,
    /// surrounding it with the escape sequences(s) described by this `Style` chain.
    ///
    /// The following call to `wrap` appends `\ESC[91mMarie\ESC[39m` to the provided `buffer`:
    ///
    /// ```java
    /// Charcoal.brightRed().wrap(
    ///     new StringBuilder("Hello, ")
    ///     buffer -> buffer.append("Marie")
    /// ).append('!');
    /// ```
    public @NotNull StringBuilder wrap(@NotNull StringBuilder buffer, @NotNull Consumer<StringBuilder> f) {
        Objects.requireNonNull(buffer);
        Objects.requireNonNull(f);
        f.accept(this.begin(buffer));
        return this.end(buffer);
    }

    /// Appends the provided `CharSequence` to the provided `StringBuilder`, surrounding
    /// it with the escape sequences(s) described by this `Style` chain.
    ///
    /// The following call to `wrap` appends `\ESC[91mMarie\ESC[39m` to the provided `buffer`:
    ///
    /// ```java
    /// Charcoal.brightRed().wrap(
    ///     new StringBuilder("Hello, "),
    ///     "Marie"
    /// ).append('!');
    /// ```
    public @NotNull StringBuilder wrap(@NotNull StringBuilder buffer, @NotNull CharSequence sqc) {
        Objects.requireNonNull(buffer);
        Objects.requireNonNull(sqc);
        return this.end(this.begin(buffer).append(sqc));
    }

    /// Appends the provided `char` to the provided `StringBuilder`,
    /// surrounding it with the escape sequence(s) described by this Style chain.
    ///
    /// The following call to `wrap` appends `\ESC[91mM\ESC[39m` to the provided `buffer`:
    /// ```java
    /// Charcoal.brightRed().wrap(
    ///     new StringBuilder("Hello, "),
    ///     'M'
    /// ).append('!');
    /// ```
    public @NotNull StringBuilder wrap(@NotNull StringBuilder buffer, char c) {
        Objects.requireNonNull(buffer);
        return this.end(this.begin(buffer).append(c));
    }

    /// Computes the begin escape sequence(s) described by this `Style` chain.
    ///
    /// The following call to `beginSequence` yields `\ESC[91m\ESC[1m`:
    ///
    /// ```java
    /// Charcoal.brightRed()
    ///     .bold()
    ///     .beginSequence();
    /// ```
    public @NotNull String beginSequence() {
        return this.begin(new StringBuilder())
                .toString();
    }

    /// Computes the end escape sequence(s) needed to end this `Style` chain.
    ///
    /// The following call to `endSequence` yields `\ESC[39m\ESC[22m`:
    ///
    /// ```java
    /// Charcoal.brightRed()
    ///     .bold()
    ///     .endSequence();
    /// ```
    public @NotNull String endSequence() {
        return this.end(new StringBuilder())
                .toString();
    }

    public abstract @NotNull StringBuilder begin(@NotNull StringBuilder buffer);

    public abstract @NotNull StringBuilder end(@NotNull StringBuilder buffer);

    @Override
    public @NotNull String toString() {
        return this.wrap("...");
    }
}
