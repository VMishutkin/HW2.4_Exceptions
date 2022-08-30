public class Main {
    public static void main(String[] args) {
        authMethod("java_sky:proasdjhdf","Bag222333_","Bag222333_");
    }

    private static boolean authMethod(String login, String password, String confirmPassword){
        try{
            if(!login.matches("\\w{1,20}")){
                throw new WrongLoginException();
            }
           if(!password.matches("\\w{1,19}")){
                throw new WrongPasswordException();
            }
           if (!password.equals(confirmPassword)){
               throw new WrongConfirmPasswordException();
           }
            System.out.println("Доступ разрешен");
           return true;
        }catch (WrongLoginException e){
            System.out.println("Логин должен содержать в себе только латинские буквы, цифры и знак подчеркивания. Длина логина до 20 символов");
            return false;
        }catch (WrongPasswordException e){
            System.out.println("Пароль должен содержать в себе только латинские буквы, цифры и знак подчеркивания. Длина пароля меньше 20 символов");
            return false;
        }catch (WrongConfirmPasswordException e){
            System.out.println("Пароли не совпадают");
            return false;
        }


    }
}