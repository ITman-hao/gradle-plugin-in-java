plugins {
    // Apply the Java Gradle plugin development plugin to add support for developing Gradle plugins
    `java-gradle-plugin`
    id("java-gradle-plugin")
    id("maven-publish")
    id("com.gradle.plugin-publish") version "0.18.0"
}

pluginBundle {
    website = "https://www.gradle.org/"
    vcsUrl = "https://github.com/gradle/greeting-plugin-example"
    tags = listOf("example", "template")

}


version = "2.0.5"    //配置插件的版本号
group = "com.foo.myplugin"   //插件的群组，插件的classpath会用到
gradlePlugin {
    plugins {
        create("greetingsPlugin") {
            displayName = "Greeting Plugin"
            id = "org.example.greeting"
            description = "Template for people to start their own plugin adventure"
            implementationClass = "com.example.plugin.GreetingPlugin"
        }
    }
}

//repositories {
//    // Use Maven Central for resolving dependencies
//    mavenCentral()
//}
//
//dependencies {
//    // Use JUnit test framework for unit tests
//    testImplementation("junit:junit:4.13")
//}
//
//gradlePlugin {
//    // Define the plugin
//    val greeting by plugins.creating {
//        id = "com.example.plugin.greeting"
//        implementationClass = "com.example.plugin.GreetingPlugin"
//    }
//}







//version = "2.0.5"    //配置插件的版本号
//group = "com.foo.myplugin"   //插件的群组，插件的classpath会用到
//
//
//// Add a source set and a task for a functional test suite
//val functionalTest by sourceSets.creating
//gradlePlugin.testSourceSets(functionalTest)
//
//configurations[functionalTest.implementationConfigurationName].extendsFrom(configurations.testImplementation.get())
//
//val functionalTestTask = tasks.register<Test>("functionalTest") {
//    testClassesDirs = functionalTest.output.classesDirs
//    classpath = configurations[functionalTest.runtimeClasspathConfigurationName] + functionalTest.output
//}
//
//tasks.check {
//    // Run the functional tests as part of `check`
//    dependsOn(functionalTestTask)
//}
