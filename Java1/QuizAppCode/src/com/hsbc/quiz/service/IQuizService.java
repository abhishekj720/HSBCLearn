package com.hsbc.quiz.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.hsbc.quiz.entity.Question;

public interface IQuizService {
	
	List<Question> generateQuestions();
	int evaluate(Map<Integer,String>amap);
	
}
