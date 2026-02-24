package lc.dictionary.repository

import lc.dictionary.entity.WordEng
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface WordRepository : JpaRepository<WordEng, UUID>{
    fun findByWordIgnoreCase(word: String): List<WordEng>
}