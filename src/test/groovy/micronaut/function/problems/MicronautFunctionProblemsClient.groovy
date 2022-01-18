package micronaut.function.problems

import io.micronaut.function.client.FunctionClient
import jakarta.inject.Named

@FunctionClient
interface MicronautFunctionProblemsClient {

    @Named("micronaut-function-problem")
    Optional<String> send(Event event)

    @Named("another-micronaut-function-problem")
    Optional<String> sendAnother(Event event)

    @Named("micronaut-function-problem")
    void sendVoid(Event event)

}
