package exceptions;

import dto.Message;
import lombok.AllArgsConstructor;
import lombok.Setter;


@Setter
@AllArgsConstructor
public abstract class BaseException extends RuntimeException {
    private final Message message;

    public String message() {
        return super.getMessage();
    }

    public Message getCustomMessage() {
        return message;
    }
}