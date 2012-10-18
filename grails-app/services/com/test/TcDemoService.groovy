package com.test

import com.test.company.Test
import grails.plugin.springcache.annotations.Cacheable

class TcDemoService {

    def serviceMethod() {

    }

    @Cacheable("pirateCache")
    def Collection getTests(Map params) {

        return Test.findAll(params)


    }

}
