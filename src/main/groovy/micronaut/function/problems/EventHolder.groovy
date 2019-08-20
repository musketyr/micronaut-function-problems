package micronaut.function.problems

import groovy.transform.CompileStatic

import javax.inject.Singleton

@Singleton
@CompileStatic
class EventHolder {

    Event lastEvent

}
