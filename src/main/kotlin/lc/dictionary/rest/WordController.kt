package lc.dictionary.rest

import lc.dictionary.entity.WordEng
import lc.dictionary.metrics.MetricCounter
import lc.dictionary.service.WordService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("v1/dictionary/word")
class WordController(private val wordService: WordService, private  val metricService: MetricCounter) {


    @GetMapping("/{word}")
    suspend fun getWord(@PathVariable word: String): WordEng {
        metricService.getCounter().increment()
        return wordService.getWord(word)
    }
}