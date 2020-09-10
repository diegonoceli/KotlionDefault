package com.noceli.diego.ControleDidi.repository

import com.noceli.diego.ControleDidi.entity.Tag
import org.springframework.data.repository.CrudRepository

interface TagRepository: CrudRepository<Tag,Long>{

    fun findById(idTag:Int):Iterable<Tag>
}