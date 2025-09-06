package exceptions;


import dto.Message;

public class IllegalArgumentException extends BaseException {

    public IllegalArgumentException(Message message) {
        super(message);
    }
}