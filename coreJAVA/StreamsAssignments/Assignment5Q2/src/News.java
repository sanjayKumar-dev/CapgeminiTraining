
public class News {
    private int newsId;
    private String postedByUser;
    private String commentByUser;
    private String comment;
	public News(int newsId, String postedByUser, String commentByUser, String comment) {
		super();
		this.newsId = newsId;
		this.postedByUser = postedByUser;
		this.commentByUser = commentByUser;
		this.comment = comment;
	}
	public int getNewsId() {
		return newsId;
	}
	public String getPostedByUser() {
		return postedByUser;
	}
	public String getCommentByUser() {
		return commentByUser;
	}
	public String getComment() {
		return comment;
	}
    
    
}