package bashpound.marketplace.domain.model.article;

import bashpound.marketplace.domain.common.model.AbstractBaseEntity;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "ArticleBoard")
public class Article extends AbstractBaseEntity {

  private static final long serialVersionUID = -7789177855101967490L;

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Long id;
  
  @Column(name = "boardid", nullable = false)
  private String boardName;

  @Column(name = "subject", nullable = false, length = 100)
  private String subject;

  @Column(name = "author", nullable = true)
  private String author;
  
  @Column(name = "content")
  private String content;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "created_date", nullable = false)
  private Date createdDate;
  
  public Article() {
  }

  /**
   * new Article publish
   */
  public static Article create(String boardName, String author, String subject, String content) {
    Article article = new Article();
    article.boardName = boardName;
    article.author = author;
    article.subject = subject;
    article.content = content;
    article.createdDate = new Date();
    return article;
  }

public ArticleId getArticleId() {
	return new ArticleId(id);
}

public String getBoardName() {
	return boardName;
}

public String getSubject() {
	return subject;
}

public String getAuthor() {
	return author;
}

public String getContent() {
	return content;
}

public Date getCreatedDate() {
	return createdDate;
}

@Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Article)) return false;
    Article article = (Article) o;
    return id == article.id &&
      Objects.equals(id, article.id);
  }


  @Override
  public String toString() {
    return "Article{" +
      "id=" + id +
      ", boardName='" + boardName + '\'' +
      ", subject='" + subject + '\'' +
      ", author='" + author + '\'' +
      ", content=" + content +
      ", createdDate=" + createdDate +
      '}';
  }

@Override
public int hashCode() {
	return Objects.hash(author, subject);
}
}
