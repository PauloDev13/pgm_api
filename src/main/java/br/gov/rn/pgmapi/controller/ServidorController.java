package br.gov.rn.pgmapi.controller;

import br.gov.rn.pgmapi.dto.ServidorRequestDTO;
import br.gov.rn.pgmapi.dto.ServidorResponseDTO;
import br.gov.rn.pgmapi.service.ServidorService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/servidores")
@RequiredArgsConstructor
@Tag(name = "Servidor", description = "API de gestão de servidores")
public class ServidorController {
    private final ServidorService servidorService;

    @PostMapping
    @Operation(summary = "Criar novo funcionário")
    public ResponseEntity<ServidorResponseDTO> create(@RequestBody @Valid ServidorRequestDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(servidorService.create(dto));
    }

    @GetMapping
    @Operation(summary = "Listar funcionários com paginação")
    public ResponseEntity<Page<ServidorResponseDTO>> findAll(Pageable pageable) {
        return ResponseEntity.ok(servidorService.findAll(pageable));
    }

    @GetMapping("/{id}")
    @Operation(summary = "Buscar servidor por ID")
    public ResponseEntity<ServidorResponseDTO> findById(@PathVariable Integer id) {
        return ResponseEntity.ok(servidorService.findById(id));
    }

    @PutMapping("/{id}")
    @Operation(summary = "Atualizar servidor existente")
    public ResponseEntity<ServidorResponseDTO> update(
            @PathVariable Integer id, @RequestBody @Valid ServidorRequestDTO dto) {
        return ResponseEntity.ok(servidorService.update(id, dto));
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Remover servidor")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        servidorService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
