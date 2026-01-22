![Charcoal Banner](./banner.png)

# Charcoal 🖍

Charcoal is a tiny library for working with SGR (Set Graphic Rendition) escape sequences in Java. It provides
an intuitive chainable API for building up a `Style`, which can then be applied to a `String`
to build a final result:

```java
void main(String[] args) {
    IO.println(Charcoal.brightRed().bold("Hello, world!"));
}
```

To include Charcoal in your project, put the following into your respective build script.

```kts
dependencies {
    implementation("com.manchickas:charcoal:${project.version}")
}
```

```xml
<dependency>
    <groupId>com.manchickas</groupId>
    <artifactId>charcoal</artifactId>
    <version>${project.version}</version>
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
String result = Charcoal.brightRed()
        .underline()
        .bold("Caution!"); // ESC[91;4;1mCaution!ESC[39;24;22m
```