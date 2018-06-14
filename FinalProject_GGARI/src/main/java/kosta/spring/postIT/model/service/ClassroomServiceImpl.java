package kosta.spring.postIT.model.service;

import java.util.List;

import javax.websocket.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kosta.spring.postIT.model.dao.ClassroomDAO;
import kosta.spring.postIT.model.dto.CrAsgnDTO;
import kosta.spring.postIT.model.dto.CrFeedbackDTO;
import kosta.spring.postIT.model.dto.CrSubAsgnDTO;

@Service
public class ClassroomServiceImpl implements ClassroomService {
	
	@Autowired
	ClassroomDAO classroomDAO;
	
	@Override
	public int insertAsgn(CrAsgnDTO crAsgnDTO) {
		return classroomDAO.insertAsgn(crAsgnDTO);
	}

	@Override
	public int updateAsgn(CrAsgnDTO crAsgnDTO) {
		return classroomDAO.updateAsgn(crAsgnDTO);
	}
	
	@Override
	public int deleteAsgn(String crAsgnCode) {
		return classroomDAO.deleteAsgn(crAsgnCode);
	}
	
	@Override
	public List<CrAsgnDTO> selectAsgnList(String courseCode) {
		return classroomDAO.selectAsgnList(courseCode);
	}

	@Override
	public CrAsgnDTO selectAsgn(String crAsgnCode, boolean state) {
		if(state) {
			int re = classroomDAO.readnumUpdate(crAsgnCode);
			if(re==0) throw new RuntimeException("��ȸ�� ���� �����Դϴ�.");
		}
		return classroomDAO.selectAsgn(crAsgnCode);
	}

	@Override
	public int insertSubAsgn(CrSubAsgnDTO crSubAsgnDTO) {
		return classroomDAO.insertSubAsgn(crSubAsgnDTO);
	}

	@Override
	public int updateSubAsgn(CrSubAsgnDTO crSubAsgnDTO) {
		return classroomDAO.updateSubAsgn(crSubAsgnDTO);
	}

	@Override
	public int deleteSubAsgn(String crSubasgnCode) {
		return classroomDAO.deleteSubAsgn(crSubasgnCode);
	}

	@Override
	public List<CrSubAsgnDTO> selectSubAngnList(String crAsgnCode) {
		return classroomDAO.selectSubAngnList(crAsgnCode);
	}

	@Override
	public CrSubAsgnDTO selectSubAsgn(String crSubasgnCode) {
		return classroomDAO.selectSubAsgn(crSubasgnCode);
	}

	@Override
	public int insertFeedback(CrFeedbackDTO crFeedbackDTO) {
		return classroomDAO.insertFeedback(crFeedbackDTO);
	}

	@Override
	public int updateFeedback(CrFeedbackDTO crFeedbackDTO) {
		return classroomDAO.updateFeedback(crFeedbackDTO);
	}

	@Override
	public int deleteFeedback(String crFeedCode) {
		return classroomDAO.deleteFeedback(crFeedCode);
	}

	@Override
	public CrFeedbackDTO selectFeedback(String crSubasgnCode) {
		return classroomDAO.selectFeedback(crSubasgnCode);
	}



}
