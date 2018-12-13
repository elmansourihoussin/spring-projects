package co.elmansouri.springprojects.service;

import java.util.List;
import java.util.Optional;

import co.elmansouri.springprojects.entities.User;

public interface UserService {
	
	/**
	 * Methode Ajouter nouveau Utilisateur
	 * @param user
	 * @return
	 */
	public User add(User user);
	
	
	/**
	 * Methode Modifier Utilisateur
	 * @param user
	 * @return
	 */
	public User edit(User user);
	
	
	/**
	 * Methode Supprimer un utilisateur
	 * @param user
	 */
	public void delete(User user);
	
	
	/**
	 * Methode Afficher liste des utilisateurs
	 * @return
	 */
	public List<User> getAll();
	
	
	/**
	 * Methode get un utilisateur par id
	 * @param id
	 * @return
	 */
	public Optional<User> find(Long id);
	
}
