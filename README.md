![Charcoal Banner](./banner.png)

# Charcoal 🖍

Charcoal is a tiny library for working with SGR (Set Graphic Rendition) escape sequences in Java. It provides
an intuitive chainable API for building up a `Style`, which can then be applied to a `String`
to build a final result:

```java
void main(String[] args) {
    IO.println(Charcoal.brightYellow().bold("Hello, Marie!"));
}
```

To include Charcoal in your project, depend on it in your `build.gradle`/`pom.xml`.

```kts
dependencies {
    implementation("com.manchickas:charcoal:2.0.0")
}
```

```xml
<dependency>
    <groupId>com.manchickas</groupId>
    <artifactId>charcoal</artifactId>
    <version>2.0.0</version>
</dependency>
```

## Usage

The core of Charcoal is the `Style` class, which is used to describe a specific SGR sequence programatically. It can be
built in a builder-like manner, and then applied to a `String` to produce a final result.

To start composing a `Style`, use the `Charcoal` entrypoint:

```java
Style style = Charcoal.brightRed()
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

It might be desired to disable Charcoal either partially or completely. To disable Charcoal entirely and VM-wide,
use the `-Dcharcoal=disabled` JVM flag. Alternatively, Charcoal lets you override the flag
selectively **per-thread**. To do so, use `Charcoal.disable()` and `Charcoal.enable()` methods.

When disabled, any call to `Style.apply(String)` will have no effect:

```java
Charcoal.disable();
System.out.println(Charcoal.brightRed("Caution... well, not really.")); // Caution... well, not really.
CompletableFuture.runAsync(() -> {
    System.out.println(Charcoal.brightRed("Caution!")); // ESC[91mCaution!ESC[39m
}).join();
```
