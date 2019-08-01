package com.hsbc.quiz.client;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.hsbc.quiz.dao.IQuizDao;
import com.hsbc.quiz.dao.QuizDaoImpl;
import com.hsbc.quiz.entity.Question;
import com.hsbc.quiz.service.IQuizService;
import com.hsbc.quiz.service.QuizServiceImpl;

public class QuizClient {

	public static void main(String[] args) {
		IQuizService ser = QuizServiceImpl.getQuizService();
		List<Question> qlist = ser.generateQuestions();
		Scanner s = new Scanner(System.in);
		String answer=null;
		Map<Integer,String> amap=new HashMap<>();
		for(Question ques:qlist) {
			System.out.println(ques.getqDesc());
			System.out.println(ques.getOptA());
			System.out.println(ques.getOptB());
			System.out.println(ques.getOptC());
			answer=s.nextLine();
			amap.put(ques.getQuesId(),answer);
		}
		int score = ser.evaluate(amap);
		System.out.println("Your score is : "+score);
		

	}

}
