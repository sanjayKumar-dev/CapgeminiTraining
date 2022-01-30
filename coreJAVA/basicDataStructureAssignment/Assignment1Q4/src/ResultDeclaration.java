
public class ResultDeclaration {
	public String declareResults( double s1, double s2, double s3) {
		if(s1>60 && s2>60 && s3>60)
			return "pass";
		
		if(s1>60 && s2>60)
			return "Promoted";
		else if(s1>60 && s3>60)
			return "Promoted";
		else if(s2>60 && s3>60)
			return "Promoted";
		else
		return "fail";
		
	}

}
