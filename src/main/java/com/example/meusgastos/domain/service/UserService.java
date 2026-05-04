package com.example.meusgastos.domain.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.meusgastos.domain.exception.ResourceBadRequest;
import com.example.meusgastos.domain.exception.ResourceNotFoundExeption;
import com.example.meusgastos.domain.model.User;
import com.example.meusgastos.domain.repository.UserRepository;
import com.example.meusgastos.dto.user.UserRequestDto;
import com.example.meusgastos.dto.user.UserResponseDto;

@Service
public class UserService implements ICRUDservice<UserRequestDto, UserResponseDto> {

    private final UserRepository userRepository;

    @Autowired
    private ModelMapper mapper;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserResponseDto> getAll() {
        return userRepository.findAll()
                .stream()
                .map(user -> new UserResponseDto(
                        user.getId(),
                        user.getName(),
                        user.getEmail(),
                        user.getDisabledData(),
                        user.getPhotoUrl()))
                .toList();
    }

    @Override
    public UserResponseDto getById(String id) {
        Optional<User> optUser = userRepository.findById(id);
        if (optUser.isEmpty()) {
            throw new ResourceNotFoundExeption("Não deu bom");
        }

        User user = optUser.get();
        return new UserResponseDto(
                user.getId(),
                user.getName(),
                user.getEmail(),
                user.getDisabledData(),
                user.getPhotoUrl());
    }

    @Override
    public UserResponseDto create(UserRequestDto dto) {
        User user = new User();
        user.setName(dto.name());
        user.setEmail(dto.email());
        user.setPassword(dto.password());
        user.setPhotoUrl(dto.photoUrl());

        // codificar senha
        User userSaved = userRepository.save(user);

        return new UserResponseDto(
                userSaved.getId(),
                userSaved.getName(),
                userSaved.getEmail(),
                userSaved.getDisabledData(),
                userSaved.getPhotoUrl());

    }

    @Override
    public UserResponseDto update(String id, UserRequestDto dto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void update(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

}
