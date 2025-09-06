package exceptions;


import dto.Message;

public class InvalidParameterException extends BaseException {

    public InvalidParameterException(Message message) {
        super(message);
    }
}