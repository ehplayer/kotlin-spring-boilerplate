package com.ehp.api.controller

import com.ehp.api.domain.Member
import com.ehp.api.service.MemberService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/v1/member")
class MemberController(
    val memberService: MemberService
) {

    @GetMapping("/{id}")
    fun get(@PathVariable id:Long): Member {
        return memberService.getMember(id)
    }

    @GetMapping()
    fun create(@RequestParam name:String): Member {
        return memberService.createMember(name)
    }
}