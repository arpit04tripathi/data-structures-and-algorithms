# data-structures-and-algorithms

Gradle based repository to practice data-structures and algorithms in `Java` language.

Setup
- Java `24` [managed by sdkman](.sdkmanrc)
- Gradle `9.3.1` with [gradle wrapper](gradle/wrapper/gradle-wrapper.properties) - [Compatibility Matrix](https://docs.gradle.org/current/userguide/compatibility.html#java_runtime)

Structured in 3 Modules
- `common` : common definitions for nodes
- `data-structures` : data structures using nodes defined in common
- `algorithms` : algorithms using nodes defined in common

# setup

```bash
scripts/localhost.sh git;
scripts/localhost.sh install;
```
```bash
scripts/localhost.sh list;
```

`buildSrc` has the plugins where we have defined common dependencies like lombok.
```bash
# we can also pass the variable as parameter
./gradlew clean build -PlombokVersion=1.18.42
```

```bash
./gradlew :common:dependencies
```

run main classes to check
```bash
./gradlew run
./gradlew :data-structures:run
./gradlew :algorithms:run
```
