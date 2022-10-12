package hello.servlet.web.springmvc.v3;

import hello.servlet.domain.member.Member;
import hello.servlet.domain.member.MemberRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/springmvc/v3/members")//중복제거
public class SpringMemberControllerV3 {
    private MemberRepository memberRepository = MemberRepository.getInstance();
//  GET 메서드만 호출
    @RequestMapping(value = "/new-form", method = RequestMethod.GET)
    public String newForm(){
        System.out.println("SpringMemberFormControllerV1.process");
        //ModelAndView로 반환하지 않고 String으로 반환해도 뷰이름을 알고 뷰를 반환함
        return "new=form";
    }
//    POST만 호출
//ModelAndView 대신 파라미터에서 받은 model에다가 객체를 저장해서 model과 함께 뷰를 반환함
    @PostMapping(value = "/save")
    public String save(
            @RequestParam("username") String username,
            @RequestParam("age") int age,
            Model model
    ) {
        Member member = new Member(username, age);
        memberRepository.save(member);


        model.addAttribute("member", member);
        return "save-result";
    }
//  GET
    @GetMapping
    public String members(Model model) {
        List<Member> members = memberRepository.findAll();
        model.addAttribute("members", members);
        return "members";
    }

}
