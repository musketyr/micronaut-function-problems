package micronaut.function.problems

import io.micronaut.test.extensions.spock.annotation.MicronautTest
import jakarta.inject.Inject
import spock.lang.Specification

@MicronautTest
class MicronautFunctionProblemsFunctionSpec extends Specification {

    @Inject
    MicronautFunctionProblemsClient client

    @Inject
    EventHolder holder


    void "with data"() {
        given:
            holder.lastEvent = null
        when:
            client.send(new Event(event: "foobar"))
        then:
            holder.lastEvent
    }

    void "with event"() {
        given:
            holder.lastEvent = null
        when:
            client.sendAnother(new Event(event: "foobar"))
        then:
            holder.lastEvent
    }

    void "with void"() {
        given:
            holder.lastEvent = null
        when:
            client.sendVoid(new Event(event: "foobar"))
        then:
            holder.lastEvent
    }

}
