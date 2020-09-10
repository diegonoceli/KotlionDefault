package com.noceli.diego.ControleDidi.controller

import com.noceli.diego.ControleDidi.entity.Despesa
import com.noceli.diego.ControleDidi.model.response.DespesaResponse
import com.noceli.diego.ControleDidi.repository.DespesaRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
class DespesaController {

    @Autowired
    lateinit var repository: DespesaRepository

    @PostMapping("/DespesaSave")
    fun save(@Valid @RequestBody despesa: Despesa): String =
            repository.save(despesa)?.let { "Done" }

    @GetMapping("/getAllDespesas")
    fun getDespesa() = repository.findAll()

}