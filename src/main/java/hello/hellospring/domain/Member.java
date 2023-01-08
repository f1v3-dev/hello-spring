package hello.hellospring.domain;

public class Member {

    // 고객이 정한 id가 아닌 시스템에서 정한 임의의 id
    private Long id;
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
