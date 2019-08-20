package micronaut.function.problems

import io.micronaut.context.ApplicationContext
import io.micronaut.test.annotation.MicronautTest
import io.micronaut.runtime.server.EmbeddedServer
import spock.lang.Specification
import javax.inject.Inject

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
