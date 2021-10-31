package com.knf.dev.demo.kotlinspringjpafreemarkercrud.repository

import com.knf.dev.demo.kotlinspringjpafreemarkercrud.model.User
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : CrudRepository<User?, Long?>