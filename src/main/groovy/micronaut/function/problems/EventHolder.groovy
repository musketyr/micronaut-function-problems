package micronaut.function.problems

import groovy.transform.CompileStatic
import jakarta.inject.Singleton

@Singleton
@CompileStatic
class EventHolder {

    Event lastEvent

}
