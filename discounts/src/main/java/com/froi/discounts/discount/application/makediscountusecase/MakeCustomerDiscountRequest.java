package com.froi.discounts.discount.application.makediscountusecase;

import com.froi.discounts.discount.domain.Discount;
import lombok.Value;

import java.time.LocalDate;

@Value
public class MakeCustomerDiscountRequest {
    String customerNit;
    String description;
    String startDate;
    String endDate;
    String discountType;

    public Discount toDomain() {
        return Discount.builder()
                .customerNit(customerNit)
                .description(description)
                .startDate(LocalDate.parse(startDate))
                .endDate(LocalDate.parse(endDate))
                .build();
    }
}

