package kosta.spring.postIT.model.dao;

import java.util.List;

import kosta.spring.postIT.model.dto.CrAsgnDTO;
import kosta.spring.postIT.model.dto.CrFeedbackDTO;
import kosta.spring.postIT.model.dto.CrSubAsgnDTO;

public interface ClassroomDAO {
	
	/**
	 * Ŭ������ �������
	 * */
	int insertAsgn(CrAsgnDTO crAsgnDTO);
	
	/**
	 * Ŭ������ ��������
	 * */
	int updateAsgn(CrAsgnDTO crAsgnDTO);
	
	/**
	 * Ŭ������ ������ȣ�� �ش��ϴ� ���ڵ� ��ȸ�� �����ϱ�
	 * */
	int readnumUpdate(String crAsgnCode);
	
	/**
	 * Ŭ������ ���� �����ϱ�
	 * */
	int deleteAsgn(String crAsgnCode);
	
	/**
	 * Ŭ������ ���� ��ü�˻�
	 * */
	List<CrAsgnDTO> selectAsgnList(String courseCode);
	
	/**
	 * Ŭ������ ������ȣ�� �ش��ϴ� ���ڵ� �˻�
	 * */
	CrAsgnDTO selectAsgn(String crAsgnCode);
	
	int insertSubAsgn(CrSubAsgnDTO crSubAsgnDTO);
	
	int updateSubAsgn(CrSubAsgnDTO crSubAsgnDTO);
	
	int deleteSubAsgn(String crSubasgnCode);
	
	List<CrSubAsgnDTO> selectSubAngnList(String crAsgnCode);
	
	CrSubAsgnDTO selectSubAsgn(String crSubasgnCode);
	
	int insertFeedback(CrFeedbackDTO crFeedbackDTO);
	
	int updateFeedback(CrFeedbackDTO crFeedbackDTO);
	
	int deleteFeedback(String crFeedCode);
	
	CrFeedbackDTO selectFeedback(String crSubasgnCode);
}
