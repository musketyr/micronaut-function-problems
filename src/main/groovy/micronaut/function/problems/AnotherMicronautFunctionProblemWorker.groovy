package micronaut.function.problems

import io.micronaut.function.FunctionBean

import java.util.function.Consumer

@FunctionBean(
        name = 'another-micronaut-function-problem',
        method = 'accept'
)
class AnotherMicronautFunctionProblemWorker implements Consumer<Event> {

    private final EventHolder eventHolder

    AnotherMicronautFunctionProblemWorker(EventHolder eventHolder) {
        this.eventHolder = eventHolder
    }

    @Override
    void accept(Event event) {
        eventHolder.lastEvent = event
    }

}