package com.hsbc.quiz.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import com.hsbc.quiz.dao.IQuizDao;
import com.hsbc.quiz.dao.QuizDaoImpl;
import com.hsbc.quiz.entity.Question;

public class QuizServiceImpl implements IQuizService{

	private static IQuizService ser = new QuizServiceImpl();
	private IQuizDao dao = QuizDaoImpl.getQuizDao();
	private Map<Integer,Question> qmap;
	private QuizServiceImpl() {
		
	}
	public static IQuizService getQuizService() {
		return ser;
	}
	@Override
	public List<Question> generateQuestions() {
		List<Question> qlist=new ArrayList<Question>();
		if(qmap==null)
			qmap=dao.getQuestions();//caching algorithm
		Set<Integer> qnos=generateQnos();
		for(int qno:qnos) {
			qlist.add(qmap.get(qno));
		}
		return qlist;
	}
	public Set<Integer> generateQnos(){
		Set<Integer> set = new HashSet<>();
		Random rand = new Random();
		int qno=0;
		while(set.size()<5) {
			qno=rand.nextInt(15)+1;
			set.add(qno);
		}
		return set;
	}
	@Override
	public int evaluate(Map<Integer, String> amap) {
		int score=0;
		Set<Integer> qnos=amap.keySet();
		Question ques=null;
		for(int qno:qnos) {
			ques=qmap.get(qno);
			if(amap.get(qno).equalsIgnoreCase(ques.getAns()))
				++score;
		}
		return score;
	}

	
}
