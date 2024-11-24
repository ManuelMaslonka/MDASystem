package com.maslonka.mda.system.account.domain.mapper;

import com.maslonka.mda.system.account.domainapi.account.dto.TypeOfAccountDomainDto;
import com.maslonka.mda.system.account.domain.account.TypeOfAccount;

public interface TypeOfAccountDomainMapper {

    static TypeOfAccountDomainDto toDto(TypeOfAccount typeOfAccount) {
        return TypeOfAccountDomainDto.valueOf(typeOfAccount.name());
    }

    static TypeOfAccount toEntity(TypeOfAccountDomainDto typeOfAccount) {
        return TypeOfAccount.valueOf(typeOfAccount.name());
    }

}
