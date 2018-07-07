package put_test

import grails.plugin.springsecurity.annotation.Secured
import static org.springframework.http.HttpStatus.NO_CONTENT

@Secured(['permitAll'])
class UserController {

    static allowedMethods = [
            index: ["POST", "PUT", "PATCH"]
    ]

    def index() {
    	println "Method: " + request.method
    	println "Params: " + params

        render status: NO_CONTENT
    }
}
