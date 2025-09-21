package com.home.cards.services;

import com.home.cards.dtos.CardDTO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;

public interface CardsService {
    void createCard(@Valid @Pattern(regexp="(^$|[0-9]{10})",message = "Mobile number must be 10 digits") String mobileNumber);

    CardDTO fetchCard(@Pattern(regexp="(^$|[0-9]{10})",message = "Mobile number must be 10 digits") String mobileNumber);

    boolean updateCard(@Valid CardDTO cardDTO);

    boolean deleteCard(@Pattern(regexp="(^$|[0-9]{10})",message = "Mobile number must be 10 digits") String mobileNumber);
}
