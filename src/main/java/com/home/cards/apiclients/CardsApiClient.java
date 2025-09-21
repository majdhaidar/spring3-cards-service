package com.home.cards.apiclients;

import com.home.cards.dtos.CardDTO;
import com.home.cards.dtos.common.ResponseDTO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Validated
public interface CardsApiClient {
    ResponseEntity<ResponseDTO> createCard(@Valid @RequestParam
                                           @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
                                           String mobileNumber);

    ResponseEntity<CardDTO> fetchCardDetails(@RequestParam
                                             @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
                                             String mobileNumber);

    ResponseEntity<ResponseDTO> updateCardDetails(@Valid @RequestBody CardDTO cardsDto);

    ResponseEntity<ResponseDTO> deleteCardDetails(@RequestParam
                                                  @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
                                                  String mobileNumber);
}
