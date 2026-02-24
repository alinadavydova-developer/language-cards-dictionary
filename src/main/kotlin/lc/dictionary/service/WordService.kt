package lc.dictionary.service


import lc.dictionary.entity.WordEng
import lc.dictionary.repository.WordRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class WordService(private val repository: WordRepository) {
    @Transactional(readOnly = true)
    suspend fun getWord(word: String): WordEng {
        return repository.findByWordIgnoreCase(word)[0];
    }
}