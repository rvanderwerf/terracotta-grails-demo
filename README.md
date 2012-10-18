terracotta-grails-demo
======================

Demo Grails 2 Application configured for Terracotta ehcache and quartz clustering, from #SpringOne2GX
This shows all libraries needed for running quartz1 plugin, Terracotta 3.4.1, and ehcache setup

Note BuildConfig.groovy has a Terrcotta maven server added to find the artifacts.
Due to Grails having its on ehcache jar included, you have to use this trick to make
the proper version appear (And there is a war file patch as well to avoid 2 ehcache jars.