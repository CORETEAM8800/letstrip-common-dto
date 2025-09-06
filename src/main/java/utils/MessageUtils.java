package utils;


import dto.Message;

public class MessageUtils {
    public static final Message OTP_INVALID = new Message("Tasdiqlash kodi muddati tugagan yoki yaroqsiz. Qaytadan urinib kuring", "OTP is expired or invalid. Please try again", "Срок действия OTP истек или он недействителен. Пожалуйста, попробуйте еще раз");
    public static final Message OTP_EXPIRED = new Message("Tasdiqlash kodi muddati tugagan. Qaytadan urinib kuring", "OTP is expired. Please try again", "Срок действия OTP истек. Пожалуйста, попробуйте еще раз");
    public static final Message OTP_TYPE_IS_INVALID = new Message("Bu tasdiqlash kodi yaroqsiz. Boshqa maqsadda junatilgan", "This verification code is invalid. Intended for another purpose", "Этот код подтверждения недействителен. Предназначен для другой цели");


    public static final Message USER_NOT_FOUND = new Message("Foydalanuvchi topilmadi", "User not found with this login", "Пользователь не найден с этим логином");

    public static final Message DEVICE_NOT_FOUND = new Message("Foydalanuvchining qurilmasi hali ro'yxatga olinmagan!", "User device has not been registered yet!", "Устройство пользователя еще не зарегистрировано!");

    public static final Message USER_ALREADY_EXISTS = new Message("Ushbu login bilan foydalanuvchi mavjud", "User already exists with this login", "Пользователь уже существует с этим логином");

    public static final Message USER_ALREADY_CONFIRMED = new Message("Ushbu login bilan foydalanuvchi hisobi faollashtirilgan", "The user account is activated with this login", "Учетная запись пользователя активируется с этим логином");

    public static final Message USER_STATUS_BLOCKED = new Message("Foydalanuvchi bloklangan", "User is blocked", "Пользователь заблокирован");

    public static final Message USER_STATUS_DELETED = new Message("Foydalanuvchi hisobi uchirilgan", "User account is deleted", "Аккаунт пользователя удален");


    public static final Message INVALID_EMAIL = new Message("Elektron pochta orqali ro'yxatdan o'tish uchun elektron pochta manzili yaroqsiz", "Email is invalid for register with email.", "Электронная почта недействительна для регистрации по электронной почте.");


    public static final Message PASSWORD_INVALID = new Message("Parol yaroqsiz. Kamida 8 ta belgidan iborat bo'lishi kerak", "Password is invalid at least 8 characters long", "Пароль недействителен должен быть не менее 8 символов");

    public static final Message LOGIN_OR_PASSWORD_INVALID = new Message("Login yoki parol yaroqsiz", "Login or password is invalid", "Логин или пароль недействителен");

    public static final Message OLD_PASSWORD_INVALID = new Message("Eski parol yaroqsiz", "Old password is invalid", "Старый пароль недействителен");

    public static final Message COULD_NOT_CONNECT_NOTIFICATION_SERVICE = new Message("Notification service  bilan ulanishda muammo yuz berdi", "Could not connect to notification service", "Не удалось подключиться к службе уведомлений");

    public static final Message INVALID_RESET_PASSWORD_PROCESS = new Message("Token yaroqsiz", "Token is invalid", "Token недействителен");

    public static final Message RESOURCE_NOT_FOUND = new Message("RESOURCE TOPILMADI", "No static resource found", "Ресурс не найден");

    public static final Message INVALID_INPUT = new Message("Xato malumot kiritildi", "Invalid input", "Неверный Ввод");

    public static final Message COULD_NOT_LOGOUT = new Message("Tizimda chiqishda xatolik yo'zaga keldi. Qaytadan o'rinib ko'ring", "Could not logout please try again", "Не удалось выйти, пожалуйста, попробуйте еще раз");
    public static final Message USER_DIDNT_ASSIGN_WITH_THIS_DEVICE = new Message("Siz bu device orqali hisobingizga kirmagansiz", "This user didn't assign with this device", "Этот пользователь не назначен на это устройство");

    public static final Message INTERNAL_SERVER_ERROR = new Message(
            "Serverdagi ichki xatolik. Iltimos, administratorga murojaat qiling.",
            "Internal server error. Please contact the administrator.",
            "Внутренняя ошибка сервера. Пожалуйста, свяжитесь с администратором.");

    public static final Message ACCESS_DENIED = new Message(
            "Ruxsat berilmagan API ga murojaat qildingiz",
            "Access denied for this API",
            "Доступ запрещен для этого API");
    public static final Message USER_IMAGE_NOT_FOUND = new Message("Foydalanuvchi shaxsiy sahifasiga rasm joylanmagan", "User image not found in user profile", "Изображение пользователя не найдено в профиле пользователя");
    public static final Message APPLICATION_STOPPED_IN_TERMINAL = new Message("Application tuxtatildi", "Application stopped", "Приложение остановлено");
    public static final Message COULD_NOT_DELETE_FILE = new Message("Faylni o'chirib bo'lmadi", "Could not delete file", "Не удалось удалить файл");
    public static final Message INVALID_FIRST_GIFT_TO_THIS_USER = new Message("Birinchi bonus bu user uchun amal qilmaydi.", "The first bonus is not valid for this user.", "Первый бонус недействителен для этого пользователя");

    public static final Message ALREADY_CHANGED_FIRST_GIFT = new Message("Bu userga birinchi bonus allaqachon berilgan", "The first bonus has already been given to this user", "Первый бонус уже выдан этому пользователю");
    public static final Message OTP_TOO_MANY_REQUEST =  new Message( "Too many OTP requests. Please wait before requesting again.","Too many OTP requests. Please wait before requesting again.","Слишком много запросов OTP. Пожалуйста, подождите, прежде чем попросить снова");
}