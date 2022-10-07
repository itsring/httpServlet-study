package hello.servlet.domain.member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 동시성 문제가 고려되어 있지 않음, 실무에서는 ConcurrenbHashMap, AtomicLong 사용 고려
 */
public class MemberRepository {

    private Map<Long, Member> store = new HashMap<>();
    private static long sequence = 0L;

    private static final MemberRepository instance = new MemberRepository();

    public static MemberRepository getInstance() {
        return instance;
    }


    private MemberRepository() { // 생성자

    }

    //save
    public Member save(Member member) {
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
    }

    // id로 찾기
    public Member findById(Long id){
        return store.get(id);
    }

    //모두 찾기
    public List<Member> findAll(){
        return new ArrayList<>(store.values());
    }

    //store 다 날려버리기
    public void clearStore(){
        store.clear();
    }
}
