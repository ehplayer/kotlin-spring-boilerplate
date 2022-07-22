package com.ehp.api.controller

import com.ehp.api.config.logger
import com.ehp.api.domain.Member
import com.ehp.api.service.MemberService
import com.ehp.mapper.config.ObjectMapperConverter
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/v1/member")
class MemberController(
    val memberService: MemberService
) {
    val logger = logger<MemberController>()
    @GetMapping("/{id}")
    fun get(@PathVariable id:Long): Member {
        val member = memberService.getMember(id)
        logger.info(ObjectMapperConverter.writeValueAsString(member))
        return member
    }

    @GetMapping()
    fun create(@RequestParam name:String): Member {
        return memberService.createMember(name)
    }
}