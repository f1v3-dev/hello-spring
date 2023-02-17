package hello.hellospring.repository;
import hello.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

    // [JPQL] select m from Member m where m.name = ?
    @Override
    Optional<Member> findByName(String name);
}

/**
 * 인터페이스를 통한 기본적인 CRUD 제공
 * 메서드 이름만으로 조회 가능
 */