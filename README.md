[![Build Status](https://travis-ci.org/codejanovic/java-shortcuts.svg?branch=develop)](https://travis-ci.org/codejanovic/java-shortcuts)
[![Coverage Status](https://coveralls.io/repos/github/codejanovic/java-shortcuts/badge.svg?branch=develop)](https://coveralls.io/github/codejanovic/java-shortcuts?branch=develop)
[![License](https://img.shields.io/github/license/mashape/apistatus.svg?maxAge=2592000)]()

# java-shortcuts
collection of useful shortcuts

## Maven
Release artifact
```xml
<dependency>
    <groupId>io.github.codejanovic</groupId>
    <artifactId>java-shortcuts</artifactId>
    <version>0.1.0</version>
</dependency>
```
Snapshot artifact
```xml
<dependency>
    <groupId>io.github.codejanovic</groupId>
    <artifactId>java-shortcuts</artifactId>
    <version>0.2.0-SNAPSHOT</version>
</dependency>
```
## Ok, what shortcuts do you got?
### String.format()
`String.format()` shortcut is provided by `static` `Shortcuts.f()` method. So instead of ...  
```java
final String name = "jim";
final String greeting = String.format("hello, my name is %s", name);
```
you may use the shortcut ...
```java
import static io.github.codejanovic.java.shortcuts.Shortcuts.f;

final String name = "jim";
final String greeting = f("hello, my name is %s", name);
```
### Objects.requireNonNull()
`Objects.requireNonNull()` shortcut is provided by `static` `Shortcuts.nn()` method. So instead of ...
```java
public final class SomeClass {
    private final String param;
    ...
    public SomeClass(final String param) {
       this.param = Objects.requireNonNull(param); 
    }
    ...
}
```
you may use the shortcut ...
```java
import io.github.codejanovic.java.shortcuts.Shortcuts.nn;

public final class SomeClass {
    ... 
    private final String param;
    ...
    public SomeClass(final String param) {
       this.param = nn(param); 
    }
    ...
}
```

## Contribution
This project has been created to reuse the shortcuts I created in several projects and provide them through a separate artifact. 

Feel free to contribute shortcuts you may use often in your projects and want to share, every Pull-Request is welcome and will be reviewed as soon as possible.