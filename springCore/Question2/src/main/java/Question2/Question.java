package Question2;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question {
	private int questionId;
	private String ques;
	private List<String> answers;
	private Set<String> ansSet;
	private Map<Integer, String> ansMap;
	
	
	
	public Map<Integer, String> getAnsMap() {
		return ansMap;
	}
	public void setAnsMap(Map<Integer, String> ansMap) {
		this.ansMap = ansMap;
	}
	public Set<String> getAnsSet() {
		return ansSet;
	}
	public void setAnsSet(Set<String> ansSet) {
		this.ansSet = ansSet;
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQues() {
		return ques;
	}
	public void setQues(String ques) {
		this.ques = ques;
	}
	public List<String> getAnswers() {
		return answers;
	}
	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
	
	public void printDetails() {
		System.out.println("Question Id : " + questionId);
		System.out.println("Question : " + ques);
		System.out.println("Answers :->");
		System.out.println("\n Example of List \n");
		for(String str : answers)
			System.out.println(str);
		
		System.out.println("---------------------------------------------------------");
		System.out.println("Example of Set \n");
		for(String str : ansSet)
			System.out.println(str);
		
		System.out.println("---------------------------------------------------------");
		System.out.println("Example of Map \n");
		for(Map.Entry<Integer, String> entry : ansMap.entrySet()) {
			System.out.println("Answer No : " + entry.getKey() + " Answer : "+ entry.getValue());
		}
	}
	
	

}
