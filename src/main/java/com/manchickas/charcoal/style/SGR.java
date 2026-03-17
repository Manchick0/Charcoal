package com.manchickas.charcoal.style;

import com.manchickas.charcoal.Charcoal;
import com.manchickas.charcoal.Style;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Function;

public final class SGR extends Style {

    public static final @NotNull Function<@Nullable Style, @NotNull SGR> BOLD          = parent -> new SGR(parent, new int[] { 1 }, new int[] { 22 });
    public static final @NotNull Function<@Nullable Style, @NotNull SGR> DIM           = parent -> new SGR(parent, new int[] { 2 }, new int[] { 22 });
    public static final @NotNull Function<@Nullable Style, @NotNull SGR> ITALIC        = parent -> new SGR(parent, new int[] { 3 }, new int[] { 23 });
    public static final @NotNull Function<@Nullable Style, @NotNull SGR> UNDERLINE     = parent -> new SGR(parent, new int[] { 4 }, new int[] { 24 });
    public static final @NotNull Function<@Nullable Style, @NotNull SGR> STRIKETHROUGH = parent -> new SGR(parent, new int[] { 9 }, new int[] { 29 });

    public static final @NotNull Function<@Nullable Style, @NotNull SGR> BLACK         = parent -> new SGR(parent, new int[] { 30 }, new int[] { 39 });
    public static final @NotNull Function<@Nullable Style, @NotNull SGR> RED           = parent -> new SGR(parent, new int[] { 31 }, new int[] { 39 });
    public static final @NotNull Function<@Nullable Style, @NotNull SGR> GREEN         = parent -> new SGR(parent, new int[] { 32 }, new int[] { 39 });
    public static final @NotNull Function<@Nullable Style, @NotNull SGR> YELLOW        = parent -> new SGR(parent, new int[] { 33 }, new int[] { 39 });
    public static final @NotNull Function<@Nullable Style, @NotNull SGR> BLUE          = parent -> new SGR(parent, new int[] { 34 }, new int[] { 39 });
    public static final @NotNull Function<@Nullable Style, @NotNull SGR> MAGENTA       = parent -> new SGR(parent, new int[] { 35 }, new int[] { 39 });
    public static final @NotNull Function<@Nullable Style, @NotNull SGR> CYAN          = parent -> new SGR(parent, new int[] { 36 }, new int[] { 39 });
    public static final @NotNull Function<@Nullable Style, @NotNull SGR> WHITE         = parent -> new SGR(parent, new int[] { 37 }, new int[] { 39 });
    public static final @NotNull Function<@Nullable Style, @NotNull SGR> BLACK_BRIGHT  = parent -> new SGR(parent, new int[] { 90 }, new int[] { 39 });
    public static final @NotNull Function<@Nullable Style, @NotNull SGR> RED_BRIGHT    = parent -> new SGR(parent, new int[] { 91 }, new int[] { 39 });
    public static final @NotNull Function<@Nullable Style, @NotNull SGR> GREEN_BRIGHT  = parent -> new SGR(parent, new int[] { 92 }, new int[] { 39 });
    public static final @NotNull Function<@Nullable Style, @NotNull SGR> YELLOW_BRIGHT = parent -> new SGR(parent, new int[] { 93 }, new int[] { 39 });
    public static final @NotNull Function<@Nullable Style, @NotNull SGR> BLUE_BRIGHT   = parent -> new SGR(parent, new int[] { 94 }, new int[] { 39 });
    public static final @NotNull Function<@Nullable Style, @NotNull SGR> MAGENTA_BRIGHT = parent -> new SGR(parent, new int[] { 95 }, new int[] { 39 });
    public static final @NotNull Function<@Nullable Style, @NotNull SGR> CYAN_BRIGHT   = parent -> new SGR(parent, new int[] { 96 }, new int[] { 39 });
    public static final @NotNull Function<@Nullable Style, @NotNull SGR> WHITE_BRIGHT  = parent -> new SGR(parent, new int[] { 97 }, new int[] { 39 });

    public static final @NotNull BiFunction<@Nullable Style, Integer, @NotNull SGR> FOREGROUND = (parent, color) -> new SGR(parent, SGR.colorSequence(38, color), new int[] { 39 });
    public static final @NotNull BiFunction<@Nullable Style, Integer, @NotNull SGR> BACKGROUND  = (parent, color) -> new SGR(parent, SGR.colorSequence(48, color), new int[] { 49 });

    private final int @NotNull[] beginSequence;
    private final int @NotNull[] endSequence;

    public SGR(@Nullable Style parent,
               int @NotNull[] beginSequence,
               int @NotNull[] endSequence) {
        super(parent);
        this.beginSequence = Objects.requireNonNull(beginSequence);
        this.endSequence = Objects.requireNonNull(endSequence);
    }

    public static int @NotNull[] colorSequence(int begin, int color) {
        return new int[] {
                begin, 2,
                (color >> 16) & 0xFF,
                (color >> 8) & 0xFF,
                color & 0xFF
        };
    }

    @Override
    public @NotNull StringBuilder begin(@NotNull StringBuilder buffer) {
        if (this.parent != null)
            this.parent.begin(buffer);
        if (Charcoal.isEnabled(true)) {
            buffer.append('\033')
                    .append('[');
            for (var i = 0; i < this.beginSequence.length; i++) {
                var element = this.beginSequence[i];
                if (i > 0)
                    buffer.append(';');
                buffer.append(element);
            }
            buffer.append('m');
        }
        return buffer;
    }

    @Override
    public @NotNull StringBuilder end(@NotNull StringBuilder buffer) {
        if (Charcoal.isEnabled(true)) {
            buffer.append('\033')
                    .append('[');
            for (var i = 0; i < this.endSequence.length; i++) {
                var element = this.endSequence[i];
                if (i > 0)
                    buffer.append(';');
                buffer.append(element);
            }
            buffer.append('m');
        }
        if (this.parent != null)
            this.parent.end(buffer);
        return buffer;
    }
}
