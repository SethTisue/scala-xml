scala-xml
[![Travis](https://img.shields.io/travis/scala/scala-xml.svg)](https://travis-ci.org/scala/scala-xml)
[![latest release for 2.11](https://img.shields.io/maven-central/v/org.scala-lang.modules/scala-xml_2.11.svg?label=scala+2.11)](http://mvnrepository.com/artifact/org.scala-lang.modules/scala-xml_2.11)
[![latest release for 2.12](https://img.shields.io/maven-central/v/org.scala-lang.modules/scala-xml_2.12.svg?label=scala+2.12)](http://mvnrepository.com/artifact/org.scala-lang.modules/scala-xml_2.12)
[![latest release for 2.13.0-M1](https://img.shields.io/maven-central/v/org.scala-lang.modules/scala-xml_2.13.0-M1.svg?label=scala+2.13.0-M1)](http://mvnrepository.com/artifact/org.scala-lang.modules/scala-xml_2.13.0-M1)
[![Gitter](https://badges.gitter.im/Join+Chat.svg)](https://gitter.im/scala/scala-xml)
=========

The standard Scala XML library. Please file issues here instead of over at issues.scala-lang.org.

Since Scala 2.11, this library is a separate jar that can be omitted from Scala projects that do not use XML.
If you are cross-building a project that uses scala-xml with both Scala 2.10 and later Scala versions, take a look [this example](https://github.com/scala/scala-module-dependency-sample).

The compiler was decoupled from this particular implementation using the same approach as for comprehensions (XML syntax is desugared into a set of method calls, which unfortunately is only defined by the [implementation](https://github.com/scala/scala/blob/2.11.x/src/compiler/scala/tools/nsc/ast/parser/SymbolicXMLBuilder.scala)). Alternative implementations are welcome!

API documentation is available [here](http://www.scala-lang.org/api/current/scala-xml/scala/xml/index.html).

## Maintenance status

This library is community-maintained. The lead maintainers are [@biswanaths](https://github.com/biswanaths) and [@aaron_s_hawley](https://github.com/ashawley).

## Security best practices

The XML spec has some features that are best turned off, to avoid unsavory things like file system access, DoS attacks,... Issue [#17](https://github.com/scala/scala-xml/issues/17) tracks the recommended way of configuring the XML parser used by scala-xml to avoid these. This is by no means an exhaustive list. We'll be happy to incorporate your suggestions -- just comment on the ticket!
