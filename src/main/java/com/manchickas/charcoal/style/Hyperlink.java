package com.manchickas.charcoal.style;

import com.manchickas.charcoal.Charcoal;
import com.manchickas.charcoal.Style;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.net.URI;
import java.util.Objects;

public final class Hyperlink extends Style {

    private final @NotNull URI href;

    public Hyperlink(@Nullable Style parent,
                     @NotNull URI href) {
        super(parent);
        this.href = Objects.requireNonNull(href);
    }

    @Override
    public <A extends Appendable> @NotNull A begin(@NotNull A buffer) throws IOException {
        if (this.parent != null)
            this.parent.begin(buffer);
        if (Charcoal.isEnabled(false)) {
            buffer.append('\033')
                    .append(']')
                    .append('8')
                    .append(';')
                    .append(';')
                    .append(this.href.toASCIIString())
                    .append('\033')
                    .append('\\');
        }
        return buffer;
    }

    @Override
    public <A extends Appendable> @NotNull A end(@NotNull A buffer) throws IOException {
        if (Charcoal.isEnabled(false)) {
            buffer.append('\033')
                    .append(']')
                    .append('8')
                    .append(';')
                    .append(';')
                    .append('\033')
                    .append('\\');
        }
        if (this.parent != null)
            this.parent.end(buffer);
        return buffer;
    }
}
