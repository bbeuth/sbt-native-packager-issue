# universal:packageZipTarball with annotations issue

## Usage

Compilation success:

```
./sbt clean package
```

Compilation error:

```
./sbt clean universal:packageZipTarball
```

Causes compilation error
```
[info] Compiling 1 Scala source to /sbt-native-packager-issue/module/target/scala-2.10/classes...
[error] /sbt-native-packager-issue/module/src/main/scala/Annotated.scala:3: annotation argument needs to be a constant; found: Constants.Unchecked
[error]   @SuppressWarnings(Array(Constants.Unchecked))
[error]                                     ^

```