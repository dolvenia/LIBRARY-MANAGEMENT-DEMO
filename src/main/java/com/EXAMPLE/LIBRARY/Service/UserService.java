package com.EXAMPLE.LIBRARY.Service;


import com.EXAMPLE.LIBRARY.DTO.UserBookDTO;
import com.EXAMPLE.LIBRARY.model.User;
import com.EXAMPLE.LIBRARY.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;
import static org.springframework.data.repository.util.ReactiveWrapperConverters.map;


@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public List<UserBookDTO> getAllUserBooks() {
        List<User> users= userRepo.findAll();
        List<UserBookDTO> userBookDTOS = users.stream()
                .map(this::convertEntityToDTO)
                .collect(Collectors.toList());
        System.out.println(userBookDTOS.toString());
    return  userBookDTOS;
    }

    private UserBookDTO convertEntityToDTO(User user){
        UserBookDTO userBookDTO = new UserBookDTO();
        userBookDTO.setId(user.getId());
        userBookDTO.setEmail(user.getEmail());
        userBookDTO.setFirstName(user.getFirstName());
        userBookDTO.setLastName(user.getLastName());

        return userBookDTO;
    }
}
