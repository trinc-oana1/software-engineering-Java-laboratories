package isp.lab6.exercise3;
import java.util.HashSet;
import java.util.Set;

public class LoginSystem {
    private Set<User> users;
    private OnlineStore store;

    public  LoginSystem(OnlineStore store) {
        users = new HashSet<>();
        this.store = store;}


    public OnlineStore getStore() {return store;}
    public void setStore(OnlineStore store) {this.store = store;}


     public void register(String user, String password){
        users.add(new User(user, password));
     }


     public boolean login(String user, String password){
        for(User users: users)
            if(users.getPassword().equals(password) && users.getUsername().equals(users));
        System.out.println("Login completed!");
        store.addSession(user);
        return true;
     }

     public  boolean logout(String username)
     {
         for(User user:users)
             if(user.getUsername().equals(username))
             {
                 System.out.println("Logout completed!");
                 store.removeSession(username);
                 return true;
             }
         System.out.println("No such user is logged in!");
         return  false;
     }
}
