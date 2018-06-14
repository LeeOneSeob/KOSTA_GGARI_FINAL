package kosta.spring.postIT.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kosta.spring.postIT.model.dto.CrAsgnDTO;
import kosta.spring.postIT.model.dto.CrFeedbackDTO;
import kosta.spring.postIT.model.dto.CrSubAsgnDTO;
import kosta.spring.postIT.model.service.ClassroomService;

@Controller
public class ClassroomController {
	
	@Autowired
	ClassroomService classroomService;
	
	@RequestMapping("cr/asgn/{url}")
	public String crMenteeAsgnUrl(@PathVariable String url){
		return "mentee/classroom/crAsgn/"+url;
	}
	
	@RequestMapping("cr/mentoAsgn/{url}")
	public String crMentoAsgnUrl(@PathVariable String url){
		return "mento/classroom/crAsgn/"+url;
	}
	
	@RequestMapping("cr/notice/{url}")
	public String crMenteeNoticeUrl(@PathVariable String url){
		return "mentee/classroom/crNotice/"+url;
	}
	
	@RequestMapping("cr/mentoNotice/{url}")
	public String crMentoNoticeUrl(@PathVariable String url){
		return "mento/classroom/crNotice/"+url;
	}
	
	/**
	 * Ŭ������ ���� ����ϱ�
	 * (���)? asgnInsertForm??
	 * */
	@RequestMapping("cr/asgn/insert")
	public String insertAsgn(HttpSession session, CrAsgnDTO crAsgnDTO){
		classroomService.insertAsgn(crAsgnDTO);
		return "redirect:/cr/asgn/asgnSelectList";
	}
	
	/**
	 * Ŭ������ ���� ��ü�˻�
	 * */
	@RequestMapping("cr/asgn/asgnSelectList")
	public void asgnSelectList(HttpSession session, Model model, String courseCode){
		List<CrAsgnDTO> crAsgnList = classroomService.selectAsgnList(courseCode);
		model.addAttribute("crAsgnList", crAsgnList);
	}
	
	/**
	 * Ŭ������ ���� �󼼺���
	 * */
	@RequestMapping("cr/asgn/asgnDetail/{crAsgnCode}")
	public ModelAndView selectAsgn(HttpSession session, String crAsgnCode){
		CrAsgnDTO crAsgn = 
				classroomService.selectAsgn(crAsgnCode, true);//��ȸ������
		
		return new ModelAndView("/cr/asgn/asgnDetail", "crAsgn", crAsgn);
	}
	
	/**
	 * Ŭ������ ���� �����ϱ�
	 * �����ϱ�(���)???
	 * */
	@RequestMapping("cr/asgn/asgnDetail")
	public String updateAsgn(HttpSession session, CrAsgnDTO crAsgnDTO){
		classroomService.updateAsgn(crAsgnDTO);
		return "redirect:/cr/asgn/asgnDetail";
	}
	
	/**
	 * Ŭ������ ���� �����ϱ�
	 * */
	@RequestMapping("cr/asgn/asgnDetail")
	public String deleteAsgn(HttpSession session, String crAsgnCode){
		classroomService.deleteAsgn(crAsgnCode);
		return "redirect:cr/asgn/asgnDetail";
	}
	
	/**
	 * Ŭ������ �������� ����ϱ�
	 * */
	@RequestMapping("cr/asgn/sbmInsertForm")
	public String insertSubAsgn(HttpSession session, CrSubAsgnDTO crSubAsgnDTO){
		classroomService.insertSubAsgn(crSubAsgnDTO);
		return "redirect:cr/asgn/asgnDetail";
	}
	
	/**
	 * Ŭ������ �������� ��ü�˻�
	 * */
	@RequestMapping("cr/asgn/asgnDetail")
	public void selectSubAngnList(HttpSession session, Model model, String crAsgnCode){
		List<CrSubAsgnDTO> crSubAsgnList = classroomService.selectSubAngnList(crAsgnCode);
		model.addAttribute("crSubAsgnList", crSubAsgnList);
	}
	
	/**
	 * Ŭ������ �������� �󼼺���
	 * */
	@RequestMapping("cr/asgn/asgnDetail")
	public ModelAndView selectSubAsgn(HttpSession session, String crSubasgnCode){
		CrSubAsgnDTO crSubAsgn = 
				classroomService.selectSubAsgn(crSubasgnCode);
		return new ModelAndView("cr/asgn/asgnDetail", "crSubAsgn", crSubAsgn);
	}
	
	/**
	 * Ŭ������ �������� �����ϱ�(���?)
	 * */
	@RequestMapping("cr/asgn/sbmSelectForm")
	public String updateSubAsgn(HttpSession session, CrSubAsgnDTO crSubAsgnDTO){
		classroomService.updateSubAsgn(crSubAsgnDTO);
		return "redirect:cr/asgn/sbmSelectForm";
	}
	
	/**
	 * Ŭ������ �������� �����ϱ�
	 * */
	@RequestMapping("cr/asgn/sbmSelectForm")
	public String deleteSubAsgn(HttpSession session, String crSubasgnCode){
		classroomService.deleteSubAsgn(crSubasgnCode);
		return "redirect:cr/asgn/asgnDetail";
	}
	
	/**
	 * �ǵ�� ����ϱ�
	 * */
	@RequestMapping("cr/asgn/sbmSelectForm")
	public String insertFeedback(HttpSession session, CrFeedbackDTO crFeedbackDTO){
		classroomService.insertFeedback(crFeedbackDTO);
		return "redirect:cr/asgn/sbmSelectForm";
	}
	
	/**
	 * �ǵ�� �����ϱ�
	 * */
	@RequestMapping("cr/asgn/sbmSelectForm")
	public String updateFeedback(HttpSession session, CrFeedbackDTO crFeedbackDTO){
		classroomService.updateFeedback(crFeedbackDTO);
		return "redirect:cr/asgn/sbmSelectForm";
	}
	
	/**
	 * �ǵ�� �����ϱ�
	 * */
	@RequestMapping("cr/asgn/sbmSelectForm")
	public String deleteFeedback(HttpSession session, String crFeedCode){
		classroomService.deleteFeedback(crFeedCode);
		return "redirect:cr/asgn/sbmSelectForm";
	}
	
	/**
	 * �ǵ�� �󼼰˻�
	 * */
	@RequestMapping("sbmSelectForm")
	public ModelAndView selectFeedback(HttpSession session, String crSubasgnCode){
		CrFeedbackDTO crFeedback = 
			classroomService.selectFeedback(crSubasgnCode);
		return new ModelAndView("sbmSelectForm", "crFeedback", crFeedback);
	}
}
