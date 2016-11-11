# hello-jboss-modules-javafx
Hello World with JBoss Modules with JavaFX

### Run

```sh
java -jar jboss-modules-1.5.2.Final.jar -mp mods org.jbugkorea.app

java -jar jboss-modules-1.5.2.Final.jar -debuglog -mp mods org.jbugkorea.app

java -verbose:class -jar jboss-modules-1.5.2.Final.jar -mp mods org.jbugkorea.app

Hello!
```

```sh 
java -jar jboss-modules-1.5.2.Final.jar -deptree -mp mods org.jbugkorea.app

org.jbugkorea.app:main
└─ org.jbugkorea.hello:main
```

### JavaFX part

To understand how it was edited to support JavaFX, please read [my blog](http://fxapps.blogspot.com/2016/11/jboss-modules-with-javafx.html). 

Thanks to Ted and Anton it was possible. .

### Original Reference

* [http://arhipov.blogspot.kr/2016/05/hello-world-with-jboss-modules.html](http://arhipov.blogspot.kr/2016/05/hello-world-with-jboss-modules.html)
