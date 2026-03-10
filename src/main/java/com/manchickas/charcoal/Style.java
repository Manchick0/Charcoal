package com.manchickas.charcoal;

import com.manchickas.charcoal.style.Hyperlink;
import com.manchickas.charcoal.style.SGR;
import org.jetbrains.annotations.*;

import java.io.IOException;
import java.net.URI;
import java.util.Objects;

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
        return SGR.BOLD.apply(this).apply(sqc);
    }

    public @NotNull Style dim() {
        return SGR.DIM.apply(this);
    }

    public @NotNull String dim(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return SGR.DIM.apply(this).apply(sqc);
    }

    public @NotNull Style italic() {
        return SGR.ITALIC.apply(this);
    }

    public @NotNull String italic(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return SGR.ITALIC.apply(this).apply(sqc);
    }

    public @NotNull Style underline() {
        return SGR.UNDERLINE.apply(this);
    }

    public @NotNull String underline(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return SGR.UNDERLINE.apply(this).apply(sqc);
    }

    public @NotNull Style strikethrough() {
        return SGR.STRIKETHROUGH.apply(this);
    }

    public @NotNull String strikethrough(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return SGR.STRIKETHROUGH.apply(this).apply(sqc);
    }

    public @NotNull Style black() {
        return SGR.BLACK.apply(this);
    }

    public @NotNull String black(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return SGR.BLACK.apply(this).apply(sqc);
    }

    public @NotNull Style red() {
        return SGR.RED.apply(this);
    }

    public @NotNull String red(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return SGR.RED.apply(this).apply(sqc);
    }

    public @NotNull Style green() {
        return SGR.GREEN.apply(this);
    }

    public @NotNull String green(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return SGR.GREEN.apply(this).apply(sqc);
    }

    public @NotNull Style yellow() {
        return SGR.YELLOW.apply(this);
    }

    public @NotNull String yellow(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return SGR.YELLOW.apply(this).apply(sqc);
    }

    public @NotNull Style blue() {
        return SGR.BLUE.apply(this);
    }

    public @NotNull String blue(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return SGR.BLUE.apply(this).apply(sqc);
    }

    public @NotNull Style magenta() {
        return SGR.MAGENTA.apply(this);
    }

    public @NotNull String magenta(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return SGR.MAGENTA.apply(this).apply(sqc);
    }

    public @NotNull Style cyan() {
        return SGR.CYAN.apply(this);
    }

    public @NotNull String cyan(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return SGR.CYAN.apply(this).apply(sqc);
    }

    public @NotNull Style white() {
        return SGR.WHITE.apply(this);
    }

    public @NotNull String white(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return SGR.WHITE.apply(this).apply(sqc);
    }

    public @NotNull Style blackBright() {
        return SGR.BLACK_BRIGHT.apply(this);
    }

    public @NotNull String blackBright(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return SGR.BLACK_BRIGHT.apply(this).apply(sqc);
    }

    public @NotNull Style redBright() {
        return SGR.RED_BRIGHT.apply(this);
    }

    public @NotNull String redBright(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return SGR.RED_BRIGHT.apply(this).apply(sqc);
    }

    public @NotNull Style greenBright() {
        return SGR.GREEN_BRIGHT.apply(this);
    }

    public @NotNull String greenBright(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return SGR.GREEN_BRIGHT.apply(this).apply(sqc);
    }

    public @NotNull Style yellowBright() {
        return SGR.YELLOW_BRIGHT.apply(this);
    }

    public @NotNull String yellowBright(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return SGR.YELLOW_BRIGHT.apply(this).apply(sqc);
    }

    public @NotNull Style blueBright() {
        return SGR.BLUE_BRIGHT.apply(this);
    }

    public @NotNull String blueBright(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return SGR.BLUE_BRIGHT.apply(this).apply(sqc);
    }

    public @NotNull Style magentaBright() {
        return SGR.MAGENTA_BRIGHT.apply(this);
    }

    public @NotNull String magentaBright(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return SGR.MAGENTA_BRIGHT.apply(this).apply(sqc);
    }

    public @NotNull Style cyanBright() {
        return SGR.CYAN_BRIGHT.apply(this);
    }

    public @NotNull String cyanBright(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return SGR.CYAN_BRIGHT.apply(this).apply(sqc);
    }

    public @NotNull Style whiteBright() {
        return SGR.WHITE_BRIGHT.apply(this);
    }

    public @NotNull String whiteBright(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return SGR.WHITE_BRIGHT.apply(this).apply(sqc);
    }

    public @NotNull Style foreground(int color) {
        return SGR.FOREGROUND.apply(this, color);
    }

    public @NotNull String foreground(int color, @NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return SGR.FOREGROUND.apply(this, color).apply(sqc);
    }

    public @NotNull Style background(int color) {
        return SGR.BACKGROUND.apply(this, color);
    }

    public @NotNull String background(int color, @NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return SGR.BACKGROUND.apply(this, color).apply(sqc);
    }

    public @NotNull Style link(@NotNull URI reference) {
        return new Hyperlink(this, reference);
    }

    public @NotNull String link(@NotNull URI reference, @NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        return new Hyperlink(this, reference).apply(sqc);
    }

    public @NotNull String apply(@NotNull CharSequence sqc) {
        Objects.requireNonNull(sqc);
        var buffer = new StringBuilder();
        return this.append(buffer, sqc)
                .toString();
    }

    public @NotNull StringBuilder append(@NotNull StringBuilder buffer, @NotNull CharSequence sqc) {
        Objects.requireNonNull(buffer);
        Objects.requireNonNull(sqc);
        this.begin(buffer).append(sqc);
        return this.end(buffer);
    }

    public <A extends Appendable> @NotNull A append(@NotNull A buffer, @NotNull CharSequence sqc) throws IOException {
        Objects.requireNonNull(buffer);
        Objects.requireNonNull(sqc);
        this.begin(buffer).append(sqc);
        return this.end(buffer);
    }

    public @NotNull String beginSequence() {
        var buffer = new StringBuilder();
        return this.begin(buffer)
                .toString();
    }

    public @NotNull String endSequence() {
        var buffer = new StringBuilder();
        return this.end(buffer)
                .toString();
    }

    public @NotNull StringBuilder begin(@NotNull StringBuilder buffer) {
        try {
            return (StringBuilder) this.begin((Appendable) buffer);
        } catch (IOException e) {
            throw new AssertionError();
        }
    }

    public @NotNull StringBuilder end(@NotNull StringBuilder buffer) {
        try {
            return (StringBuilder) this.end((Appendable) buffer);
        } catch (IOException e) {
            throw new AssertionError();
        }
    }

    @Contract("_ -> param1")
    public abstract <A extends Appendable> @NotNull A begin(@NotNull A buffer) throws IOException;

    @Contract("_ -> param1")
    public abstract <A extends Appendable> @NotNull A end(@NotNull A buffer) throws IOException;

    @Override
    public @NotNull String toString() {
        return this.apply("...");
    }
}
