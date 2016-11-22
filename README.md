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

## create module jar files

```
mkdir build/lib

jar --create --file=build/lib/org.astro@1.0.jar --module-version =1.0 -C build/org.astro .

jar --create --file=build/lib/com.greetings.jar --main-class=com .greetings.Main -C build/com.greetings
```
