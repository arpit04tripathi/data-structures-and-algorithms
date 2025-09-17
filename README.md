# data-structures-and-algorithms

Gradle based repository to practice data-structures and algorithms in `Java` language.

Setup
- Java `24` [managed by sdkman](.sdkmanrc)
- Gradle `8.14.3` with [gradle wrapper](gradle/wrapper/gradle-wrapper.properties) - [Compatibility Matrix](https://docs.gradle.org/current/userguide/compatibility.html#java_runtime)

Structured in 3 Modules
- `common` : common definitions for nodes
- `data-structures` : data structures using nodes defined in common
- `algorithms` : algorithms using nodes defined in common

# setup

```bash
# install and use java version defined in .sdkmanrc
sdk env
sdk current
```
```bash
# list projects
./gradlew projects -q
```

run main classes to check
```bash
./gradlew run
./gradlew :data-structures:run
./gradlew :algorithms:run
```

```bash
./gradlew :common:dependencies
```

`buildSrc` has the plugins where we have defined common dependencies like lombok.
```bash
# we can also pass the variable as parameter
./gradlew clean build -PlombokVersion=1.18.30
```
