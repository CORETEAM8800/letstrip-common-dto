package exceptions;


import dto.Message;

public class ItemNotFoundException extends BaseException {

    public ItemNotFoundException(Message message) {
        super(message);
    }
}