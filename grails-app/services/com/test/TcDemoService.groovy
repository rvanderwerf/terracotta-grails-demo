package com.test

import com.test.company.Test
import org.springframework.cache.annotation.Cacheable



class TcDemoService {

    def serviceMethod() {

    }

    @Cacheable("pirateCache")
    def Collection getTests(Map params) {

        return Test.findAll()


    }

}
