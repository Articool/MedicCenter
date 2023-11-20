package ru.medcenter.builders;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class TestDataBuilder {
    private final String login;
    private final String password;
    private final String searchText;
    private final String selectedTime;
    private final String clientCode;
}
