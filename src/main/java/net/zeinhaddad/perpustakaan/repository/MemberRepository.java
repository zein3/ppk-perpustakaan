package net.zeinhaddad.perpustakaan.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import net.zeinhaddad.perpustakaan.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
    
    List<Member> findByName(@Param("name") String name);
    List<Member> findByMemberID(@Param("member_id") String memberID);

}
