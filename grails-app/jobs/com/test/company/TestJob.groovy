package com.test.company

/**
 * Created with IntelliJ IDEA.
 * User: ryanv
 * Date: 9/16/12
 * Time: 12:02 AM
 * To change this template use File | Settings | File Templates.
 */
class TestJob {

    static triggers = {
        simple repeatInterval: 5000l // execute job once in 5s seconds
    }

    def execute() {

        System.out.println("Test Job ping")
    }
}
