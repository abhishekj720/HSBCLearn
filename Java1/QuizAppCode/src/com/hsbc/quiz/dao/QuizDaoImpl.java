package com.hsbc.quiz.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

import org.apache.derby.client.am.SqlException;

import com.hsbc.quiz.entity.Question;

public class QuizDaoImpl implements IQuizDao{

	private static IQuizDao dao = new QuizDaoImpl();
	private static ResourceBundle rb = ResourceBundle.getBundle("hsbc");
	static {
		try {
			Class.forName(rb.getString("driver"));
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
	}
	private QuizDaoImpl() {
		
	}
	public static IQuizDao getQuizDao() {
		return dao;
	}
	@Override
	public Map<Integer, Question> getQuestions() {
		Map<Integer,Question> qmap = new HashMap<>();
		Question ques=null;
		try (Connection conn = DriverManager.getConnection(rb.getString("dburl"))){
		String sql = "select * from questions";
		PreparedStatement st = conn.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		while(rs.next()) {
			ques=new Question();
			ques.setQuesId(rs.getInt("qid"));
			ques.setqDesc(rs.getString("qdesc"));
			ques.setOptA(rs.getString("optiona"));
			ques.setOptB(rs.getString("optionb"));
			ques.setOptC(rs.getString("optionc"));
			ques.setAns(rs.getString("answer"));
			qmap.put(ques.getQuesId(), ques);
		}
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return qmap;
	}

}
