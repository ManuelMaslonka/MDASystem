package sk.maslonka.mda.system.account.domain.mapper;

import com.maslonka.mda.system.account.domainapi.dto.TypeOfAccountDomainDto;
import sk.maslonka.mda.system.account.domain.account.TypeOfAccount;

public abstract class TypeOfAccountDomainMapper {

    public static TypeOfAccountDomainDto toDto(TypeOfAccount typeOfAccount) {
        return TypeOfAccountDomainDto.valueOf(typeOfAccount.name());
    }

    public static TypeOfAccount toEntity(TypeOfAccountDomainDto typeOfAccount) {
        return TypeOfAccount.valueOf(typeOfAccount.name());
    }

}
