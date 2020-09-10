package com.noceli.diego.ControleDidi.model.response

data class DespesaResponse(
        val nomeTag: String,
        val nomeCartao: String,
        val valorDespesa: Float,
        val descDespesa: String,
        val dataDespesa: String
)