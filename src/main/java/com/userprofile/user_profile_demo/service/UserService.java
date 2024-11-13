package com.userprofile.user_profile_demo.service;

import com.userprofile.user_profile_demo.domain.User;
import com.userprofile.user_profile_demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    // Salva um novo usuário
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    // Busca todos os usuários
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Busca um usuário pelo ID
    public Optional<User> getUserById(String id) {
        return userRepository.findById(id);
    }

    // Atualiza um usuário existente
    public Optional<User> updateUser(String id, User userDetails) {
        return userRepository.findById(id).map(existingUser -> {
            existingUser.setName(userDetails.getName());
            existingUser.setEmail(userDetails.getEmail());
            existingUser.setPassword(userDetails.getPassword());
            existingUser.setProfile_image(userDetails.getProfile_image());
            return userRepository.save(existingUser);
        });
    }

    // Exclui um usuário pelo ID
    public boolean deleteUser(String id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
