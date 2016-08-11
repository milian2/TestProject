package testproject

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(SimpleController)
class SimpleControllerSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test hello"() {
		when:
		controller.hello()
		
		then:
		response.text == 'hello'
    }
}
