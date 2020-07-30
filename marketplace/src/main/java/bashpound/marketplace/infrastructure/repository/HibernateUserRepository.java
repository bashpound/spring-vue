package bashpound.marketplace.infrastructure.repository;

import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import bashpound.marketplace.domain.model.user.User;
import bashpound.marketplace.domain.model.user.UserRepository;

import javax.persistence.EntityManager;

@Repository
public class HibernateUserRepository extends HibernateSupport implements UserRepository {

  public HibernateUserRepository(EntityManager entityManager) {
    super(entityManager);
  }

  @Override
  public User findByUsername(String username) {
    Query<User> query = getSession().createQuery("from u where username = :username", User.class);
    query.setParameter("username", username);
    return query.uniqueResult();
  }

  @Override
  public User findByEmailAddress(String emailAddress) {
    Query<User> query = getSession().createQuery("from u where emailAddress = :emailAddress", User.class);
    query.setParameter("emailAddress", emailAddress);
    return query.uniqueResult();
  }

  @Override
  public void save(User user) {
    entityManager.persist(user);
    entityManager.flush();
  }
}
