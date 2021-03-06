package bashpound.marketplace.domain.application.commands;

import java.util.Objects;

import org.springframework.util.Assert;

public class WriteArticleCommand extends AnonymousCommand{
	private String boardname;
	private String subject;
	private String content;
	private String author;
	private int viewed;

	 public WriteArticleCommand(String boardname, String subject, String content, String author, int viewed) {
		Assert.hasText(boardname, "Parameter `boardname` must not be empty");
		Assert.hasText(subject, "Parameter `subject` must not be empty");
		Assert.hasText(content, "Parameter `content` must not be empty");
		Assert.hasText(author, "Parameter `author` must not be empty");
		Assert.hasText(viewed+"", "Parameter `viewed` must not be empty");
		
		this.boardname = boardname;
	    this.subject = subject;
	    this.content = content;
	    this.author = author;
	    this.viewed = viewed;
	  }



	public String getBoardname() {
		return boardname;
	}



	public String getSubject() {
		return subject;
	}



	public String getContent() {
		return content;
	}



	public String getAuthor() {
		return author;
	}



	public int getViewed() {
		return viewed;
	}



	public void setBoardname(String boardname) {
		this.boardname = boardname;
	}



	public void setSubject(String subject) {
		this.subject = subject;
	}



	public void setContent(String content) {
		this.content = content;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	public void setViewed(int viewed) {
		this.viewed = viewed;
	}



	@Override
	  public int hashCode() {
	    return Objects.hash(subject, author, content);
	  }

	  @Override
	  public String toString() {
	    return "WriteArticleCommand{" +
	      "subject='" + subject + '\'' +
	      ", author='" + author + '\'' +
	      ", content='" + content + '\'' +
	      ", viewed='" + viewed + '\'' +
	      '}';
	  }	
	

}
