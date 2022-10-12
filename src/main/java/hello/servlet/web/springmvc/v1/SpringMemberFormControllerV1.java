package hello.servlet.web.springmvc.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


// @Controller : 스프링 빈으로 등록, 애노테이션 기반 컨트롤러로 인식
// @RequestMapping : 요청정보를 매핑, 해당URL이 호출되면 이 메서드가 호출된다.
@Controller
public class SpringMemberFormControllerV1 {

    @RequestMapping("/springmvc/v1/members/new-form")
    public ModelAndView process(){
        System.out.println("SpringMemberFormControllerV1.process");
        return new ModelAndView("new=form");
    }

}
