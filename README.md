# Java 9 modules

## compile

```
javac -d build --module-source-path src $(find -name '*.java')
```

## run

```
java --module-path build/ -m com.greetings/com.greetings.Main
```
