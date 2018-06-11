package kosta.spring.postIT.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClassroomController {
	@RequestMapping("cr/asgn/{url}")
	public String crMenteeAsgnUrl(@PathVariable String url) {
		return "mentee/classroom/crAsgn/"+url;
	}
	
	@RequestMapping("cr/mentoAsgn/{url}")
	public String crMentoAsgnUrl(@PathVariable String url) {
		return "mento/classroom/crAsgn/"+url;
	}
	
	@RequestMapping("cr/notice/{url}")
	public String crMenteeNoticeUrl(@PathVariable String url) {
		return "mentee/classroom/crNotice/"+url;
	}
	
	@RequestMapping("cr/mentoNotice/{url}")
	public String crMentoNoticeUrl(@PathVariable String url) {
		return "mento/classroom/crNotice/"+url;
	}
}
