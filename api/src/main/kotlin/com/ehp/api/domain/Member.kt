package com.ehp.api.domain

import javax.persistence.*

@Entity
@Table(name = "member")
class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    var id: Long = 0

    @Column(name = "name")
    var name: String = ""
}