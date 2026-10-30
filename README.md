# data-structures-and-algorithms

Practice DSA and patterns for interview.  
Gradle based repository to practice data-structures and algorithms in `Java` language.

Setup
- Java `24` [managed by sdkman](.sdkmanrc)
- Gradle `9.3.1` with [gradle wrapper](gradle/wrapper/gradle-wrapper.properties) - [Compatibility Matrix](https://docs.gradle.org/current/userguide/compatibility.html#java_runtime)

Structured in 3 Modules
- `common` : common definitions for nodes
- `data-structures` : data structures using nodes defined in common
- `algorithms` : algorithms using nodes defined in common
- `patterns` : common patterns for DSA interview questions 

# Summary

[![IMAGE ALT TEXT HERE](https://img.youtube.com/vi/ADWPbock-7U/0.jpg)](https://www.youtube.com/watch?v=ADWPbock-7U)

- Data Structures
  - Linear
    - Array
    - Linked List
    - Stack
    - Queue
  - Non-Linear
    - Tree
    - BST
    - Heap : Min Heap, Max Heap
    - Balanced Tree : AVL Tree, Red Black Tree
    - Graph
    - Trie
    - Hash Table
    - Skip List
    - Disjoint Set
    - Segment Tree
    - Fenwick Tree
    - Suffix Tree
    - Suffix Array
    - B-Tree
    - B+ Tree
    - Bloom Filter
    - Counting Bloom Filter
    - Cuckoo Filter
    - Quotient Filter
    - XOR Filter
    - Skip Graph
    - K-D Tree
    - R-Tree
    - Quad Tree
    - Octree
    - Rope
    - Suffix Array
    - Suffix Tree
    - Ternary Search Tree
- Algorithms
  - Searching
  - Sorting ()
  - Sorting ()
- Patterns
  - 2 Sum
  - 3 Sum
  - Sliding Window

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
./gradlew :patterns:run
```

