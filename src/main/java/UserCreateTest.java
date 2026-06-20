import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import model.User;
import model.UserRole;

import java.time.LocalDateTime;

public class UserCreateTest {
    public static void main(String[] args) {
        EntityManager em = Persistence.createEntityManagerFactory("default")
                .createEntityManager();

        User user = em.find(User.class, 1);
        System.out.println(user.getLogin());
        System.out.println(user.getRole());
        System.out.println(user.getCreatedAt());

        //

//        User user = new User();
//        user.setLogin("admin1234");
//        user.setPassword("@dmiN1234");
//        user.setRole(UserRole.ADMIN);
//        user.setCreatedAt(LocalDateTime.now());
//
//        try {
//            em.getTransaction().begin();
//            em.persist(user);
//            em.getTransaction().commit();
//            System.out.println("Пользователь создан");
//        } catch (Exception e) {
//            e.printStackTrace();
//            em.getTransaction().rollback();
//        }
    }
}
