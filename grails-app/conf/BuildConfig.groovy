grails.servlet.version = "2.5" // Change depending on target container compliance (2.5 or 3.0)
grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
grails.project.target.level = 1.6
grails.project.source.level = 1.6
grails.project.dependency.resolver = "maven" // or ivy
//grails.project.war.file = "target/${appName}-${appVersion}.war"
grails.war.resources = { stagingDir ->
    delete(file:"${stagingDir}/WEB-INF/lib/ehcache-core-2.4.6.jar")
}
grails.project.dependency.resolution = {
    // inherit Grails' default dependencies
    inherits("global") {
        // uncomment to disable ehcache
         //excludes 'ehcache'
    }
    log "debug" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
    checksums true // Whether to verify checksums on resolve

    repositories {
        inherits true // Whether to inherit repository definitions from plugins
        grailsPlugins()
        grailsHome()
        grailsCentral()
        mavenCentral()
        mavenRepo "http://www.terracotta.org/download/reflector/releases<"
        mavenRepo "http://www.terracotta.org/download/reflector/maven2"
        // uncomment these to enable remote dependency resolution from public Maven repositories
        //mavenCentral()
        //mavenLocal()
        //mavenRepo "http://snapshots.repository.codehaus.org"
        //mavenRepo "http://repository.codehaus.org"
        //mavenRepo "http://download.java.net/maven/2/"
        //mavenRepo "http://repository.jboss.com/maven2/"
    }
    dependencies {

        runtime 'net.sf.ehcache:ehcache-ee:2.8.3'
        //runtime 'org.terracotta:terracotta-root:4.1.3'
        //runtime 'net.sf.ehcache:ehcache-terracotta:2.8.3'
        compile 'org.terracotta:terracotta-toolkit-runtime-ee:4.1.3'
        //runtime 'org.terracotta:terracotta-toolkit-runtime-ee:4.0.0'
        //runtime 'org.terracotta.quartz:quartz-jobs:2.2.1'
        compile 'org.terracotta.bigmemory:bigmemory:4.1.3'
    }

    plugins {

        runtime ":hibernate:3.6.10.8"
        runtime ":jquery:1.7.1"
        runtime ":resources:1.1.6"
        compile ":cache:1.1.7"
        // Uncomment these (or add new ones) to enable additional resources capabilities
        //runtime ":zipped-resources:1.0"
        //runtime ":cached-resources:1.0"
        //runtime ":yui-minify-resources:0.1.4"

        build ":tomcat:7.0.52.1"
    }
}
