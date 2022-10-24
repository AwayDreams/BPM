package com.ecmprojectbackend.webApi

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller


@Controller
class AuthController {

    @GetMapping(method = RequestMethod.GET)
    fun getTreeById(@PathVariable id: Int): Tree? {
        return repository.findById(id)
    }

    @GetMapping
    fun getTreeById(
        @RequestParam name: String?,
        @RequestParam age: Int
    ): Tree? {
        return repository.findFirstByCommonNameIgnoreCaseAndAge(name, age)
    }

}