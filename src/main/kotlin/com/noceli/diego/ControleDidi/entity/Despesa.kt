package com.noceli.diego.ControleDidi.entity

import com.fasterxml.jackson.annotation.JsonBackReference
import javax.persistence.*

@Entity
data class Despesa(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long = 0,
        @JsonBackReference
        @ManyToOne(fetch = FetchType.EAGER)
        @JoinColumn(name = "cartao_id")
        val card: Card? = null,
        @JsonBackReference
        @ManyToOne(fetch = FetchType.EAGER)
        @JoinColumn(name = "tag_id")
        val tag: Tag? = null,
        val valorDespesa: Float,
        val descDespesa: String,
        val dataDespesa: String
)