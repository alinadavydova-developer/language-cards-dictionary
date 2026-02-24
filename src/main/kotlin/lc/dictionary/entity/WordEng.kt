package lc.dictionary.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "word_eng")
class WordEng : BaseEntity() {
    @Column(nullable = false, unique = true)
    var word: String? = null
}