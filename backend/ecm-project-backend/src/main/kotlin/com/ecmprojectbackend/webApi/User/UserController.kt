package com.ecmprojectbackend.webApi.User

import com.ecmprojectbackend.domain.user.User
import com.ecmprojectbackend.domain.user.UserService
import com.ecmprojectbackend.webApi.User.representation.UserRegister
import org.springframework.web.bind.annotation.*
import java.awt.PageAttributes.MediaType


@RestController
@RequestMapping("user")
class UserController(
    private val userService: UserService
) {
    @GetMapping
    fun healthcheck(): String {
        return "funcionando!"
    }
    @PutMapping(produces = [org.springframework.http.MediaType.APPLICATION_JSON_VALUE])
    fun registerUser(@RequestBody userRegister: UserRegister): User {
        return userService.save(userRegister.toModel())
    }

}