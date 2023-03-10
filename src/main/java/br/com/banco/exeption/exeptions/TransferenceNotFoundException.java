package br.com.banco.exeption.exeptions;

import br.com.banco.dto.request.FilterRequestDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class TransferenceNotFoundException extends Throwable {

    public TransferenceNotFoundException() {
        super("Nenhuma transferĂȘncia encontrada para esta conta.");
    }

    public TransferenceNotFoundException(final FilterRequestDTO filter) {
        super("Nenhuma transferĂȘncia encontrada para este filtro nesta conta.");
    }
}