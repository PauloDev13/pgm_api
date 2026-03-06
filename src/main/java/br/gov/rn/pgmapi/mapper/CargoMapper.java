package br.gov.rn.pgmapi.mapper;

import br.gov.rn.pgmapi.dto.CargoRequestDTO;
import br.gov.rn.pgmapi.dto.CargoResponseDTO;
import br.gov.rn.pgmapi.entity.Cargo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CargoMapper {
    Cargo toEntity(CargoRequestDTO dto);
    CargoResponseDTO toDto(Cargo entity);
    
}
