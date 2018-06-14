package kosta.spring.postIT.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kosta.spring.postIT.model.dto.CrAsgnDTO;
import kosta.spring.postIT.model.dto.CrFeedbackDTO;
import kosta.spring.postIT.model.dto.CrSubAsgnDTO;

@Repository
public class ClassroomDAOImpl implements ClassroomDAO {
	
	@Autowired
	SqlSession session;
	
	@Override
	public int insertAsgn(CrAsgnDTO crAsgnDTO) {
		return session.insert("classroomMapper.insertAsgn", crAsgnDTO);
	}

	@Override
	public int updateAsgn(CrAsgnDTO crAsgnDTO) {
		return session.insert("classroomMapper.updateAsgn", crAsgnDTO);
	}
	
	@Override
	public int readnumUpdate(String crAsgnCode) {
		return session.update("classroomMapper.rednumUpdate", crAsgnCode);
	}

	@Override
	public int deleteAsgn(String crAsgnCode) {
		return session.delete("classroomMapper.deleteAsgn", crAsgnCode);
	}

	@Override
	public List<CrAsgnDTO> selectAsgnList(String courseCode) {
		return session.selectList("classroomMapper.selectAsgnList", courseCode);
	}

	@Override
	public CrAsgnDTO selectAsgn(String crAsgnCode) {
		return session.selectOne("classroomMapper.selectAsgnList", crAsgnCode);
	}

	@Override
	public int insertSubAsgn(CrSubAsgnDTO crSubAsgnDTO) {
		return session.insert("classroomMapper.insertSubAsgn", crSubAsgnDTO);
	}

	@Override
	public int updateSubAsgn(CrSubAsgnDTO crSubAsgnDTO) {
		return session.update("classroomMapper.updateSubAsgn", crSubAsgnDTO);
	}

	//삭제를 cr_subasgn_code로 안하고 DTO로?
	@Override
	public int deleteSubAsgn(String crSubasgnCode) {
		return session.delete("classroomMapper.deleteSubAsgn", crSubasgnCode);
	}

	@Override
	public List<CrSubAsgnDTO> selectSubAngnList(String crAsgnCode) {
		return session.selectList("classroomMapper.selectSubAngnList", crAsgnCode);
	}

	@Override
	public CrSubAsgnDTO selectSubAsgn(String crSubasgnCode) {
		return session.selectOne("classroomMapper.selectSubAngnList", crSubasgnCode);
	}

	@Override
	public int insertFeedback(CrFeedbackDTO crFeedbackDTO) {
		return session.insert("classroomMapper.insertFeedback", crFeedbackDTO);
	}

	@Override
	public int updateFeedback(CrFeedbackDTO crFeedbackDTO) {
		return session.update("classroomMapper.updateFeedback", crFeedbackDTO);
	}

	@Override
	public int deleteFeedback(String crFeedCode) {
		return session.delete("classroomMapper.deleteFeedback", crFeedCode);
	}

	@Override
	public CrFeedbackDTO selectFeedback(String crSubasgnCode) {
		return session.selectOne("classroomMapper.selectFeedback", crSubasgnCode);
	}

}
