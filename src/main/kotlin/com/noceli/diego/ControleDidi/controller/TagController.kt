package com.noceli.diego.ControleDidi.controller

import com.noceli.diego.ControleDidi.entity.Tag
import com.noceli.diego.ControleDidi.repository.TagRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
class TagController {

    @Autowired
    lateinit var repository:TagRepository

    @PostMapping("/TagSave")
    fun save(@Valid @RequestBody tag: Tag): String =
            repository.save(tag)?.let { "Done" }

    @GetMapping("/getAllTags")
    fun getAll()=repository.findAll()
}