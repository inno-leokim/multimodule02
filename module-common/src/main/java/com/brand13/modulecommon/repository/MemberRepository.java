package com.brand13.modulecommon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brand13.modulecommon.domain.Member;

public interface MemberRepository extends JpaRepository<Member, Long>{
    
}
