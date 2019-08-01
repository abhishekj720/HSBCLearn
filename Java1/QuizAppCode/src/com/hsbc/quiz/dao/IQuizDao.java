package com.hsbc.quiz.dao;

import java.util.Map;

import com.hsbc.quiz.entity.Question;

public interface IQuizDao {

	Map<Integer,Question> getQuestions();
	
}
