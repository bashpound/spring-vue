package bashpound.marketplace.infrastructure.repository;

import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import bashpound.marketplace.domain.model.article.Article;
import bashpound.marketplace.domain.model.article.ArticleId;
import bashpound.marketplace.domain.model.article.ArticleRepository;

import java.util.List;

import javax.persistence.EntityManager;

@Repository
public class HibernateArticleRepository extends HibernateSupport implements ArticleRepository {

  public HibernateArticleRepository(EntityManager entityManager) {
    super(entityManager);
  }

  @Override
  public Article findById(ArticleId articleId) {
    Query<Article> query = getSession().createQuery("from article_board where id = :id", Article.class);
    query.setParameter("id", articleId.value());
    return query.uniqueResult();
  }
  
  @Override
  public List<Article> findByBoardName(String boardname) {
	  Query<Article> query = getSession().createQuery("from article_board where boardname = :boardname", Article.class);
	return query.getResultList();
  } 

  @Override
  public void save(Article article) {
    entityManager.persist(article);
    entityManager.flush();
  }





}
