package br.gov.rn.pgmapi.mapper;

import br.gov.rn.pgmapi.dto.VinculoRequestDTO;
import br.gov.rn.pgmapi.dto.VinculoResponseDTO;
import br.gov.rn.pgmapi.entity.Vinculo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface VinculoMapper {
    Vinculo toEntity(VinculoRequestDTO dto);
    VinculoResponseDTO toDto(Vinculo entity);
    
}
