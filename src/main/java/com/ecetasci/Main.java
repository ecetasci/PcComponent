package com.ecetasci;

import com.ecetasci.entity.User;
import com.ecetasci.repository.UserRepository;

public class Main {
    public static void main(String[] args) {

        User user = User.builder()
                .ad("ece")
                .adres("rize")
                .telefon("531")
                .yas(28)
                .build();

        UserRepository userRepository = new UserRepository();
        userRepository.save(user);



    }
}