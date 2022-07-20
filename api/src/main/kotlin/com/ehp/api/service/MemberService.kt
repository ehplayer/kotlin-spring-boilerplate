package com.ehp.api.service

import com.ehp.api.domain.Member
import com.ehp.api.repository.MemberRepository
import org.springframework.stereotype.Service

@Service
class MemberService(
    val memberRepository: MemberRepository
) {
    fun getMember(id: Long): Member {
        return memberRepository.findById(id).orElseThrow()
    }

    fun createMember(name: String): Member {
        val member = Member()
        member.name = name
        return memberRepository.save(member)
    }
}