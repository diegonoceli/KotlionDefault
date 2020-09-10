package com.noceli.diego.ControleDidi.controller

import com.noceli.diego.ControleDidi.entity.Card
import com.noceli.diego.ControleDidi.repository.CartaoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
class CartaoController {

    @Autowired
    lateinit var repository: CartaoRepository

    @PostMapping("/CartaoSave")
    fun save(@Valid @RequestBody card: Card): String =
            repository.save(card)?.let { "Doned" }

    @GetMapping("/getAllCards")
    fun getAll()=repository.findAll()
}