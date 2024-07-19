# data-structures-and-algorithms

Gradle based repository to practice data-structures and algorithms in `Java` language.

Structured in 3 Modules
- `common` : common definitions for nodes
- `data-structures` : data structures using nodes defined in common
- `algorithms` : algorithms using nodes defined in common

# setup

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
