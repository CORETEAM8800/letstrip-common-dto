package exceptions;

import uz.letstrip.userservice.dto.Message;

public class ItemNotFoundException extends BaseException {

    public ItemNotFoundException(Message message) {
        super(message);
    }
}