package exceptions;

import uz.letstrip.userservice.dto.Message;

public class InvalidParameterException extends BaseException {

    public InvalidParameterException(Message message) {
        super(message);
    }
}