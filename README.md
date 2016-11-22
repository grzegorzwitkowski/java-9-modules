# Java 9 modules

## compile

```
javac -d build/org.astro src/org.astro/org/astro/World.java src/ org.astro/module-info.java
javac --module-path build/ -d build/com.greetings src/com.greeti ngs/module-info.java src/com.greetings/com/greetings/Main.java
```

or in single command

```
javac -d build --module-source-path src $(find -name '*.java')
```

## run

```
java --module-path build/ -m com.greetings/com.greetings.Main
```
