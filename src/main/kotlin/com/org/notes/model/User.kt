package com.org.notes.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "user")
data class User(

    @Column(name = "user_name")
    val userName: String,

    @Column(name = "password")
    val password: String

): AbstractJpaPersistable<Long>()