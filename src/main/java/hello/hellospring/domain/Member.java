package hello.hellospring.domain;

// JPA를 사용하기 위해서 Entity를 Mapping
// ORM : Object Relation Mapping


import jakarta.persistence.*;

// JPA가 관리하는 Entity
@Entity

public class Member {


    // 고객이 정한 id가 아닌 시스템에서 정한 임의의 id
    @Id @GeneratedValue (strategy = GenerationType.IDENTITY) // DB가 알아서 생성하는 PK
    private Long id;

//    @Column(name = "username")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
