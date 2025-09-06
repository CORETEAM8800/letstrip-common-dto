package exceptions;

import dto.Message;
import lombok.AllArgsConstructor;
import lombok.Setter;

/**
 * @Author javohir
 * @Date 24/03/2024
 */
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