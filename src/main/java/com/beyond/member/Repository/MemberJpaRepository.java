package com.beyond.member.Repository;

import com.beyond.member.domain.Member;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MemberJpaRepository {
    @Autowired
    private EntityManager entityManager;

    public void save(Member memebr) {
        entityManager.persist(memebr);  // jpa에서 member데이터를 insert
    }

//    public List<Member> findAll() {
//
//    }
//
//    public Optional<Member> findById(Long id) {
//
//    }
//
//    public Optional<Member> findByEmail(String email) {
//
//    }
//
//    public void delete(Long id) {
//
//    }
}
