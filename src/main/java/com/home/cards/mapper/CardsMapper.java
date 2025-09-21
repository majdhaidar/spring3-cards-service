package com.home.Card.mapper;


import com.home.cards.dtos.CardDTO;
import com.home.cards.entity.Card;

public class CardsMapper {

    public static CardDTO mapToCardDTO(Card Card, CardDTO CardDTO) {
        CardDTO.setCardNumber(Card.getCardNumber());
        CardDTO.setCardType(Card.getCardType());
        CardDTO.setMobileNumber(Card.getMobileNumber());
        CardDTO.setTotalLimit(Card.getTotalLimit());
        CardDTO.setAvailableAmount(Card.getAvailableAmount());
        CardDTO.setAmountUsed(Card.getAmountUsed());
        return CardDTO;
    }

    public static Card mapToCard(CardDTO CardDTO, Card Card) {
        Card.setCardNumber(CardDTO.getCardNumber());
        Card.setCardType(CardDTO.getCardType());
        Card.setMobileNumber(CardDTO.getMobileNumber());
        Card.setTotalLimit(CardDTO.getTotalLimit());
        Card.setAvailableAmount(CardDTO.getAvailableAmount());
        Card.setAmountUsed(CardDTO.getAmountUsed());
        return Card;
    }
}
