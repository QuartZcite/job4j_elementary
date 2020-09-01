package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User user = new User(null, false);
        for (int i = 0; i < users.length; i++) {
            if (users[i].getUsername().equals(login)) {
                user = users[i];
                break;
            } else {
                throw new UserNotFoundException("User not found");
            }
        }
        return user;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.getUsername().length() < 3) {
            throw new UserInvalidException("User is invalid, Value is less 3 symbols");
        }
        if (!user.isValid()) {
            throw new UserInvalidException("User is invalid, Used is deny");
        }
        return true;
    }

    public static void main(String[] args) {
        try {
            User[] users = {new User("Gocha", true)};
            User user = findUser(users, "Gocha");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException a) {
            a.printStackTrace();
        } catch (UserNotFoundException b) {
            b.printStackTrace();
        }
    }
}