package exceptions;

import uz.letstrip.userservice.dto.Message;


public class IllegalArgumentException extends BaseException {

    public IllegalArgumentException(Message message) {
        super(message);
    }
}