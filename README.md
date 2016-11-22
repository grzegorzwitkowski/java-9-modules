# Java 9 modules

## compile

```
javac -d build/com.greetings $(find src/ -name '*.java')
```

## run

```
java --module-path build/ -m com.greetings/com.greetings.Main
```
