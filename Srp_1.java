package com.company;


class AccountService{
    AccountRepository repo=new AccountRepository();
    Notification notify = new Notification();

    public void openAccount(){
        System.out.println("fill account details");
        repo.create();
        notify.send();
    }

}
class AccountRepository{
    public void create(){
        System.out.println("store acc details in database");
    }
}
class Notification{
    public void send(){
        System.out.println("send the notification to user");
    }
}


public class Srp_1 {

    public static void main(String[] args) {
	    AccountService service = new AccountService();
        service.openAccount();
    }
}
