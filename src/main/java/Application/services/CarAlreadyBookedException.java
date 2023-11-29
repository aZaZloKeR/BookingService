package Application.services;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class CarAlreadyBookedException extends RuntimeException {
    public CarAlreadyBookedException(String message) {
        super(message);
    }
}
