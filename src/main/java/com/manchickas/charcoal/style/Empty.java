package com.manchickas.charcoal.style;

import com.manchickas.charcoal.Style;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class Empty extends Style {

    public Empty(@Nullable Style parent) {
        super(parent);
    }

    @Override
    public @NotNull StringBuilder begin(@NotNull StringBuilder buffer) {
        if (this.parent != null)
            this.parent.begin(buffer);
        return buffer;
    }

    @Override
    public @NotNull StringBuilder end(@NotNull StringBuilder buffer) {
        if (this.parent != null)
            this.parent.end(buffer);
        return buffer;
    }
}
