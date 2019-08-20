package micronaut.function.problems

import io.micronaut.function.FunctionBean

import java.util.function.Consumer

@FunctionBean(
        name = 'micronaut-function-problem',
        method = 'accept'
)
class MicronautFunctionProblemWorker implements Consumer<Event> {

    private final EventHolder eventHolder

    MicronautFunctionProblemWorker(EventHolder eventHolder) {
        this.eventHolder = eventHolder
    }

    @Override
    void accept(Event data) {
        eventHolder.lastEvent = data
    }

//    @Override
//    void accept(Event event) {
//        eventHolder.lastEvent = event
//    }

}