package fr.infinity54.cesi.advancedjava.dao;

import fr.infinity54.cesi.advancedjava.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User,Integer> {
}
