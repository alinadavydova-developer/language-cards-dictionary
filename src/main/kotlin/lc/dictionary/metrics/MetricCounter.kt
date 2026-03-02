package lc.dictionary.metrics

import io.micrometer.core.instrument.Counter
import io.micrometer.core.instrument.MeterRegistry
import org.springframework.stereotype.Service

@Service
class MetricCounter(registry: MeterRegistry) {
    private val customMethodCalls: Counter = Counter.builder("custom.calls.word")
        .description("Total number of calls to customMethod")
        .tag("endpoint", "word") // Теги помогают группировать и фильтровать метрики [citation:8]
        .register(registry)

    fun getCounter() : Counter {
        return customMethodCalls
    }
}