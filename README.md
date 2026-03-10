![Charcoal Banner](./banner.png)

# Charcoal 🖍

Charcoal is a tiny library for working with SGR (Set Graphic Rendition) escape sequences in Java. It provides
an intuitive chainable API for building up a `Style`, which can then be applied to a `String`
to build a final result:

```java
void main(String[] args) {
    IO.println(Charcoal.yellowBright().bold("Hello, Marie!"));
}
```

To include Charcoal in your project, depend on it in your `build.gradle`/`pom.xml`.

```kts
dependencies {
    implementation("com.manchickas:charcoal:3.0.0")
}
```

```xml
<dependency>
    <groupId>com.manchickas</groupId>
    <artifactId>charcoal</artifactId>
    <version>3.0.0</version>
</dependency>
```

## Usage

The core of Charcoal is the `Style` class, which is used to describe a specific SGR sequence programatically. It can be
built in a builder-like manner, and then applied to a `String` to produce a final result.

To start composing a `Style`, use the `Charcoal` entrypoint:

```java
Style style = Charcoal.redBright()
        .underline()
        .bold();
```

Composing a `Style` creates a new `Style` instance, keeping the original one untouched. That means you can easily
reuse existing `Style` instances multiple times, if needed.

To apply a `Style` to a `String`, use the `apply(String)` method, which wraps the provided `String` in the appropriate
SGR escape sequences:

```java
String result = style.apply("Caution!"); // ESC[91;4;1mCaution!ESC[39;24;22m
```

Since it's much more common for a `Style` to only ever be used once, Charcoal provides
overloads for all of its composition methods that accept a `String` directly. These
let you save yourself an `apply()` call:

```java
String result = Charcoal.underline()
        .foreground(0x708090)
        .bold("How convenient!"); // ESC[38;2;112;128;144;4;1mCaution!ESC[39;24;22m
```

## Disabling Charcoal

By default, Charcoal attempts to detect whether it's running in a terminal and decide on its state accordingly.
You may, however, wish to override this behavior manually. The Charcoal is controlled through the `-Dcharcoal`
JVM flag.

| Flag       | Aliases                   | State                                                                                                             |
|------------|---------------------------|-------------------------------------------------------------------------------------------------------------------|
| `disabled` | `disable`, `false`, `off` | Charcoal is globally disabled. Style application becomes a no-op.                                                 |
| `enabled`  | `enable`, `true`, `on`    | Charcoal is globally enabled. Style application always occurs.                                                    |
| `color`    | `colors`, `sgr`           | Charcoal is only enabled for SGR sequences. More advanced style applications, such as hyperlinks, become a no-op. |
| `default`  | `auto`                    | The default. The state of Charcoal is determined by the state of the terminal.                                    |
