package io.httpmurilo.injection.repository;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IUserRepository  extends JpaRepository<User, Integer> {

    @Query("select u from User u where u.name =:nome ")
    User getUserByName(String nome);

}
