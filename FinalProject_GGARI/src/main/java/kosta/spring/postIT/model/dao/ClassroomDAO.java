package kosta.spring.postIT.model.dao;

import java.util.List;

import kosta.spring.postIT.model.dto.CrAsgnDTO;
import kosta.spring.postIT.model.dto.CrFeedbackDTO;
import kosta.spring.postIT.model.dto.CrSubAsgnDTO;

public interface ClassroomDAO {
	
	/**
	 * 클래스룸 과제등록
	 * */
	int insertAsgn(CrAsgnDTO crAsgnDTO);
	
	/**
	 * 클래스룸 과제수정
	 * */
	int updateAsgn(CrAsgnDTO crAsgnDTO);
	
	/**
	 * 클래스룸 과제번호에 해당하는 레코드 조회수 증가하기
	 * */
	int readnumUpdate(String crAsgnCode);
	
	/**
	 * 클래스룸 과제 삭제하기
	 * */
	int deleteAsgn(String crAsgnCode);
	
	/**
	 * 클래스룸 과제 전체검색
	 * */
	List<CrAsgnDTO> selectAsgnList(String courseCode);
	
	/**
	 * 클래스룸 과제번호에 해당하는 레코드 검색
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
