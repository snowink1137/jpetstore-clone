package com.example.jpetstoreclone.service;

import com.example.jpetstoreclone.domain.Member;
import com.example.jpetstoreclone.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    @Transactional
    public Long join(Member member) {

        memberRepository.save(member);
        return member.getId();
    }
}
