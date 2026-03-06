package br.gov.rn.pgmapi.mapper;

import br.gov.rn.pgmapi.dto.StatusRequestDTO;
import br.gov.rn.pgmapi.dto.StatusResponseDTO;
import br.gov.rn.pgmapi.entity.Status;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StatusMapper {
    Status toEntity(StatusRequestDTO dto);
    StatusResponseDTO toDto(Status entity);
    
}
