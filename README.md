# Scala

This is a Scala engine used to launch Scala apps on [Microbox](http://microbox.cloud).

## Usage
To use the Scala engine, specify `scala` as your `engine` in your boxfile.yml.

```yaml
run.config:
  engine: scala
```

## Build Process
When preparing your application for deploy, this engine compiles code by doing the following:

- `sbt compile stage`

*Heads Up:* This engine assumes you have [sbt-native-packager](https://github.com/sbt/sbt-native-packager/blob/master/README.md) configured.

## Basic Configuration Options

This engine exposes configuration options through the [boxfile.yml](https://docs.microbox.cloud/app-config/boxfile/), a yaml config file used to provision and configure your app's infrastructure when using Microbox.


#### Overview of Basic Boxfile Configuration Options
```yaml
run.config:
  engine.config:
    # Java Settings
    java_runtime: oracle-jdk8
```

### Java Settings
The following setting allows you to define your Java runtime environment.

---

#### java_runtime
Specifies which Java runtime and version to use. The following runtimes are available:

- openjdk8
- sun-jdk6
- sun-jdk7
- oracle-jdk8

```yaml
run.config:
  engine.config:
    java_runtime: oracle-jdk8
```

---

## Help & Support
This is a Scala engine provided by [Microbox](http://microbox.cloud). If you need help with this engine, you can reach out to us in the [Microbox Discord](https://discord.gg/MCDdHfy). If you are running into an issue with the engine, feel free to [create a new issue on this project](https://github.com/mu-box/microbox-engine-scala/issues/new).
